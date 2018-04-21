package polinom;

import java.util.Scanner;

public class Teszt {

	
	public static void tablazatCsinalo(LinearisPolinom polinom) {
		System.out.print("x\ty\n");
		for (double i = 0; i <= 1.0; i += 0.1) {
			//System.out.println("x=" + i + " y=" + polinom.szamol(i));
			System.out.printf("%.2f\t", i);
			System.out.printf("%.2f\n", polinom.szamol(i));
		}
	}
	
	public static void main(String[] args) {
		LinearisPolinom polinom = new LinearisPolinom(2, -3);
		System.out.println(polinom);
		
		
		LinearisPolinom[] polinomok = new LinearisPolinom[2];
		Scanner beolvas = new Scanner(System.in);
		
		for (int i = 0; i < polinomok.length; i++) {
			System.out.println("Kerem a(z) " + (i + 1) + ". polinom elso egyutthatojat!");
			System.out.print("a= ");
			double a = beolvas.nextDouble();
			beolvas.nextLine();
			System.out.println("Kerem a(z) " + (i + 1) + ". polinom masodik egyutthatojat!");
			System.out.print("b= ");
			double b = beolvas.nextDouble();
			beolvas.nextLine();
			
			polinomok[i] = new LinearisPolinom(a, b);
		}
		
		for (LinearisPolinom linearisPolinom : polinomok) {
			System.out.println(linearisPolinom);
		}
		
		tablazatCsinalo(polinomok[polinomok.length-1]);
		
		beolvas.close();
	}
}
