package szgep;

public class Merevlemez extends Adathordozo {
	private double foglaltTerulet;

	public Merevlemez(String tipus, double kapacitas, double foglaltTerulet) {
		super(tipus, kapacitas);
		this.foglaltTerulet = foglaltTerulet;
	}
	
	public double getFoglaltTerulet() {
		return foglaltTerulet;
	}

	@Override
	public double szabadHely() {
		return getKapacitas() - foglaltTerulet;
	}

	@Override
	public String toString() {
		return "Merevlemez foglaltTerulet: " + foglaltTerulet
				+ " szabadHely: " + szabadHely() + " Tipus:"
				+ getTipus() + " Kapacitas: " + getKapacitas();
	}
	
	public boolean tobbSzabadTerulet(Merevlemez masikMerevlemez) {
		return szabadHely() > masikMerevlemez.szabadHely();
	}
	
	
	
}
