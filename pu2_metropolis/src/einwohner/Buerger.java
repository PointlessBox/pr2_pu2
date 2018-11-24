package einwohner;

import unternehmen.Finanzamt;

public class Buerger extends Mensch implements Steuerzahler {
	public Buerger(String name, int einkommen, int alter) {
		super(name, einkommen, alter);
		//keine ahung warum dsa nich geht
		Finanzamt.getFinanzamt().getSteuerzahler().add(this);
	}
	
//	@Override
//	public int getSteuerID() {
//		return this.steuerID;
//	}
}
