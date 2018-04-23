package sajat;

import java.io.*;
import java.util.*;

public class Proba2 {

	public static void main(String[] args) {
		
		//Scanner beolvas = new Scanner(System.in); //felvaltja az InputStreamReader es BufferedReader
		int[] tomb = new int[5];
		
		for (int i = 0; i < tomb.length; i++) {
			try {
				//InputStreamReader bemenet = new InputStreamReader(System.in);
				//BufferedReader beolvasas = new BufferedReader(bemenet);
				BufferedReader beolvasas = new BufferedReader(new InputStreamReader(System.in)); // így is működik

				boolean rosszAdat = true;
				do {
					System.out.println("Adja meg a(z) " + (i + 1) + ". elemet!");
					System.out.print("Szam: ");
					try {
						tomb[i] = Integer.valueOf(beolvasas.readLine()).intValue();
						//tomb[i] = Integer.parseInt(beolvas.nextLine()); // Az előző sor felváltja
						rosszAdat = false;
					} catch (InputMismatchException e) {
						System.out.println("Rossz input");
					} catch (NumberFormatException e) {
						System.out.println("Rossz input");
					}
					// finally {
					//	beolvas.nextLine();  // Integer.parseInt(beolvas.nextLine() miatt nem kell
					//}
				} while (rosszAdat);
				//tomb[i] = beolvas.nextInt();   // exception miatt nem kell
				//beolvas.nextLine();
			} catch (IOException kivetel) {
				kivetel.printStackTrace();
			}
		}
		
		System.out.println("A tomb elemei:");
		
		for (int i = 0; i < tomb.length; i++) {
			System.out.println(tomb[i]);
		}
		
		//beolvas.close();		// A beolvas Scanner is ki van commentelve

	}

}
