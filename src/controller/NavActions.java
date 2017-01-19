/*
 * 
 */
package controller;

import utils.HibernateUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class NavActions.
 */
public class NavActions {

	/** The nav. */
	String nav;

	/**
	 * Goto main.
	 *
	 * @return the string
	 */
	public String gotoMain() {
		nav = "main";
		System.out.println(nav);
		return nav;
	}

	/**
	 * Goto map.
	 *
	 * @return the string
	 */
	public String gotoMap() {
		nav = "map";
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

}
