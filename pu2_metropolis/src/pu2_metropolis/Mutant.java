package pu2_metropolis;

import java.util.*;

public abstract class Mutant<G extends Mutant> extends Einwohner {
	private String mutation;
	private Superkraft[] superkraefte;
	boolean istBesiegt = false;
//	TODO
//	private boolean istBesiegt;
//	UML-Diagramm angleichen
//	getter/setter implementieren

	public Mutant(String name, int einkommen, String mutation, Superkraft[] superkraefte) {
		super(name, einkommen);
		setMutation(mutation);
		setSuperkraefte(superkraefte);
	}

	public String getMutation() {
		return mutation;
	}

	private void setMutation(String mutation) {
		this.mutation = mutation;
	}

	public Superkraft[] getSuperkraefte() {
		return superkraefte;
	}

	private void setSuperkraefte(Superkraft[] superkraefte) {
		this.superkraefte = superkraefte;
	}
	
	public boolean getIstBesiegt() {
		return this.istBesiegt;
	}
	
	protected void setIstBesiegt(boolean ergebnis) {
		this.istBesiegt = ergebnis;
	}

	public void kaempfe(G gegner) {
		if (this.equals(gegner)) {
			System.out.println("Ihr seid verbündet und solltet nicht kämpfen!");
		} else {
			if (hatGewonnen(gegner))
				System.out.println(this.getName() + " hat gewonnen! " + gegner.getName() + " zieht sich zurück!");
			else
				System.out.println(gegner.getName() + " hat gewonnen! " + this.getName() + " ist besie!");
		}
	}

	private boolean hatGewonnen(G gegner) {
		boolean hatGewonnen = false;
		if (gegner instanceof Schurke) {
			for (Superkraft kraft : this.superkraefte) {
				if (kraft == ((Schurke) gegner).getSchwaeche())
					hatGewonnen = true;
				else
					hatGewonnen = false;
			}
		} else if (gegner instanceof Superheld) {
			for (Superkraft kraft : gegner.getSuperkraefte()) {
				if (kraft == ((Schurke) this).getSchwaeche())
					hatGewonnen = false;
				else
					hatGewonnen = true;
			}
		}
		return hatGewonnen;
	}
}
