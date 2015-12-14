package WetterStation;

import Anzeige.AktuelleBedingungenAnzeige;
import WetterDaten.WetterDaten;

public class WetterStation {
	public static void main(String[] args) {
		WetterDaten wetterDaten = new WetterDaten();
		AktuelleBedingungenAnzeige aktuelleAnzeige = new AktuelleBedingungenAnzeige(wetterDaten);
		wetterDaten.setMesswerte(30, 65, 30.4f);	
	}
}
