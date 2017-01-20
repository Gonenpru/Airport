/*
 * 
 */
package controller;

import java.util.List;

import dao.FlightsDAO;
import db_items.Flights;

// TODO: Auto-generated Javadoc
/**
 * The Class TableActions.
 */
public class TableActions{

	/** The nav. */
	public String nav;
	
	/** The flights. */
	private Flights flights;
	
	/** The flights list. */
	private List<Flights> flightsList;
	
	/** The flights dao. */
	private FlightsDAO flightsDao;
	
	/** The id. */
	private int id;


	/**
	 * Goto arrive.
	 *
	 * @return the string
	 */
	public String gotoArrive() {
		flights = new Flights();
		flightsDao = new FlightsDAO();
		flightsList = flightsDao.listArrivals();
		
		nav = "arrive";
		System.out.println(nav);
		return nav;
	}

	/**
	 * Goto depart.
	 *
	 * @return the string
	 */
	public String gotoDepart() {
		flights = new Flights();
		flightsDao = new FlightsDAO();
		flightsList = flightsDao.listDepartures();
		
		nav = "depart";
		System.out.println(nav);
		return nav;
	}

	/**
	 * Gets the nav.
	 *
	 * @return the nav
	 */
	public String getNav() {
		return nav;
	}

	/**
	 * Sets the nav.
	 *
	 * @param nav the new nav
	 */
	public void setNav(String nav) {
		this.nav = nav;
	}

	/**
	 * Gets the flights.
	 *
	 * @return the flights
	 */
	public Flights getFlights() {
		return flights;
	}

	/**
	 * Sets the flights.
	 *
	 * @param flights the new flights
	 */
	public void setFlights(Flights flights) {
		this.flights = flights;
	}

	/**
	 * Gets the flights list.
	 *
	 * @return the flights list
	 */
	public List<Flights> getFlightsList() {
		return flightsList;
	}

	/**
	 * Sets the flights list.
	 *
	 * @param flightsList the new flights list
	 */
	public void setFlightsList(List<Flights> flightsList) {
		this.flightsList = flightsList;
	}

	/**
	 * Gets the flights dao.
	 *
	 * @return the flights dao
	 */
	public FlightsDAO getFlightsDao() {
		return flightsDao;
	}

	/**
	 * Sets the flights dao.
	 *
	 * @param flightsDao the new flights dao
	 */
	public void setFlightsDao(FlightsDAO flightsDao) {
		this.flightsDao = flightsDao;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}	

}
