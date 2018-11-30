package einwohner;

import unternehmen.Finanzamt;
import unternehmen.Kapitalgesellschaft;
import unternehmen.Personengesellschaft;
import unternehmen.Syndikat;

import static org.junit.Assert.assertEquals;

import java.util.*;

public class Metropolis_Test {
	public static void main(String args[]) {
//		
//		Buerger b1 = new Buerger("Hans", 3000, 23);
//		Richter r1 = new Richter("JudgeFudge", 20000, 35, false);
//		Schurke s1 = new Schurke("Joker", 8000, "Schminke", Superkraft.ONEPUNCH, Superkraft.KAFFEEPOWER);
//		Superheld sh1 = new Superheld("Batman", 500, "Batsuite", Superkraft.UNSTERBLICHKEIT);
//		Personengesellschaft u1 = new Personengesellschaft("egal", 10000, b1);
//		Kapitalgesellschaft k1 = new Kapitalgesellschaft("egal2", 20000, b1);
//		Schurke<?> S4 = new Schurke<>("S4", 10000, "Gro�eNase", Superkraft.SUPERFEUER,  Superkraft.SUPERSPEED);
//		
//		System.out.println(S4.getSchwaeche());
//		
//	//	System.out.println(b1.getSteuerID());
//	//	System.out.println(s1.getSteuerID());
//		
//	//	System.out.println(Finanzamt.getFinanzamt().berechne();
//		s1.kaempfe(sh1);
//		sh1.kaempfe(s1);
//		System.out.println(r1.getIstKorrupt());
//		r1.verurteilen(s1);
////		ArrayList<Steuerzahler> stz = Finanzamt.getFinanzamt().getSteuerzahler();
////		for(int i = 0; i < stz.size(); i++) {
////			System.out.println(stz.get(i));
////		}
////		System.out.println(Finanzamt.getFinanzamt().berechneEinkommenssteuer(b1.getEinkommen()));
////		System.out.println(Finanzamt.getFinanzamt().berechneGewerbesteuer(u1.getGewinn()));
////		System.out.println(Finanzamt.getFinanzamt().berechneKoerperschaftssteuer(k1.getGewinn()));
//		System.out.println(Finanzamt.getFinanzamt().berechne());
		
		Buerger B1 = new Buerger("B1", 10000, 34);
		Buerger B2 = new Buerger("B2", 100000, 14);
		Buerger B3 = new Buerger("B3", 190000, 24);

		Richter R1 = new Richter("R1", 10000, 60, false);
		Richter R2 = new Richter("R2", 20000, 60, true);

		Schurke<Mutant<?>> Sc1 = new Schurke<>("Sc1", 10000, "Gro�eNase", Superkraft.SUPERSTARK, Superkraft.SUPERFEUER,
				Superkraft.SUPERSPEED);
		Schurke<Mutant<?>> Sc2 = new Schurke<>("Sc2", 20000, "Gro�eNase", Superkraft.UNSICHTBARKEIT,
				Superkraft.SUPERFEUER);
		Schurke<Mutant<?>> Sc3 = new Schurke<>("Sc3", 120000, "Gro�eNase", Superkraft.UNSTERBLICHKEIT,
				Superkraft.SUPERFEUER, Superkraft.UNSICHTBARKEIT);
		Schurke<Mutant<?>> Sc4 = new Schurke<>("Sc4", 130000, "Gro�eNase", Superkraft.SUPERFEUER, Superkraft.SUPERSPEED);

		
		Superheld<Mutant<?>> Su1 = new Superheld<>("Su1", 50000, "KleineNase", Superkraft.ONEPUNCH,
				Superkraft.SUPERSPEED);
		Superheld<Mutant<?>> Su2 = new Superheld<>("Su2", 50000, "KleineNase", Superkraft.KAFFEEPOWER,
				Superkraft.SUPERSPEED);
		Superheld<Mutant<?>> Su3 = new Superheld<>("Su3", 50000, "KleineNase", Superkraft.UNSICHTBARKEIT,
				Superkraft.SUPERSTARK);
		Superheld<Mutant<?>> Su4 = new Superheld<>("Su4", 50000, "KleineNase", Superkraft.SUPERFEUER,
				Superkraft.UNSICHTBARKEIT);
		
		
		Kapitalgesellschaft K1 = new Kapitalgesellschaft("K1", 300000, B1,B2,B3);
		Kapitalgesellschaft K2 = new Kapitalgesellschaft("K2", 200000, B1,B2);
		
		//Kapitalgesellschaft K3 = new Kapitalgesellschaft("K1", 300000, B1,B2,B3);

		Personengesellschaft P1 = new Personengesellschaft("P1", 20000, B1,B2,B3);
		
		Syndikat S1 = new Syndikat(Sc1,Sc2,Sc3);
		Syndikat S2 = new Syndikat(Sc1);
		
		System.out.println(Finanzamt.getFinanzamt().getSteuerzahler().size());
		System.out.println(Finanzamt.getFinanzamt().berechne());
		
		Sc1.kaempfe(Su3);
		System.out.println(Sc1.getIstBesiegt() + ", " + Su3.getIstBesiegt());
//	 	assertEquals(true, Sc1.getIstBesiegt());
//	 	assertEquals(false, Su3.getIstBesiegt());
	 	
	 	Su1.kaempfe(Sc2);
	 	System.out.println(Su1.getIstBesiegt() + ", " + Sc2.getIstBesiegt());
//	 	assertEquals(false, Sc2.getIstBesiegt());
//	 	assertEquals(true, Su1.getIstBesiegt());
	}	
}
