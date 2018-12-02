package unternehmen;

import java.util.*;

import einwohner.Buerger;

/**
 * Objekt Kapitalgesellschaft
 * 
 * @author Rosario & Fabian
 *
 */
public class Kapitalgesellschaft extends Unternehmen {
	/**
	 * Attribute
	 */
	private List<Buerger> gesellschafter = new LinkedList<>();

	/**
	 * Konstruktor
	 * 
	 * @param name
	 * @param gewinn
	 * @param mitglieder
	 */
	public Kapitalgesellschaft(String name, int gewinn, Buerger... mitglieder) {
		super(name, gewinn);
		setMitglieder(mitglieder);
		// keine ahung warum das nich geht
		Finanzamt.getFinanzamt().getSteuerzahler().add(this);
	}

	/**
	 * Setter
	 * 
	 * @param mitglieder
	 */
	private void setMitglieder(Buerger[] mitglieder) {

		for (int i = 0; i < mitglieder.length; i++) {
			this.gesellschafter.add(mitglieder[i]);
		}
	}

	/**
	 * Getter
	 * 
	 * @return mitglieder
	 */
	public List<Buerger> getMitglieder() {

		return this.gesellschafter;
	}
}
