package Anzeige;

import Beobachter.Beobachter;
import Subjekt.Subjekt;

public class AktuelleBedingungenAnzeige implements Beobachter, AnzeigeElement {
	private float temperatur;
	private float feuchtigkeit;
	private Subjekt wetterDaten;

	public AktuelleBedingungenAnzeige(Subjekt wetterDaten) {
		this.wetterDaten = wetterDaten;
		wetterDaten.registriereBeobachter(this);
	}

	@Override
	public void anzeigen() {
		System.out.println("AKtuelle Wetterbedinungen: " + temperatur + "Grad C und " + feuchtigkeit + " % Luftfeuchtigkeit");
	}

	@Override
	public void aktualisieren(float temp, float feucht, float druck) {
		this.temperatur = temp;
		this.feuchtigkeit = feucht;
		anzeigen();
	}
	
	

}
