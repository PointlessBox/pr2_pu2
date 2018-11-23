package Unternehmen;

import java.util.List;

import pu2_metropolis.Buerger;

public class Personengesellschaft extends Unternehmen {
	
		//attribute
		private List<Buerger> inhaber;

		//konstruktor
		public Personengesellschaft (String name, int gewinn, Buerger... mitglieder) {
			super(name, gewinn);
			setMitglieder(mitglieder);
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
