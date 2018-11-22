package pu2_metropolis;

public abstract class Mensch extends Einwohner {
	private int alter;
	
	public Mensch(String name, int einkommen, int alter) {
		super(name, einkommen);
		setAlter(alter);
	}
	
	public int getAlter() {
		return alter;
	}
	
	private void setAlter(int alter) {
		this.alter = alter;
	}
}
