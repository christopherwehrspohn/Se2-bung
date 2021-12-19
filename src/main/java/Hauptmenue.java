import java.util.ArrayList;


public class Hauptmenue {
	
	static ArrayList<String> Hauptmenue = new ArrayList<String>();
	
	public static void main(String args[]) {
		hinzufuegen("Navigation");
		hinzufuegen("Radio");
		hinzufuegen("Sitzeinstellung");
	}
	
	public static void hinzufuegen(String menue) {
		Hauptmenue.add(menue);
	}

	public static boolean auswählen(String untermenue) {
		boolean menueVorhanden=false;
		for(String a : Hauptmenue) {
			if(a==untermenue)
				menueVorhanden=true;
		}
		return menueVorhanden;
	}

}
