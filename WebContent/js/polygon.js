function chargeMap() {
    charge_Poly_data('PolygonCoord.csv');
}

function charge_Poly_data(strCsv) {
    d3.csv("data/csv/" + strCsv, function(values) {
        data = values.map(function(d) {
            poly = d.Polygon;
            return {
                "poly": poly
            };
        });
        create_map(data);
    });
}

function create_map(data) {

    var coord = [];
    var polyCoord = [[]];
    var PistaAterrizar = [], CurvaAterrizar = [], PistaPreTerminal = [],
        PistaDespegue = [], PistaAftTerminal = [], CurvaDespegue = [],
        Terminal1 = [];
    var polyCoordsPistaAterrizar1 = [];

    for (var i = 0; i < data.length; i++) {
        coord.splice(i, 0, data[i].poly.split(' '));
    }

    var imageLayer = new ol.layer.Image({
        source: new ol.source.ImageVector({
            source: new ol.source.Vector({
                features: [
                    polygonFeatures(polyCoord, coord)
                ]
            })
        })
    });
    var map = new ol.Map({
        layers: [
            new ol.layer.Tile({
                source: new ol.source.OSM()
            }),
            createVectorLayer(createPolygonFeature(PistaAterrizar,coord[0])),
            createVectorLayer(createPolygonFeature(CurvaAterrizar,coord[1])),
            createVectorLayer(createPolygonFeature(PistaPreTerminal,coord[2])),
            createVectorLayer(createPolygonFeature(PistaDespegue,coord[3])),
            createVectorLayer(createPolygonFeature(CurvaDespegue,coord[4])),
            createVectorLayer(createPolygonFeature(PistaAftTerminal,coord[5])),
            createVectorLayerTer(createPolygonFeature(Terminal1,coord[6]))
        ],
        target: 'map',
        controls: ol.control.defaults({
            attributionOptions: /** @type {olx.control.AttributionOptions} */ ({
                collapsible: false
            })
        }),
        view: new ol.View({
            center: ol.proj.fromLonLat([-0.461389, 51.4710]),
            zoom: 14
        })
    });
}

function polygonFeatures(polyCoord, coord) {
    for (var i = 0; i < coord.length; i++) {
        return createPolygonFeature(polyCoord[i], coord[i]);
    }
}

function createPolygonFeature(polyCoords, coords) {
    for (var i in coords) {
        var c = coords[i].split(',');
        polyCoords.push(ol.proj.transform([parseFloat(c[0]), parseFloat(c[1])], 'EPSG:4326', 'EPSG:3857'));
    }
    var polyFeature = new ol.Feature({
        geometry: new ol.geom.Polygon([polyCoords])
    });
    return polyFeature;
}

function createVectorLayer(polyFeature) {
    var vectorLayer = new ol.layer.Vector({
        source: new ol.source.Vector({
            features: [polyFeature]
        }),
        style: [
        new ol.style.Style({
            stroke: new ol.style.Stroke({
                color: 'rgba(175, 233, 255, 0.8)',
                width: 3
            }),
            fill: new ol.style.Fill({
                color: 'rgba(255, 25, 25, 0.7)'
            })
        })]
    });
    return vectorLayer;
}

function createVectorLayerTer(polyFeature) {
    var vectorLayer = new ol.layer.Vector({
        source: new ol.source.Vector({
            features: [polyFeature]
        }),
        style: [
        new ol.style.Style({
            stroke: new ol.style.Stroke({
                color: 'rgba(175, 233, 255, 0.8)',
                width: 3
            }),
            fill: new ol.style.Fill({
                color: 'rgba(176, 176, 176, 0.7)'
            })
        })]
    });
    return vectorLayer;
}
