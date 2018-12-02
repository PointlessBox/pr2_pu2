package unternehmen;

import java.util.*;

import einwohner.Buerger;
import einwohner.Einwohner;
import einwohner.Schurke;
import einwohner.Steuerzahler;

/**
 * Objekt Finanzamt
 * 
 * @author Rosario & Fabian
 *
 */
public class Finanzamt {

	/**
	 * Singelton Finanzamt ( Da es in einer Simulation auch nur ein Finanzamt geben
	 * soll)
	 */
	private static Finanzamt finanzamt = new Finanzamt();

	/**
	 * Attribute
	 */
	private List<Steuerzahler> steuerzahler = new LinkedList<>();
	private int steuerInsgesamt;

	/**
	 * Konstruktor
	 */
	public Finanzamt() {

	}

	/**
	 * Getter
	 * 
	 * @return steuerzahler
	 */
	public List<Steuerzahler> getSteuerzahler() {
		return steuerzahler;
	}

	/**
	 * Setter
	 */
	public void setSteuerzahler() {

	}

	/**
	 * Getter
	 * 
	 * @return steuerInsgesamt
	 */
	public int getSteuerInsgesamt() {
		return steuerInsgesamt;
	}

	/**
	 * Setter
	 * 
	 * @param steuerInsgesamt
	 */
	public void setSteuerInsgesamt(int steuerInsgesamt) {
		this.steuerInsgesamt = steuerInsgesamt;
	}

	/**
	 * Getter
	 * 
	 * @return finanzamt
	 */
	public static Finanzamt getFinanzamt() {
		return finanzamt;
	}

	/**
	 * Setter
	 * 
	 * @param finanzamt
	 */
	public static void setFinanzamt(Finanzamt finanzamt) {
	}

	/**
	 * Berechnet die GesamtSteuer der Simulation
	 * 
	 * @return steuerGesamt
	 */
	public int berechne() {

		double steuernGes = 0;

		for (int i = 0; i < steuerzahler.size(); i++) {

			// Einkommensteuer
			if (steuerzahler.get(i) instanceof Buerger || steuerzahler.get(i) instanceof Schurke
					|| steuerzahler.get(i) instanceof Personengesellschaft) {

				if (steuerzahler.get(i) instanceof Personengesellschaft) {
					steuernGes += berechneEinkommenssteuer(((Personengesellschaft) (steuerzahler.get(i))).getGewinn());
				}

				else if (steuerzahler.get(i) instanceof Buerger || steuerzahler.get(i) instanceof Schurke) {
					steuernGes += berechneEinkommenssteuer(((Einwohner) (steuerzahler.get(i))).getEinkommen());
				}
			}

			// koerperschaftssteuer
			if (steuerzahler.get(i) instanceof Syndikat || steuerzahler.get(i) instanceof Kapitalgesellschaft) {
				if (steuerzahler.get(i) instanceof Syndikat) {

					steuernGes += berechneKoerperschaftssteuer(
							berechenSyndikatGesamtEinkommen((Syndikat) steuerzahler.get(i)));
				} else if (steuerzahler.get(i) instanceof Kapitalgesellschaft) {

					steuernGes += berechneKoerperschaftssteuer(
							((Kapitalgesellschaft) (steuerzahler.get(i))).getGewinn());
				}
			}
			// Gewerbesteuer
			if (steuerzahler.get(i) instanceof Personengesellschaft
					|| steuerzahler.get(i) instanceof Kapitalgesellschaft) {
				steuernGes += berechneGewerbesteuer(((Unternehmen) (steuerzahler.get(i))).getGewinn());
			}
		}

		return (int) steuernGes;
	}

	/**
	 * Hilfsmethode für berechne berechent die Einkommenssteuer(gibt double zurück
	 * für genauere berechnungen , damit nur einmal gerundet wird falls nötig)
	 * 
	 * @param betrag
	 * @return Einkommenssteuer des Objekts
	 */
	private double berechneEinkommenssteuer(int betrag) {

		double ergebniss = 0;

		if (betrag > 20000) {
			ergebniss += (20000 * 0.1);
			betrag -= 20000;
		} else {
			return ergebniss += (betrag * 0.1);
		}

		if (betrag > 40000) {
			ergebniss += (40000 * 0.25);
			betrag -= 40000;
		}

		else {
			return ergebniss += (betrag * 0.25);
		}

		if (betrag > 60000) {
			ergebniss += (60000 * 0.35);
			betrag -= 60000;
		}

		else {
			return ergebniss += (betrag * 0.35);
		}

		if (betrag > 0) {
			return ergebniss += (betrag * 0.5);
		}

		return ergebniss;
	}

	/**
	 * Hilfsmethode für berechne berechnet die Koerperschaftssteuer
	 * 
	 * @param betrag
	 * @return Koerperschaftsteuers des Objekts
	 */
	private double berechneKoerperschaftssteuer(int betrag) {

		return betrag * 0.25;
	}

	/**
	 * Hilfmethoder für berechne Berechnet die Gewerbesteuer
	 * 
	 * @param betrag
	 * @return gewerbesteuer des Objekts
	 */
	private double berechneGewerbesteuer(int betrag) {

		return betrag * 0.1;
	}

	/**
	 * Hilfmethoder für berechene
	 * 
	 * @param syndikat
	 * @return
	 */
	private int berechenSyndikatGesamtEinkommen(Syndikat syndikat) {
		int summeEinkommenSchurken = 0;

		for (int i = 0; i < syndikat.getMitglieder().size(); i++) {
			summeEinkommenSchurken += syndikat.getMitglieder().get(i).getEinkommen();
		}
		return summeEinkommenSchurken;
	}

}
