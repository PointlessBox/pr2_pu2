package einwohner;

/**
 * Objekt Superheld
 * 
 * @author rosario
 *
 * @param <G>
 */
public class Superheld<G extends Mutant<?>> extends Mutant<G> {
	/**
	 * Konstruktor
	 * 
	 * @param name
	 * @param einkommen
	 * @param mutation
	 * @param superkraefte
	 */
	public Superheld(String name, int einkommen, String mutation, Superkraft... superkraefte) {
		super(name, einkommen, mutation, superkraefte);
	}
}
