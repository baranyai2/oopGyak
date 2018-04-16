package sajatFuttathato;

import sajatPackage.Henger;
import sajatPackage.Teglatest;

public class Futtathato {

	public static void main(String[] args) {
		Henger henger = new Henger(3, 2);
		
		System.out.println(henger);
		System.out.println(henger.getTerfogat());
		
		Teglatest teglatest = new Teglatest(3, 5, 3);
		
		System.out.println(teglatest);
		System.out.println(teglatest.getTerfogat());
		
		if (teglatest.nagyobbTerfogatuE(henger))
			System.out.println("A teglatest nagyobb tefogatu.");
		else
			System.out.println("A henger nagyobb terfogatu.");
	}

}
