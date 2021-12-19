package de.hs_mannheim.informatik.se2.github_actions;

import java.util.ArrayList;

public class Sitz {

	private String position;

	public Sitz(String position) {
		this.position = position;
	}

	public ArrayList<String> getSitzeinstellungen() {
		ArrayList<String> Sitzeinstellungen = new ArrayList<String>();
		
		String sitzheizung1 = "Sitzheizung1";
		String sitzheizung2 = "Sitzheizung2";
		String sitzheizung3 = "Sitzheizung3";
		
		String sitzkuehlung1 = "Sitzkühlung1";
		String sitzkuehlung2 = "Sitzkühlung2";
		String sitzkuehlung3 = "Sitzkühlung3";
		
		Sitzeinstellungen.add(sitzheizung1);
		Sitzeinstellungen.add(sitzheizung2);
		Sitzeinstellungen.add(sitzheizung3);
		Sitzeinstellungen.add(sitzkuehlung1);
		Sitzeinstellungen.add(sitzkuehlung2);
		Sitzeinstellungen.add(sitzkuehlung3);
		
		return Sitzeinstellungen;
		
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getPosition() {
		return position;
	}

}