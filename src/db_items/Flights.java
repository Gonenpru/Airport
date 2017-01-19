/*
 * 
 */
package db_items;
// Generated 04-ene-2017 11:51:08 by Hibernate Tools 5.1.0.Alpha1

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


// TODO: Auto-generated Javadoc
/**
 * Flights generated by hbm2java.
 */

@Entity
@Table(name="Flights")
public class Flights implements java.io.Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The plane name. */
	@Transient
	private String plane_name;
	
	/** The gate name. */
	@Transient
	private String gate_name;
	
	/** The route name. */
	@Transient
	private String route_name;
	
	/** The airline name. */
	@Transient
	private String airline_name;
	
	/** The id. */
	@Id
	@Column(name="id")
	private int id;
	
	/** The baggage id. */
	@Column(name="baggage_id")
	private int baggage_id;
	
	/** The gate id. */
	@Column(name="gate_id")
	private int gate_id;
	
	/** The plane id. */
	@Column(name="plane_id")
	private int plane_id;
	
	/** The route id. */
	@Column(name="route_id")
	private int route_id;
	
	/** The duration. */
	@Column(name="duration")
	private String duration;
	
	/** The delay. */
	@Column(name="delay")
	private String delay;
	
	/** The date departure. */
	@Column(name="date_departure")
	private Timestamp dateDeparture;
		
	/**
	 * Instantiates a new flights.
	 */
	public Flights() {
	}

	/**
	 * Instantiates a new flights.
	 *
	 * @param id the id
	 * @param baggages the baggages
	 * @param gates the gates
	 * @param planes the planes
	 * @param routes the routes
	 */
	public Flights(int id, int baggages, int gates, int planes, int routes) {
		this.id = id;
		this.baggage_id = baggages;
		this.gate_id = gates;
		this.plane_id = planes;
		this.route_id = routes;
	}

	/**
	 * Instantiates a new flights.
	 *
	 * @param id the id
	 * @param baggages the baggages
	 * @param gates the gates
	 * @param planes the planes
	 * @param routes the routes
	 * @param duration the duration
	 * @param delay the delay
	 * @param dateDeparture the date departure
	 */
	public Flights(int id, int baggages, int gates, int planes, int routes, String duration,
			String delay, Timestamp dateDeparture) {
		this.id = id;
		this.baggage_id = baggages;
		this.gate_id = gates;
		this.plane_id = planes;
		this.route_id = routes;
		this.duration = duration;
		this.delay = delay;
		this.dateDeparture = dateDeparture;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return this.id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the baggage id.
	 *
	 * @return the baggage id
	 */
	public int getBaggage_id() {
		return baggage_id;
	}

	/**
	 * Sets the baggage id.
	 *
	 * @param baggage_id the new baggage id
	 */
	public void setBaggage_id(int baggage_id) {
		this.baggage_id = baggage_id;
	}

	/**
	 * Gets the gate id.
	 *
	 * @return the gate id
	 */
	public int getGate_id() {
		return gate_id;
	}

	/**
	 * Sets the gate id.
	 *
	 * @param gate_id the new gate id
	 */
	public void setGate_id(int gate_id) {
		this.gate_id = gate_id;
	}

	/**
	 * Gets the plane id.
	 *
	 * @return the plane id
	 */
	public int getPlane_id() {
		return plane_id;
	}

	/**
	 * Sets the plane id.
	 *
	 * @param plane_id the new plane id
	 */
	public void setPlane_id(int plane_id) {
		this.plane_id = plane_id;
	}

	/**
	 * Gets the route id.
	 *
	 * @return the route id
	 */
	public int getRoute_id() {
		return route_id;
	}

	/**
	 * Sets the route id.
	 *
	 * @param route_id the new route id
	 */
	public void setRoute_id(int route_id) {
		this.route_id = route_id;
	}

	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public String getDuration() {
		return this.duration;
	}

	/**
	 * Sets the duration.
	 *
	 * @param duration the new duration
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * Gets the delay.
	 *
	 * @return the delay
	 */
	public String getDelay() {
		return this.delay;
	}

	/**
	 * Sets the delay.
	 *
	 * @param delay the new delay
	 */
	public void setDelay(String delay) {
		this.delay = delay;
	}

	/**
	 * Gets the date departure.
	 *
	 * @return the date departure
	 */
	public Timestamp getDateDeparture() {
		return this.dateDeparture;
	}

	/**
	 * Sets the date departure.
	 *
	 * @param dateDeparture the new date departure
	 */
	public void setDateDeparture(Timestamp dateDeparture) {
		this.dateDeparture = dateDeparture;
	}

	/**
	 * Gets the plane name.
	 *
	 * @return the plane name
	 */
	public String getPlane_name() {
		return plane_name;
	}

	/**
	 * Sets the plane name.
	 *
	 * @param plane_name the new plane name
	 */
	public void setPlane_name(String plane_name) {
		this.plane_name = plane_name;
	}

	/**
	 * Gets the gate name.
	 *
	 * @return the gate name
	 */
	public String getGate_name() {
		return gate_name;
	}

	/**
	 * Sets the gate name.
	 *
	 * @param gate_name the new gate name
	 */
	public void setGate_name(String gate_name) {
		this.gate_name = gate_name;
	}

	/**
	 * Gets the route name.
	 *
	 * @return the route name
	 */
	public String getRoute_name() {
		return route_name;
	}

	/**
	 * Sets the route name.
	 *
	 * @param route_name the new route name
	 */
	public void setRoute_name(String route_name) {
		this.route_name = route_name;
	}

	/**
	 * Gets the airline name.
	 *
	 * @return the airline name
	 */
	public String getAirline_name() {
		return airline_name;
	}

	/**
	 * Sets the airline name.
	 *
	 * @param airline_name the new airline name
	 */
	public void setAirline_name(String airline_name) {
		this.airline_name = airline_name;
	}
	
	
}