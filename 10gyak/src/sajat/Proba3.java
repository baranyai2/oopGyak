package sajat;

import java.io.*;
import java.util.*;

import kivetelek.NemPozitivSzamException;

public class Proba3 {

	public static void main(String[] args) {
		
		//Scanner beolvas = new Scanner(System.in); //felvaltja az InputStreamReader es BufferedReader
		int[] tomb = new int[5];
		
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = egeszetBeolvas(i + 1);
		}
		
		System.out.println("A tomb elemei:");
		
		for (int i = 0; i < tomb.length; i++) {
			System.out.println(tomb[i]);
		}
		
		//beolvas.close();		// A beolvas Scanner is ki van commentelve

	}
	
	public static int egeszetBeolvas(int i) {
		int egeszSzam = 0;
		try {
			//InputStreamReader bemenet = new InputStreamReader(System.in);
			//BufferedReader beolvasas = new BufferedReader(bemenet);
			BufferedReader beolvasas = new BufferedReader(new InputStreamReader(System.in)); // így is működik
			
			boolean rosszAdat = true;
			do {
				System.out.println("Adja meg a(z) " + i + ". elemet!");
				System.out.print("Szam: ");
				try {
					egeszSzam = Integer.parseInt(beolvasas.readLine());
					//tomb[i] = Integer.valueOf(beolvasas.readLine()).intValue(); // Megint másféle lesz
					//tomb[i] = Integer.parseInt(beolvas.nextLine()); // Az előző sor felváltja
					if (egeszSzam <= 0) {
						//throw new IllegalArgumentException();
						throw new NemPozitivSzamException("Nem pozitiv szam");
					}
					rosszAdat = false;
				} catch (InputMismatchException e) {
					System.out.println("Rossz input");
				} catch (NumberFormatException e) {
					System.out.println("Rossz input");
				} catch (IllegalArgumentException e) {
					System.out.println("0 vagy negativ szam");
				}
				// finally {
				//	beolvas.nextLine();  // Integer.parseInt(beolvas.nextLine() miatt nem kell
				//}
				catch (NemPozitivSzamException e) {
					System.out.println(e.getMessage());
				}
			} while (rosszAdat);
			//tomb[i] = beolvas.nextInt();   // exception miatt nem kell
			//beolvas.nextLine();
		} catch (IOException kivetel) {
			kivetel.printStackTrace();
		}
		return egeszSzam;
	}

}
