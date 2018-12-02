package einwohner;

/**
 * Objekt Einwohner
 * 
 * @author Rosario & Fabian
 *
 */
public abstract class Einwohner {
	/**
	 * Attribute
	 */
	private String name;
	private int einkommen;

	/**
	 * Konstruktor
	 * 
	 * @param name
	 * @param einkommen
	 */
	public Einwohner(String name, int einkommen) {
		setName(name);
		setEinkommen(einkommen);
	}

	/**
	 * Getter
	 * 
	 * @return
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
	 * @return
	 */
	public int getEinkommen() {
		return einkommen;
	}

	/**
	 * Setter
	 * 
	 * @param einkommen
	 */
	private void setEinkommen(int einkommen) {
		this.einkommen = einkommen;
	}
}
