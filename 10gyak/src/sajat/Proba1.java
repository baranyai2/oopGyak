package sajat;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Proba1 {

	public static void main(String[] args) {
		
		Scanner beolvas = new Scanner(System.in);
		int[] tomb = new int[5];
		
		for (int i = 0; i < tomb.length; i++) {
			boolean rosszAdat = true;
			do {
				System.out.println("Adja meg a(z) " + (i + 1) + ". elemet!");
				System.out.print("Szam: ");
				try {
					tomb[i] = Integer.parseInt(beolvas.nextLine());
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
		}
		
		System.out.println("A tomb elemei:");
		
		for (int i = 0; i < tomb.length; i++) {
			System.out.println(tomb[i]);
		}
		
		beolvas.close();

	}

}
