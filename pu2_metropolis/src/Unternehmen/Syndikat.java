package Unternehmen;

import java.util.*;

import pu2_metropolis.Schurke;

public class Syndikat {
	//attribute
	private List<Schurke> mitglieder;

	//konstruktor
	public Syndikat(Schurke... mitglieder) {
		setMitglieder(mitglieder);
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
