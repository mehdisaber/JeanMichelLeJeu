package app.modele;

public class Armes {
	private String nom;
	private String zoneAdapt;
	private int dgtZone;
	private int dgtPasZone;
	
	public Armes(String n, String za, int dgtPZ, int dgtZ) {
		nom=n;
		zoneAdapt=za;
		dgtPasZone=dgtPZ;
		dgtZone=dgtZ;
}
	

	public final String getNom() {
		return nom;
	}

	public final String getZoneAdapt() {
		return zoneAdapt;
	}

	public final int getDgtZone() {
		return dgtZone;
	}

	public final int getDgtPasZone() {
		return dgtPasZone;
	}

}
