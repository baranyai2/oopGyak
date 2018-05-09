package szgep.teszt;

import java.util.Scanner;

import szgep.Merevlemez;

public class Taroloteszt {

	public static void main(String[] args) {
		Merevlemez[] merevlemez = new Merevlemez[5];
		Scanner bemenet = new Scanner(System.in);
		
		for (int i = 0; i < merevlemez.length; i++) {
			System.out.println("Adja meg a tarolo tipusat!");
			String tipus = bemenet.nextLine();
			System.out.println("Adja meg a tarolo kapacitasat!");
			double kapacitas = bemenet.nextDouble();
			System.out.println("Adja meg a tarolo foglalt teruletet!");
			double foglaltTerulet = bemenet.nextDouble();
			bemenet.nextLine();
			merevlemez[i] = new Merevlemez(tipus, kapacitas, foglaltTerulet);
		}
		
		int legnagyobbSzabadTeruletuIndexe = 0;
		for (int i = 1; i < merevlemez.length; i++) {
			if (merevlemez[i].getKapacitas() > merevlemez[legnagyobbSzabadTeruletuIndexe].getKapacitas()) {
				legnagyobbSzabadTeruletuIndexe = i;
			}
		}
		
		System.out.println("A legnagyobb teruletu merevlemez adatai:");
		System.out.println(merevlemez[legnagyobbSzabadTeruletuIndexe].toString());
		
		int tobbASzabadTerulet = 0;
		
		for (int i = 0; i < merevlemez.length; i++) {
			if (merevlemez[i].szabadHely() > merevlemez[i].getFoglaltTerulet()) {
				tobbASzabadTerulet++;
			}
		}
		
		System.out.println(tobbASzabadTerulet + " szamu lemezre igaz hogy tobb a szabad terulet.");
		
		for (int i = 0; i < merevlemez.length; i++) {
			System.out.println(merevlemez[i].toString());
		}
		
		bemenet.close();

	}

}
