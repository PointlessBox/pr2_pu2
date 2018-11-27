package unternehmen;

import java.util.*;

import einwohner.Buerger;
import einwohner.Einwohner;
import einwohner.Schurke;
import einwohner.Steuerzahler;

public class Finanzamt {

	// singelton
	private static Finanzamt finanzamt = new Finanzamt();

	/*
	 * Attribute
	 */
//	Liste von Steuerzahlern muss bei Steuerzahler in Konstruktor initialisiert werden und
//	evtl muss Liste direkt initialisiert werden
	private List<Steuerzahler> steuerzahler = new LinkedList<>();
	private int steuerInsgesamt;

	// Konstruktor

	public Finanzamt() {
	}

	/*
	 * getter
	 */
	public List<Steuerzahler> getSteuerzahler() {
		return  steuerzahler;
	}

	/*
	 * setter Steuerzahler
	 */
	public void setSteuerzahler(Steuerzahler[] steuerzahler) {

		for (int i = 0; i < steuerzahler.length; i++) {
			this.steuerzahler.add(steuerzahler[i]);
		}
	}

	/*
	 * getter SteuerInsgesamt
	 */
	public int getSteuerInsgesamt() {
		return steuerInsgesamt;
	}

	/*
	 * setter SteuerInsgesamt
	 */
	public void setSteuerInsgesamt(int steuerInsgesamt) {
		this.steuerInsgesamt = steuerInsgesamt;
	}

	/*
	 * getter Finanzamt (Singelton)
	 */
	public static Finanzamt getFinanzamt() {
		return finanzamt;
	}

	/*
	 * setter Finanzamt (Singelton)
	 */
	public static void setFinanzamt(Finanzamt finanzamt) {
		Finanzamt.finanzamt = finanzamt;
	}

	public int berechne() {
		
		double steuernGes = 0;
		
		for (int i = 0; i < steuerzahler.size(); i++) {

			// Einkommensteuer
			if (steuerzahler.get(i) instanceof Buerger || steuerzahler.get(i) instanceof Schurke
					|| steuerzahler.get(i) instanceof Personengesellschaft) {

				if (steuerzahler.get(i) instanceof Personengesellschaft) {
					steuernGes += berechneEinkommenssteuer(((Personengesellschaft) (steuerzahler.get(i))).getGewinn());
				}

				else if(steuerzahler.get(i) instanceof Buerger || steuerzahler.get(i) instanceof Schurke) {
					steuernGes += berechneEinkommenssteuer(((Einwohner) (steuerzahler.get(i))).getEinkommen());
				}
			}

			// koerperschaftssteuer
			if (steuerzahler.get(i) instanceof Syndikat || steuerzahler.get(i) instanceof Kapitalgesellschaft) {
				if (steuerzahler.get(i) instanceof Syndikat) {

					steuernGes += berechneKoerperschaftssteuer(
							berechenSyndikatGesamtEinkommen((Syndikat) steuerzahler.get(i)));
				} else if(steuerzahler.get(i) instanceof Kapitalgesellschaft){

					steuernGes += berechneKoerperschaftssteuer(
							((Kapitalgesellschaft) (steuerzahler.get(i))).getGewinn());
				}
			}
			//Gewerbesteuer
			if (steuerzahler.get(i) instanceof Personengesellschaft
					|| steuerzahler.get(i) instanceof Kapitalgesellschaft) {
				steuernGes += berechneGewerbesteuer(((Unternehmen) (steuerzahler.get(i))).getGewinn());
			}
		}

		return (int) steuernGes;
	}

	/*
	 * berechent die Einkommenssteuer
	 */
	private double berechneEinkommenssteuer(int betrag) {

//		Ergebnis mit einem S eintragen
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

	/*
	 * berechnet die Koerperschaftssteuer
	 */
	private double berechneKoerperschaftssteuer(int betrag) {

		return betrag * 0.25;
	}

	/*
	 * berechnet die gewerbe steuer
	 */
	private double berechneGewerbesteuer(int betrag) {

		return betrag * 0.1;
	}

	private int berechenSyndikatGesamtEinkommen(Syndikat syndikat) {
		int summeEinkommenSchurken = 0;

		for (int i = 0; i < syndikat.getMitglieder().size(); i++) {
			summeEinkommenSchurken += syndikat.getMitglieder().get(i).getEinkommen();
		}
		return summeEinkommenSchurken;
	}

}
