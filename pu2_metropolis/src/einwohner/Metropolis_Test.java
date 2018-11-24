package einwohner;

import unternehmen.Finanzamt;

public class Metropolis_Test {
	public static void main(String args[]) {
		
		Buerger b1 = new Buerger("Hans", 3000, 23);
		Richter r1 = new Richter("JudgeFudge", 20000, 35, false);
		Schurke s1 = new Schurke("BigDick", 8000, "50cm Fleischpeitsche", Superkraft.ONEPUNCH, Superkraft.KAFFEE, Superkraft.SUPERSTAERKE);
		Superheld sh1 = new Superheld("FaggotMan", 500, "gebleichter Anus", Superkraft.UNSTERBLICHKEIT);
		
	//	System.out.println(b1.getSteuerID());
	//	System.out.println(s1.getSteuerID());
		
		//System.out.println(Finanzamt.getFinanzamt().berechne();
		s1.kaempfe(sh1);
	}
}
