package Unternehmen;

import pu2_metropolis.Steuerzahler;

public abstract class Unternehmen implements Steuerzahler{
	private String name;
	
	private int gewinn;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGewinn() {
		return gewinn;
	}
	public void setGewinn(int gewinn) {
		this.gewinn = gewinn;
	}
	
	public int getSteuerID() {
		return getSteuerID();
	}

}
