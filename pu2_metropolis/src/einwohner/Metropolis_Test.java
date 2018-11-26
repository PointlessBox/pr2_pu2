package einwohner;

import unternehmen.Finanzamt;
import unternehmen.Kapitalgesellschaft;
import unternehmen.Personengesellschaft;

import java.util.*;

public class Metropolis_Test {
	public static void main(String args[]) {
		
		Buerger b1 = new Buerger("Hans", 3000, 23);
		Richter r1 = new Richter("JudgeFudge", 20000, 35, false);
		Schurke s1 = new Schurke("Joker", 8000, "Schminke", Superkraft.ONEPUNCH, Superkraft.KAFFEE, Superkraft.SUPERSTAERKE);
		Superheld sh1 = new Superheld("Batman", 500, "Batsuite", Superkraft.UNSTERBLICHKEIT);
		Personengesellschaft u1 = new Personengesellschaft("egal", 10000, b1);
		Kapitalgesellschaft k1 = new Kapitalgesellschaft("egal2", 20000, b1);
		
	//	System.out.println(b1.getSteuerID());
	//	System.out.println(s1.getSteuerID());
		
	//	System.out.println(Finanzamt.getFinanzamt().berechne();
		s1.kaempfe(sh1);
		sh1.kaempfe(s1);
		System.out.println(r1.getIstKorrupt());
		r1.verurteilen(s1);
//		ArrayList<Steuerzahler> stz = Finanzamt.getFinanzamt().getSteuerzahler();
//		for(int i = 0; i < stz.size(); i++) {
//			System.out.println(stz.get(i));
//		}
//		System.out.println(Finanzamt.getFinanzamt().berechneEinkommenssteuer(b1.getEinkommen()));
//		System.out.println(Finanzamt.getFinanzamt().berechneGewerbesteuer(u1.getGewinn()));
//		System.out.println(Finanzamt.getFinanzamt().berechneKoerperschaftssteuer(k1.getGewinn()));
		System.out.println(Finanzamt.getFinanzamt().berechne());
	}
}
