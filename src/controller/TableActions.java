package controller;

import java.util.List;

import dao.FlightsDAO;
import db_items.Flights;

public class TableActions{

	public String nav;
	private Flights flights;
	private List<Flights> flightsList;
	private FlightsDAO flightsDao;
	private int id;


	public String gotoArrive() {
		flights = new Flights();
		flightsDao = new FlightsDAO();
		flightsList = flightsDao.listArrivals();
		
		nav = "arrive";
		System.out.println(nav);
		return nav;
	}

	public String gotoDepart() {
		flights = new Flights();
		flightsDao = new FlightsDAO();
		flightsList = flightsDao.listDepartures();
		
		nav = "depart";
		System.out.println(nav);
		return nav;
	}

	public String getNav() {
		return nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}

	public Flights getFlights() {
		return flights;
	}

	public void setFlights(Flights flights) {
		this.flights = flights;
	}

	public List<Flights> getFlightsList() {
		return flightsList;
	}

	public void setFlightsList(List<Flights> flightsList) {
		this.flightsList = flightsList;
	}

	public FlightsDAO getFlightsDao() {
		return flightsDao;
	}

	public void setFlightsDao(FlightsDAO flightsDao) {
		this.flightsDao = flightsDao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}	

}
