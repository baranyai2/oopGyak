public class Szemely {
	
	private String nev;
	private int tomeg;
	private double magassag;
	private double tti;
	private String alkat;
	
	public void testTomegIndex() {
		tti = (double)(tomeg)/(magassag*magassag);
	}
	
	public void ttiSzoveg() {
		if (tti < 18.5) {
			alkat = "Sovany";
		} else if (tti > 25.0) {
			alkat = "kover";
		} else {
			alkat = "normal";
		}
		
	}

	@Override
	public String toString() {
		return "Szemely neve: " + nev + ", tomege: " + tomeg + ", magassaga: "
				+ magassag + ", tti: " + tti + ", alkata=" + alkat;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nevvalami) {
		nev = nevvalami;
	}

	public double getTomeg() {
		return tomeg;
	}

	public void setTomeg(int tomegvalami) {
		tomeg = tomegvalami;
	}

	public double getMagassag() {
		return magassag;
	}

	public void setMagassag(double magassagvalami) {
		magassag = magassagvalami;
	}
	
	
	
}
