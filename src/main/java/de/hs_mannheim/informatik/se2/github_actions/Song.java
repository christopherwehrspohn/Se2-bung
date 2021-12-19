package de.hs_mannheim.informatik.se2.github_actions;
import java.util.ArrayList;


public class Song {
	static ArrayList<String> Sender = new ArrayList<String>();

	public static String song() {

		String[] Song = new String[0];
		String Songtitle = Song[0];
		Song[0] = "Songtitel1";

		return Songtitle;
	}

	public static boolean auswählen(String sender1) {
		boolean sender = false;
		for (String a : Sender) {
			if (a == sender1)
				sender = true;
		}
		return sender;
	}

	public static void main(String[] args) {
		song();

	}
}
