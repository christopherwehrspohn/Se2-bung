package de.hs_mannheim.informatik.se2.github_actions;

import java.util.ArrayList;

public class Sitz {
	
	private String position;

	public Sitz(String position) {
		this.position = position;
	}

public boolean sitzEinstellen(String sitzeinstellung) {
	
	if (getSitztemperatur().contains(sitzeinstellung) || getSitzprofil().contains(sitzeinstellung)) {
		return true;
	} else {
		return false;
	}
}
	
	public ArrayList<String> getSitztemperatur() {
		ArrayList<String> sitzeinstellungen = new ArrayList<String>();
		
		String sitzheizung1 = "Sitzheizung1";
		String sitzheizung2 = "Sitzheizung2";
		String sitzheizung3 = "Sitzheizung3";
		
		String sitzkuehlung1 = "Sitzkühlung1";
		String sitzkuehlung2 = "Sitzkühlung2";
		String sitzkuehlung3 = "Sitzkühlung3";
		
		sitzeinstellungen.add(sitzheizung1);
		sitzeinstellungen.add(sitzheizung2);
		sitzeinstellungen.add(sitzheizung3);
		sitzeinstellungen.add(sitzkuehlung1);
		sitzeinstellungen.add(sitzkuehlung2);
		sitzeinstellungen.add(sitzkuehlung3);
		
		return sitzeinstellungen;
		
	}
	
	public ArrayList<String> getSitzprofil() {
		ArrayList<String> sitzeinstellungen = new ArrayList<String>();
		
		String profil1 = "Profil1";
		String profil2 = "Profil2";
		String profil3 = "Profil3";
		
		sitzeinstellungen.add(profil1);
		sitzeinstellungen.add(profil2);
		sitzeinstellungen.add(profil3);
		
		return sitzeinstellungen;
		
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getPosition() {
		return position;
	}

}
