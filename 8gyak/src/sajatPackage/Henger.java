package sajatPackage;

public class Henger extends Hasab {
	
	private double sugar;

	public Henger(double magassag, double sugar) {
		super(magassag);
		this.sugar = sugar;
	}
	
	public double alapterulet() {
		return sugar*sugar*Math.PI;
	}

	@Override
	public String toString() {
		return "Henger sugar: " + sugar + " Magassag: " + getMagassag();
	}
	
	

}
