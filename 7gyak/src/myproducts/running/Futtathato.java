package myproducts.running;
import myproducts.*;

public class Futtathato {
	public static void main(String[] args) {
		Product product = new Product("aru", 20, 27);
		Bread bread = new Bread("kenyer", 100, 15, 0.75);
		
		System.out.println("A termek adatai: ");
		System.out.println(product);
		System.out.println(bread);
		
		int dragabbE = product.dragabbE(bread);
		if (dragabbE == 1) {
			System.out.println("Az elso termek dragabb");
		} else if (dragabbE == 0) {
			System.out.println("A ket termek egyenlo aru");
		} else {
			System.out.println("A masodik termek dragabb");
		}
		
		Product product2 = new Bread("kenyer2", 200, 15, 1.0);
		
		System.out.println("product2.toString eredmenye: ");
		System.out.println(product2);
		
		Bread bread2 = new Bread("kenyer3", 110, 15, .5);
		
		System.out.println("Dragakenyer eredmenye");
		System.out.println(Bread.dragakenyer((Bread)product2, bread2));
		
		
	}

}
