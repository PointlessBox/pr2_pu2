package einwohner;

public class Richter extends Mensch {
	private boolean istKorrupt;
	
	public Richter(String name, int einkommen, int alter, boolean istKorrupt) {
		super(name, einkommen, alter);
		setIstKorrupt(istKorrupt);
	}
	
	public boolean getIstKorrupt() {
		return istKorrupt;
	}
	
	private void setIstKorrupt(boolean istKorrupt) {
		this.istKorrupt = istKorrupt;
	}
	
	public void verurteilen(Schurke schurke) {
		if(this.istKorrupt == false) {
			schurke.setIstVerurteilt(true);
			System.out.println(schurke.getName() + " wurde verurteilt");
		}
		else 
			schurke.setIstVerurteilt(false);
			System.out.println(schurke.getName() + " wurde nicht verurteilt");
	}
}
