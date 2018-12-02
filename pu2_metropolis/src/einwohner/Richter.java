package einwohner;
/**
 * Objekt Richter
 * @author Rosario & Fabian
 *
 */
public class Richter extends Mensch {
	/**
	 * Attribute
	 */
	 
	private boolean istKorrupt;
	/**
	 * Konstruktor
	 * @param name
	 * @param einkommen
	 * @param alter
	 * @param istKorrupt
	 */
	public Richter(String name, int einkommen, int alter, boolean istKorrupt) {
		super(name, einkommen, alter);
		setIstKorrupt(istKorrupt);
	}
	/**
	 * @return Getter ist Korrupt

	 */
	public boolean getIstKorrupt() {
		return istKorrupt;
	}
	/**
	 * 
	 * @param istKorrupt
	 */
	private void setIstKorrupt(boolean istKorrupt) {
		this.istKorrupt = istKorrupt;
	}
	/**
	 * urteilt ueber einen Schurken 
	 * @param schurke
	 */
	public void verurteilen(Schurke<?> schurke) {
		if(this.istKorrupt == false) {
			schurke.setIstVerurteilt(true);
			System.out.println(schurke.getName() + " wurde verurteilt");
		}
		else 
			schurke.setIstVerurteilt(false);
			System.out.println(schurke.getName() + " wurde nicht verurteilt");
	}
}
