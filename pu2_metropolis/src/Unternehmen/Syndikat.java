package Unternehmen;

import java.util.*;

import pu2_metropolis.Schurke;
import pu2_metropolis.Steuerzahler;

public class Syndikat implements Steuerzahler {
	//attribute
	private List<Schurke> mitglieder;

	//konstruktor
	public Syndikat(Schurke... mitglieder) {
		setMitglieder(mitglieder);
		//keine ahung warum dsa nich geht
		Finanzamt.getFinanzamt().getSteuerzahler().add(this);
	}
	
	/*
	 * setter
	 */
	private void setMitglieder(Schurke[] mitglieder) {
		
		for(int i = 0;i<mitglieder.length;i++){
			this.mitglieder.add(mitglieder[i]);
		}
	}
	
	public List<Schurke> getMitglieder() {
		
		return this.mitglieder;
	}
	
	

	
	
}
