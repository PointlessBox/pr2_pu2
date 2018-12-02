package einwohner;

import unternehmen.Finanzamt;

/**
 * Objekt Schurke
 * 
 * @author Rosario & Fabian
 *
 * @param <G>
 */
public class Schurke<G extends Mutant<?>> extends Mutant<G> implements Steuerzahler {
	/**
	 * Attribute
	 */
	private Superkraft schwaeche;
	private boolean istVerurteilt = false;

	/**
	 * Konstruktor + Objekt wird direkt der Liste Steuerzahler hinzugefügt
	 * 
	 * @param name
	 * @param einkommen
	 * @param mutation
	 * @param schwaeche
	 * @param superkraefte
	 */
	public Schurke(String name, int einkommen, String mutation, Superkraft schwaeche, Superkraft... superkraefte) {
		super(name, einkommen, mutation, superkraefte);
		setSchwaeche(schwaeche);
		Finanzamt.getFinanzamt().getSteuerzahler().add(this);
	}

	/**
	 * Getter
	 * 
	 * @return schwaeche
	 */
	public Superkraft getSchwaeche() {
		return schwaeche;
	}

	/**
	 * Setter
	 * 
	 * @param schwaeche
	 */
	private void setSchwaeche(Superkraft schwaeche) {
		this.schwaeche = schwaeche;
	}

	/**
	 * Getter
	 * 
	 * @return istVeruteilt
	 */
	public boolean getIstVerurteilt() {
		return this.istVerurteilt;
	}

	/**
	 * Setter
	 * 
	 * @param urteil
	 */
	protected void setIstVerurteilt(boolean urteil) {
		this.istVerurteilt = urteil;
	}

}
