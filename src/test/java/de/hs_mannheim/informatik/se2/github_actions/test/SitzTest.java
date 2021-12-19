package de.hs_mannheim.informatik.se2.github_actions.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import de.hs_mannheim.informatik.se2.github_actions.Sitz;

class SitzTest {

	@Test
	void testSitzeinstellungAnzeigen() {
		Sitz sitz = new Sitz("Rechts");
		
		assertEquals("Sitzheizung1", sitz.getSitzeinstellungen().get(0));
		assertEquals("Sitzkühlung1", sitz.getSitzeinstellungen().get(3));
		assertNotEquals("Sitzheizung1", sitz.getSitzeinstellungen().get(2));
	}

}
