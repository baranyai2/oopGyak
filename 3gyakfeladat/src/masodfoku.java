import java.util.Scanner;
import java.lang.Math;

public class masodfoku {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner bemenet = new Scanner(System.in);
		
		System.out.println("Adja meg az a erteket!");
		double a = bemenet.nextDouble();
		System.out.println("Adja meg a b erteket!");
		double b = bemenet.nextDouble();
		System.out.println("Adja meg a c erteket!");
		double c = bemenet.nextDouble();
		
		double[] eredmeny = new double[2];
		
		if (a == 0) {
			System.out.println("A feladat nem masodfoku!");
		}
		double d = 0;
		d = Math.sqrt(b*b-4*a*c);
		if (d == 0) {
			eredmeny[0] = -b/(2*a);
		} else if (d < 0) {
			System.out.println("A kepletnek nincs megoldasa.");
		} else if (d > 0) {
			eredmeny[0] = (-b+d)/(2*a);
			eredmeny[1] = (-b-d)/(2*a);
		} 
		
		System.out.println("A keplet megoldasa(i): " + eredmeny[0] + " " + eredmeny[1]);
		
		bemenet.close();

	}

}
