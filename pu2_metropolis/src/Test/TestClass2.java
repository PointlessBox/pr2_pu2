package Test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import einwohner.Buerger;
import einwohner.Mutant;
import einwohner.Richter;
import einwohner.Schurke;
import einwohner.Superheld;
import einwohner.Superkraft;
import unternehmen.Kapitalgesellschaft;
import unternehmen.Personengesellschaft;
import unternehmen.Syndikat;

/**
 * hier ist berechne nicht drin da die Objekte sonst nicht wie gewollt inizialisiert werden für den Test
 * @author Rosario & Fabian
 *
 */
class TestClass2 {

	Buerger B1 = new Buerger("B1", 10000, 34);
	Buerger B2 = new Buerger("B2", 100000, 14);
	Buerger B3 = new Buerger("B3", 190000, 24);

	Richter R1 = new Richter("R1", 10000, 60, false);
	Richter R2 = new Richter("R2", 20000, 60, true);

	Schurke<Mutant<?>> Sc1 = new Schurke<>("Sc1", 10000, "GrosseNase", Superkraft.SUPERSTARK, Superkraft.SUPERFEUER,
			Superkraft.SUPERSPEED);
	Schurke<Mutant<?>> Sc2 = new Schurke<>("Sc2", 20000, "GrosseNase", Superkraft.UNSICHTBARKEIT,
			Superkraft.SUPERFEUER);
	Schurke<Mutant<?>> Sc3 = new Schurke<>("Sc3", 120000, "GrosseNase", Superkraft.UNSTERBLICHKEIT,
			Superkraft.SUPERFEUER, Superkraft.UNSICHTBARKEIT);
	Schurke<Mutant<?>> Sc4 = new Schurke<>("Sc4", 130000, "GrosseNase", Superkraft.SUPERFEUER, Superkraft.SUPERSPEED);

	Superheld<Mutant<?>> Su1 = new Superheld<>("Su1", 50000, "KleineNase", Superkraft.ONEPUNCH, Superkraft.SUPERSPEED);
	Superheld<Mutant<?>> Su2 = new Superheld<>("Su2", 50000, "KleineNase", Superkraft.KAFFEEPOWER,
			Superkraft.SUPERSPEED);
	Superheld<Mutant<?>> Su3 = new Superheld<>("Su3", 50000, "KleineNase", Superkraft.UNSICHTBARKEIT,
			Superkraft.SUPERSTARK);
	Superheld<Mutant<?>> Su4 = new Superheld<>("Su4", 50000, "KleineNase", Superkraft.SUPERFEUER,
			Superkraft.UNSICHTBARKEIT);

	Kapitalgesellschaft K1 = new Kapitalgesellschaft("K1", 300000, B1, B2, B3);
	Kapitalgesellschaft K2 = new Kapitalgesellschaft("K2", 200000, B1, B2);

	Personengesellschaft P1 = new Personengesellschaft("P1", 20000, B1, B2, B3);

	Syndikat S1 = new Syndikat(Sc1, Sc2, Sc3);
	Syndikat S2 = new Syndikat(Sc1);
	
	/**
	 * Testet die methode kaempfe()
	 */
	@Test
	public void kaempfeTest() {
		
		Sc1.kaempfe(Su3);
		assertEquals(true, Sc1.getIstBesiegt());
		assertEquals(false, Su3.getIstBesiegt());

		Su1.kaempfe(Sc2);
		assertEquals(false, Sc2.getIstBesiegt());
		assertEquals(true, Su1.getIstBesiegt());
	}
	/**
	 * Testet die methode verurteilen()
	 */
	@Test
	public void verurteilenTest() {
		R1.verurteilen(Sc1);
		R2.verurteilen(Sc2);
		assertEquals(true, Sc1.getIstVerurteilt());
		assertEquals(false, Sc2.getIstVerurteilt());

		R1.verurteilen(Sc2);
		R2.verurteilen(Sc1);
		assertEquals(true, Sc2.getIstVerurteilt());
		assertEquals(false, Sc1.getIstVerurteilt());

	}
}
