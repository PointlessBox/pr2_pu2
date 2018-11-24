package einwohner;

public abstract class Einwohner {
//	private static int steuerIDcounter = 0;
//	protected final int steuerID;
	private String name;
	private int einkommen;
	
	public Einwohner(String name, int einkommen) {
		setName(name);
		setEinkommen(einkommen);
//		this.steuerID = ++steuerIDcounter;
	}
	
	public String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public int getEinkommen() {
		return einkommen;
	}
	
	private void setEinkommen(int einkommen) {
		this.einkommen = einkommen;
	}
}
