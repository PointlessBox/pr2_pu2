package unternehmen;

import java.util.*;

import einwohner.Buerger;

public class Kapitalgesellschaft extends Unternehmen{
	/*
	 * Attribute
	 */
		private ArrayList<Buerger> gesellschafter = new ArrayList<>();

	/*
	 * Konstruktor
	 */
	public Kapitalgesellschaft (String name, int gewinn, Buerger... mitglieder) {
		super(name, gewinn);
		setMitglieder(mitglieder);
		//keine ahung warum das nich geht
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
	public ArrayList<Buerger> getMitglieder() {
		
		return this.gesellschafter;
	}
}
