package WetterDaten;

import Beobachter.Beobachter;
import Subjekt.Subjekt;
import java.util.ArrayList;

public class WetterDaten implements Subjekt {

	private ArrayList beobachter;
	private float temperatur;
	private float feuchtigkeit;
	private float luftdruck;
	
	public WetterDaten() {
		beobachter = new ArrayList<Beobachter>();
	}
	
	@Override
	public void registriereBeobachter(Beobachter b) {
		beobachter.add(b);
	}

	@Override
	public void entferneBeobachter(Beobachter b) {
		int i = beobachter.indexOf(b);
		if (i >= 0) {
			beobachter.remove(i);
		}
	}

	@Override
	public void aktualisiereBeobachter() {
		for (int i = 0; i < beobachter.size(); i++) {
			Beobachter b = (Beobachter)beobachter.get(i);
			b.aktualisieren(temperatur, feuchtigkeit, luftdruck);
		}
	}
	
	public void messwerteGeaendert() {
		aktualisiereBeobachter();
	}
	
	public void setMesswerte(float temp, float feucht, float druck) {
		this.temperatur = temp;
		this.feuchtigkeit = feucht;
		this.luftdruck = druck;
		messwerteGeaendert();
	}

}
