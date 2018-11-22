package pu2_metropolis;

public class Richter extends Mensch {
	private boolean istKorrupt;
	
	public Richter(String name, int einkommen, int alter, boolean istKorrupt) {
		super(name, einkommen, alter);
		setKorruption(istKorrupt);
	}
	
	public boolean getKorruption() {
		return istKorrupt;
	}
	
	private void setKorruption(boolean istKorrupt) {
		this.istKorrupt = istKorrupt;
	}
	
	public void verurteilen() {
//	TODO
//	Funktionalität implementieren
	}
}
