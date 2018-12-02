package einwohner;

import unternehmen.Finanzamt;

/**
 * Objekt Buerger
 * 
 * @author Rosario & Fabian
 *
 */
public class Buerger extends Mensch implements Steuerzahler {
	/**
	 * Konstruktor
	 * 
	 * @param name
	 * @param einkommen
	 * @param alter
	 */
	public Buerger(String name, int einkommen, int alter) {
		super(name, einkommen, alter);
		Finanzamt.getFinanzamt().getSteuerzahler().add(this);
	}
}
