package Unternehmen;

import java.util.List;

import pu2_metropolis.Buerger;
import pu2_metropolis.Schurke;
import pu2_metropolis.Steuerzahler;

public class Finanzamt {

	// singelton
	private static Finanzamt finanzamt = new Finanzamt();

	/*
	 * Attribute
	 */
	private List<Steuerzahler> steuerzahler;
	private int steuerInsgesamt;

	// Konstruktor

	public Finanzamt(Steuerzahler... steuerzahler) {
		setSteuerzahler(steuerzahler);
	}

	/*
	 * getter
	 */
	public List<Steuerzahler> getSteuerzahler() {
		return steuerzahler;
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

	public double berechne() {

		for (int i = 0; i < steuerzahler.size(); i++) {
			if (steuerzahler.get(i) instanceof Buerger || steuerzahler.get(i) instanceof Schurke
					|| steuerzahler.get(i) instanceof Personengesellschaft) {
				if(steuerzahler.get(i) instanceof Personengesellschaft){
				// berechenEinkommensteuer(//.Gewinn);
				}
				else{
					//berechenEinkommensteuer(//.Einkommen );
				}
			}
			if (steuerzahler.get(i) instanceof Syndikat || steuerzahler.get(i) instanceof Kapitalgesellschaft) {
				// berechneKoerperschaftssteuer
			}
			if (steuerzahler.get(i) instanceof Personengesellschaft
					|| steuerzahler.get(i) instanceof Kapitalgesellschaft) {
				//berechneGewerbesteuer
			}
		}

		return 0;
	}

	public double berechneEinkommenssteuer() {
				
		return 0;
	}

}
