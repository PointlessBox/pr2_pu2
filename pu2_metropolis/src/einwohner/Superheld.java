package einwohner;

public class Superheld<G extends Mutant<?>> extends Mutant<G> {
	public Superheld(String name, int einkommen, String mutation, Superkraft... superkraefte) {
		super(name, einkommen, mutation, superkraefte);
	}
}
