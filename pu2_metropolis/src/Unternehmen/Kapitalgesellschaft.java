package Unternehmen;

import java.util.List;

import pu2_metropolis.Buerger;

public class Kapitalgesellschaft extends Unternehmen{
	/*
	 * Attribute
	 */
		private List<Buerger> gesellschafter;

	/*
	 * Konstruktor
	 */
	public Kapitalgesellschaft (String name, int gewinn, Buerger... mitglieder) {
		super(name, gewinn);
		setMitglieder(mitglieder);
		//keine ahung warum dsa nich geht
		Finanzamt.getFinanzamt().getSteuerzahler().add(this);
	}
	
	/*
	 * setter
	 */
	private void setMitglieder(Buerger[] mitglieder) {
		
		for(int i = 0;i<mitglieder.length;i++){
			this.gesellschafter.add(mitglieder[i]);
		}
	}
	/*
	 * getter
	 */
	public List<Buerger> getMitglieder() {
		
		return this.gesellschafter;
	}
}
