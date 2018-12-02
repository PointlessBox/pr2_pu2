package unternehmen;

import java.util.*;

import einwohner.Schurke;
import einwohner.Steuerzahler;

/**
 * Objekt Syndikat
 * 
 * @author Rosario & Fabian
 *
 */
public class Syndikat implements Steuerzahler {
	/**
	 * Attribute
	 */
	private List<Schurke> mitglieder = new LinkedList<>();

	/**
	 * Konstruktor
	 * 
	 * @param mitglieder
	 */
	public Syndikat(Schurke... mitglieder) {
		setMitglieder(mitglieder);
		Finanzamt.getFinanzamt().getSteuerzahler().add(this);
	}

	/**
	 * Setter
	 * 
	 * @param mitglieder
	 */
	private void setMitglieder(Schurke[] mitglieder) {

		for (int i = 0; i < mitglieder.length; i++) {
			this.mitglieder.add(mitglieder[i]);
		}
	}

	/**
	 * Getter
	 * 
	 * @return mitglieder
	 */
	public List<Schurke> getMitglieder() {

		return this.mitglieder;
	}

}
