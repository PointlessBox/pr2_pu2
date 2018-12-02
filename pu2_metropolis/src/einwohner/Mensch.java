package einwohner;

/**
 * Objekt Mensch( Oberklasse von Buerger und Richter)
 * 
 * @author Rosario & Fabian
 *
 */
public abstract class Mensch extends Einwohner {
	private int alter;

	/**
	 * Konstruktor
	 * 
	 * @param name
	 * @param einkommen
	 * @param alter
	 */
	public Mensch(String name, int einkommen, int alter) {
		super(name, einkommen);
		setAlter(alter);
	}

	/**
	 * Getter
	 * 
	 * @return alter
	 */
	public int getAlter() {
		return alter;
	}

	/**
	 * Setter
	 * 
	 * @param alter
	 */
	private void setAlter(int alter) {
		this.alter = alter;
	}
}
