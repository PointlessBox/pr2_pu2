package unternehmen;

import einwohner.Steuerzahler;

/**
 * Implementiert Unternehmen(Oberklasse von Personengesellschaft &
 * Kapitalgesellschaft)
 * 
 * @author Rosario & Fabian
 *
 */
public abstract class Unternehmen implements Steuerzahler {
	/**
	 * Attribute
	 */
	private String name;
	private int gewinn;

	/**
	 * Konstruktor
	 * 
	 * @param name
	 * @param gewinn
	 */
	public Unternehmen(String name, int gewinn) {
		setName(name);
		setGewinn(gewinn);
	}

	/**
	 * Getter
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Setter
	 * 
	 * @param name
	 */
	private void setName(String name) {
		this.name = name;
	}

	/**
	 * Getter
	 * 
	 * @return gewinn
	 */
	public int getGewinn() {
		return gewinn;
	}

	/**
	 * Setter
	 * 
	 * @param gewinn
	 */
	private void setGewinn(int gewinn) {
		this.gewinn = gewinn;
	}

}
