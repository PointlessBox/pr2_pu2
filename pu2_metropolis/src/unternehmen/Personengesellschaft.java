package unternehmen;

import java.util.*;

import einwohner.Buerger;
import einwohner.Steuerzahler;

public class Personengesellschaft extends Unternehmen {
	
		//attribute
		private ArrayList<Buerger> inhaber = new ArrayList<>();

		//konstruktor
		public Personengesellschaft (String name, int gewinn, Buerger... mitglieder) {
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
				this.inhaber.add(mitglieder[i]);
			}
		}
		
		public ArrayList<Buerger> getMitglieder() {
			
			return this.inhaber;
		}
		
}
