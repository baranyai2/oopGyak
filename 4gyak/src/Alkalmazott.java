
public class Alkalmazott {
	
	private String nev;
	private long fizetes;
	
	public void fizetestNovel(long ertek) {
		fizetes += ertek;
	}

	@Override
	public String toString() {
		return "Alkalmazott neve: " + nev + ", fizetese: " + fizetes + " Ft";
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nevparameter) {
		nev = nevparameter;
	}

	public long getFizetes() {
		return fizetes;
	}

	public void setFizetes(long fizetesparameter) {
		fizetes = fizetesparameter;
	}
	
	public boolean fizetesIntervallumokKozott(long alsohatar, long felsohatar) {
		return fizetes >= alsohatar && fizetes <= felsohatar;
	}
	
	public long fizetendoAdo() {
		return (long)(fizetes * (16 / 100));
	}
	
	/*public boolean nagyobbFizetesuMint() {
		
	}*/
}
