package de.hs_mannheim.informatik.se2.github_actions;

import java.util.ArrayList;

public class Navigation {

	public boolean routeBerechnen(String zielOrt) {
		
		ArrayList<String> sitzeinstellungen = new ArrayList<String>();
		
		sitzeinstellungen.add("Mannheim");
		sitzeinstellungen.add("Heidelberg");
		sitzeinstellungen.add("Meisenheim");
		sitzeinstellungen.add("Desloch");
		sitzeinstellungen.add("Eppingen");
		sitzeinstellungen.add("Meerbusch");

		if (sitzeinstellungen.contains(zielOrt)) {
			return true;
		} else {
			return false;
		}
	}
}
