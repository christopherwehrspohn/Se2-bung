package de.hs_mannheim.informatik.se2.github_actions.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import de.hs_mannheim.informatik.se2.github_actions.Navigation;

public class JUnitTests {
	   @Test
	    public void naviTesten()
	    {
		   	Navigation navi = new Navigation();
			boolean ergebnis = navi.routeBerechnen("Desloch");
			assertEquals(true, ergebnis);
	    }
}
