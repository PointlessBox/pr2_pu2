package pu2_metropolis;

public class Buerger extends Mensch implements Steuerzahler {
	public Buerger(String name, int einkommen, int alter) {
		super(name, einkommen, alter);
	}
	
//	@Override
//	public int getSteuerID() {
//		return this.steuerID;
//	}
}
