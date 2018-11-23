package Unternehmen;

import java.util.List;

import pu2_metropolis.Buerger;
import pu2_metropolis.Steuerzahler;

public class Personengesellschaft extends Unternehmen {
	
		//attribute
		private List<Buerger> inhaber;

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
		
		public List<Buerger> getMitglieder() {
			
			return this.inhaber;
		}
		
}
