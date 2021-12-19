package de.hs_mannheim.informatik.se2.github_actions;

public class Main {

	public static void main(String[] args) {
		Navigation navi = new Navigation();
		boolean ergebnis = navi.routeBerechnen("Desloch");
		System.out.println(ergebnis);
	}
}
