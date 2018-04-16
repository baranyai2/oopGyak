package sajatPackage;

public class Teglatest extends Hasab{

	private double aOldal;
	private double bOldal;

	public Teglatest(double magassag, double aOldal, double bOldal) {
		super(magassag);
		this.aOldal = aOldal;
		this.bOldal = bOldal;
	}
	
	public double alapterulet() {
		return aOldal*bOldal;
	}

	@Override
	public String toString() {
		return "Teglatest aOldal: " + aOldal + " bOldal: " + bOldal + " Magassag: " + getMagassag();
	}

	
}
