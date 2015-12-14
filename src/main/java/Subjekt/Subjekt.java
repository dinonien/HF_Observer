package Subjekt;

import Beobachter.Beobachter;

public interface Subjekt {
	public void registriereBeobachter(Beobachter b);
	public void entferneBeobachter(Beobachter b);
	public void aktualisiereBeobachter();
	
}
