package de.hs_mannheim.informatik.se2.github_actions.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.hs_mannheim.informatik.se2.github_actions.Sitz;

class SitzTest {

	@Test
	void testSitztemperaturAnzeigen() {
		Sitz sitz = new Sitz("Rechts");
		
		assertEquals("Sitzheizung1", sitz.getSitztemperatur().get(0));
		assertEquals("Sitzkühlung1", sitz.getSitztemperatur().get(3));
		assertNotEquals("Sitzheizung1", sitz.getSitztemperatur().get(2));
	}
	
	@Test
	void testSitzprofilAnzeigen() {
		Sitz sitz = new Sitz("Links");
		
		assertEquals("Profil1", sitz.getSitzprofil().get(0));
		assertEquals("Profil2", sitz.getSitzprofil().get(1));
		assertNotEquals("Profil3", sitz.getSitzprofil().get(1));
	}

}
