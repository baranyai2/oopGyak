package szgep;

public abstract class Adathordozo {
	private String tipus;
	private double kapacitas;
	
	public Adathordozo(String tipus, double kapacitas) {
		super();
		this.tipus = tipus;
		this.kapacitas = kapacitas;
	}

	public String getTipus() {
		return tipus;
	}

	public double getKapacitas() {
		return kapacitas;
	}
	
	public abstract double szabadHely();
	
}
