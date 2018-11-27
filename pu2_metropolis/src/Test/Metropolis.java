package Test;

import einwohner.Buerger;
import einwohner.Mutant;
import einwohner.Richter;
import einwohner.Schurke;
import einwohner.Superheld;
import einwohner.Superkraft;

public class Metropolis {

	Buerger B1 = new Buerger("B1", 10000, 34);
	Buerger B2 = new Buerger("B2", 100000, 14);
	Buerger B3 = new Buerger("B3", 90000, 24);
	
	
	Richter R1 = new Richter("R1", 10000, 60, false);
	Richter R2 = new Richter("R2", 20000, 60, true);

	Schurke <Mutant<?>> Sc1 = new Schurke<>("Sc1", 10000, "GroﬂeNase", Superkraft.SUPERSTARK, Superkraft.SUPERFEUER, Superkraft.SUPERSPEED);
	Schurke <Mutant<?>> Sc2 = new Schurke<>("Sc2", 10000, "GroﬂeNase", Superkraft.UNSICHTBARKEIT, Superkraft.SUPERFEUER);
	Schurke <Mutant<?>> Sc3 = new Schurke<>("Sc3", 10000, "GroﬂeNase", Superkraft.UNSTERBLICHKEIT, Superkraft.SUPERFEUER, Superkraft.UNSICHTBARKEIT);
	Schurke <Mutant<?>> Sc4 = new Schurke<>("Sc4", 10000, "GroﬂeNase", Superkraft.SUPERFEUER,  Superkraft.SUPERSPEED);
	
	Superheld<Mutant<?>> Su1 = new Superheld<>("Su1", 50000,"KleineNase", Superkraft.ONEPUNCH,Superkraft.SUPERSPEED);
	Superheld<Mutant<?>> Su2 = new Superheld<>("Su2", 50000,"KleineNase", Superkraft.KAFFEEPOWER,Superkraft.SUPERSPEED);
	Superheld<Mutant<?>> Su3 = new Superheld<>("Su3", 50000,"KleineNase", Superkraft.UNSICHTBARKEIT,Superkraft.SUPERSTARK);
	Superheld<Mutant<?>> Su4 = new Superheld<>("Su4", 50000,"KleineNase", Superkraft.SUPERFEUER,Superkraft.UNSICHTBARKEIT);
		
}
