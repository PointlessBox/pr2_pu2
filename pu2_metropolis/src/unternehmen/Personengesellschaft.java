package unternehmen;

import java.util.*;

import einwohner.Buerger;
import einwohner.Steuerzahler;

/**
 * Objekt Personalgesellschaft
 * 
 * @author Rosario & Fabian
 *
 */
public class Personengesellschaft extends Unternehmen {

	/**
	 * Attribute
	 */
	private ArrayList<Buerger> inhaber = new ArrayList<>();

	/**
	 * Konstruktor
	 * 
	 * @param name
	 * @param gewinn
	 * @param mitglieder
	 */
	public Personengesellschaft(String name, int gewinn, Buerger... mitglieder) {
		super(name, gewinn);
		setMitglieder(mitglieder);
		// keine ahung warum dsa nich geht
		Finanzamt.getFinanzamt().getSteuerzahler().add(this);
	}

	/**
	 * Setter
	 * 
	 * @param mitglieder
	 */
	private void setMitglieder(Buerger[] mitglieder) {

		for (int i = 0; i < mitglieder.length; i++) {
			this.inhaber.add(mitglieder[i]);
		}
	}

	/**
	 * Getter
	 * 
	 * @return inhaber
	 */
	public ArrayList<Buerger> getMitglieder() {

		return this.inhaber;
	}

}
