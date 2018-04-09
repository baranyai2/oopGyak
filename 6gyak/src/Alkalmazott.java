
public class Alkalmazott {
	private static int nyugdijkorhatar = 65;
	
	private String nev;
	private int kor;
	private long fizetes;
	
	public Alkalmazott(String nev, int kor, long fizetes) {
		super();
		this.nev = nev;
		this.kor = kor;
		this.fizetes = fizetes;
	}
	
	public Alkalmazott(String nev, int kor) {
		super();
		this.nev = nev;
		this.kor = kor;
		fizetes = kor * 10000;
	}
	
	public int evekNyugdijig() {
		return nyugdijkorhatar - kor;
	}

	@Override
	public String toString() {
		return "Alkalmazott neve: " + nev + ", kora: " + kor + ", fizetese: "
				+ fizetes + ", nyugdijig hatralevo evek szama: " + evekNyugdijig();
	}
	
	//csak random-hoz
	public static int getNyugdijkorhatar() {
		return nyugdijkorhatar;
	}
	
	public static void setNyugdijkorhatar(int nyugdijkorhatar) {
		Alkalmazott.nyugdijkorhatar = nyugdijkorhatar;
	}
	
	public static Alkalmazott tobbEveVanNyugdijig(Alkalmazott elsoAlkalmazott, Alkalmazott masodikAlkalmazott) {
		if (elsoAlkalmazott.evekNyugdijig() < masodikAlkalmazott.evekNyugdijig()) {
			return masodikAlkalmazott;
		} else {
			return elsoAlkalmazott;
		}
	}
	
	
}
