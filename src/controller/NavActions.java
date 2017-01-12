package controller;

public class NavActions {
	
	String nav;
	
	public String gotoMain() {
		nav = "main";
		System.out.println(nav);
		return nav;
	}
	public String gotoArrive() {
		nav = "arrive";
		System.out.println(nav);
		return nav;
	}
	public String gotoDepart() {
		nav = "depart";
		System.out.println(nav);
		return nav;
	}
	public String gotoFinder() {
		nav = "find";
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
