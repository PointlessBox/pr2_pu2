package Test;


import static org.junit.Assert.assertEquals;

import java.util.LinkedList;

// {probier zu parametrisiren von metropolis}
//import java.util.Arrays;
//import java.util.Collection;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameters;

import org.junit.Test;

import einwohner.Buerger;
import einwohner.Mutant;
import einwohner.Richter;
import einwohner.Schurke;
import einwohner.Superheld;
import einwohner.Superkraft;
import unternehmen.Finanzamt;
import unternehmen.Kapitalgesellschaft;
import unternehmen.Personengesellschaft;
import unternehmen.Syndikat;

//@Parameters
//public static Collection<Object[]> data(){
//    return Arrays.asList(new Object[][] {
//      {Type.SUBSTRACT, 3.0, 2.0, 1.0},
//      {Type.ADD, 23.0, 5.0, 28.0}
//    });
//}

//@RunWith(Parameterized.class)
 public class TestClass {
	// enum world{ WELT1,WELT2,WELT3};
	// //Metropolis Bsp Nr.1:
	// @Parameters
	// public static Collection<Object[]> data(){
	// return Arrays.asList(new Object[][] {
	//
	// {world.WELT1, Buerger B1 = new Buerger("B1", 10000, 34)},
	// {world.WELT1, Buerger B2 = new Buerger("B2", 100000, 14)},
	// {world.WELT1, Buerger B3 = new Buerger("B3", 90000, 24)}});
	//
	// }
	/**
	 * @author Rosario
	 *
	 */
//	 class Welt1 extends Finanzamt {
//		
//		public Welt1() {
//			
//			super();
//			
//		}
		 
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
		
		
 //		}
//	 Welt1 a = new Welt1();
	
	 @Test //sollte 388000 raus kommen aber schleife bei berechenn in Junit geht 2*(list.size) in dem fall bis i = 24
	 	   // in der main wird das richtig ausgef�hrt also 12 mal
		public void testBerechene() {

		 	assertEquals(776000,Finanzamt.getFinanzamt().berechne());
			assertEquals(388000,Finanzamt.getFinanzamt().berechne());

			
		}
	
	@Test 
	public void test() {
		assertEquals(4, 4);
	}

}
