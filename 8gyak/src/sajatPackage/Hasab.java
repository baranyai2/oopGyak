package sajatPackage;

public abstract class Hasab {
	private double magassag;

	public Hasab(double magassag) {
		super();
		this.magassag = magassag;
	}

	public double getMagassag() {
		return magassag;
	}
	
	public abstract double alapterulet();
	
	public double getTerfogat() {
		return Math.round(alapterulet()*magassag);
	}
	
	public boolean nagyobbTerfogatuE(Hasab masikHasab) {
		return getTerfogat() > masikHasab.getTerfogat();
	}
}
