package einwohner;

/**
 * Objekt Mutant (Oberklasse von Superheld & Schurke)
 * 
 * @author Rosario & Fabian
 *
 * @param <G>
 */
public abstract class Mutant<G extends Mutant<?>> extends Einwohner {
	/**
	 * Attribute
	 */
	private String mutation;
	private Superkraft[] superkraefte;
	private boolean istBesiegt = false;

	/**
	 * Konstruktor
	 * 
	 * @param name
	 * @param einkommen
	 * @param mutation
	 * @param superkraefte
	 */
	public Mutant(String name, int einkommen, String mutation, Superkraft[] superkraefte) {
		super(name, einkommen);
		setMutation(mutation);
		setSuperkraefte(superkraefte);
	}

	/**
	 * Getter
	 * 
	 * @return mutation
	 */
	public String getMutation() {
		return mutation;
	}

	/**
	 * Setter
	 * 
	 * @param mutation
	 */
	private void setMutation(String mutation) {
		this.mutation = mutation;
	}

	/**
	 * Getter
	 * 
	 * @return superkraefte
	 */
	public Superkraft[] getSuperkraefte() {
		return superkraefte;
	}

	/**
	 * Setter
	 * 
	 * @param superkraefte
	 */
	private void setSuperkraefte(Superkraft[] superkraefte) {
		this.superkraefte = superkraefte;
	}

	/**
	 * Getter
	 * 
	 * @return
	 */
	public boolean getIstBesiegt() {
		return this.istBesiegt;
	}

	/**
	 * Setter
	 * 
	 * @param ergebnis
	 */
	protected void setIstBesiegt(boolean ergebnis) {
		this.istBesiegt = ergebnis;
	}

	/**
	 * Die Methode ermöglict das kaempfen zw. Superheld und Schurke (Und weißt
	 * Sieger und Verlierer zu)
	 * 
	 * @param gegner
	 */
	public void kaempfe(G gegner) {
		this.setIstBesiegt(false);
		gegner.setIstBesiegt(false);
		if (this.equals(gegner)) {
			System.out.println("Ihr seid verbündet und solltet nicht kämpfen!");
		} else {
			if (this.hatGewonnen(gegner)) {
				System.out.println(this.getName() + " hat gewonnen! " + gegner.getName() + " zieht sich zurück!");
				gegner.setIstBesiegt(true);
			} else {
				System.out.println(gegner.getName() + " hat gewonnen! " + this.getName() + " ist besiegt!");
				this.setIstBesiegt(true);
			}
		}
	}

	/**
	 * Hilfmethode für kaempfen
	 * 
	 * @param gegner
	 * @return Ob angreifer gewonnen hat(boolean)
	 */
	private boolean hatGewonnen(G gegner) {
		boolean hatGewonnen = false;
		if (gegner instanceof Schurke) {
			for (Superkraft kraft : this.getSuperkraefte()) {
				if (kraft == ((Schurke<?>) gegner).getSchwaeche())
					return hatGewonnen = true;
			}
		} else if (gegner instanceof Superheld) {
			for (Superkraft kraft : gegner.getSuperkraefte()) {
				if (kraft == ((Schurke<?>) this).getSchwaeche())
					return hatGewonnen = false;
				else
					hatGewonnen = true;
			}
		}
		return hatGewonnen;
	}
}
