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
