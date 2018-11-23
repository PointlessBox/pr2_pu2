package pu2_metropolis;

public class Schurke<G extends Mutant> extends Mutant<G> implements Steuerzahler {
	private Superkraft schwaeche;
	private boolean istVerurteilt = false;
//	TODO
//	private boolean istVerurteilt;
//	UML-Diagramm anpassen
//	getter/setter implementieren
	
	public Schurke(String name, int einkommen, String mutation, Superkraft schwaeche, Superkraft... superkraefte) {
		super(name, einkommen, mutation, superkraefte);
		setSchwaeche(schwaeche);
	}
	
	public Superkraft getSchwaeche() {
		return schwaeche;
	}
	
	private void setSchwaeche(Superkraft schwaeche) {
		this.schwaeche = schwaeche;
	}
	
	public boolean getIstVerurteilt() {
		return this.istVerurteilt;
	}
	
	protected void setIstVerurteilt(boolean urteil) {
		this.istVerurteilt = urteil;
	}
	
	@Override
	public int getSteuerID() {
		return this.steuerID;
	}
}
