package controller;

public class NavActions {

	String nav;

	public String gotoMain() {
		nav = "main";
		System.out.println(nav);
		return nav;
	}

	public String gotoMap() {
		nav = "map";
		System.out.println(nav);
		return nav;
	}

	public String getNav() {
		return nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}

}
