package unternehmen;

import java.util.*;

import einwohner.Schurke;
import einwohner.Steuerzahler;

public class Syndikat implements Steuerzahler {
	//attribute
	private List<Schurke> mitglieder = new LinkedList<>();

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
