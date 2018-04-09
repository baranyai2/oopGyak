package sajat;

public class Gyerek extends Szemely {
	private String iskola;

	public Gyerek(String nev, int kor, String iskola) {
		super(nev, kor);
		this.iskola = iskola;
	}
	
	public String getIskola() {
		return iskola;
	}

	@Override
	public String toString() {
		return "Gyerek iskola: " + iskola + ", toString(): " + super.toString();
	}
}
