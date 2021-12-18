package de.hs_mannheim.informatik.se2.github_actions;

import java.util.ArrayList;


public class Song {
	private String title;

	public Song(String title) {
		this.title = title;
	}

	public String toString() {
		return "SONG: " + title;
	}

	static void Song() {
		{
			ArrayList<Song> songs = new ArrayList<Song>();

			songs.add(new Song("Songtitel1"));
			songs.add(new Song("Songtitel2"));

			for (Song s : songs) {
				System.out.println(s);

			}
		}
	}

	public static void main(String[] args) {
		Song();
	}

}

