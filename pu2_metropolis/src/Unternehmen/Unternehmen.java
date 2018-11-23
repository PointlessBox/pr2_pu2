package Unternehmen;

import pu2_metropolis.Steuerzahler;

public abstract class Unternehmen implements Steuerzahler {
	
	private String name;
	private int gewinn;
	
	public Unternehmen(String name, int gewinn){
		setName(name);
		setGewinn(gewinn);
	}
	
	public String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	public int getGewinn() {
		return gewinn;
	}
	private void setGewinn(int gewinn) {
		this.gewinn = gewinn;
	}
	
}
