package myproducts;

public class Bread extends Product{
		private double mennyiseg;

		public Bread(String nev, int nettoAr, int afakulcs, double mennyiseg) {
			super(nev, nettoAr, afakulcs);
			this.mennyiseg = mennyiseg;
		}

		@Override
		public String toString() {
			return super.toString() + " " + "egysegar: " + bruttoArSzamito() / mennyiseg;
		}

		public double getMennyiseg() {
			return mennyiseg;
		}
		
		public static boolean dragakenyer(Bread elsoKenyer, Bread masodikKenyer) {
			return elsoKenyer.bruttoArSzamito() / elsoKenyer.mennyiseg > masodikKenyer.bruttoArSzamito() / masodikKenyer.mennyiseg;
		}
		
}
