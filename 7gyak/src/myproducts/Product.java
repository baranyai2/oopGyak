package myproducts;

public class Product {
	private String nev;
	private int nettoAr;
	private int afakulcs;

	public Product(String nev, int nettoAr, int afakulcs) {
		super();
		this.nev = nev;
		this.nettoAr = nettoAr;
		this.afakulcs = afakulcs;
	}
	
	public int bruttoArSzamito() {
		return (int)(nettoAr * (1 + afakulcs / 100));
	}

	@Override
	public String toString() {
		return "Product nev: " + nev + " " + "Brutto ar: " + bruttoArSzamito();
	}
	
	public void nettoArNovelo(int szazalek) {
		nettoAr = (int)(nettoAr * (1 + szazalek /100.0));
	}
	
	public int dragabbE(Product masikProduct) {
		if (bruttoArSzamito() > masikProduct.bruttoArSzamito()) {
			return 1;
		} else if (bruttoArSzamito() == masikProduct.bruttoArSzamito()) {
			return 0;
		} else {
			return -1;
		}
	}
	
}
