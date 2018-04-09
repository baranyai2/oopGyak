import java.util.Random;
import java.util.Scanner;


public class AlkalmazottHaszn {

	public static void main(String[] args) {
		Scanner beolvas = new Scanner(System.in);
		System.out.println("Kerem adja meg az alkalmazottak szamat!");
		int meret = beolvas.nextInt();
		
		Alkalmazott[] alkalmazottak = new Alkalmazott[meret];
		Random rnd = new Random();
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott("XY" + (i + 1), rnd.nextInt(45) + 18);
		}
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			System.out.println(alkalmazottak[i]);
		}
		
		System.out.println("Allits at a nyugdijkorhatart!");
		Alkalmazott.setNyugdijkorhatar(beolvas.nextInt());
		System.out.println("Nyugdijkorhatar allitas!");
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			System.out.println(alkalmazottak[i]);
		}
		
		System.out.println("5 evnel kevesebb nyugdijig:");
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			if (alkalmazottak[i].evekNyugdijig() < 5) {
				System.out.println(alkalmazottak[i]);;
			}
		}
		
		int summa = 0;
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			summa += alkalmazottak[i].evekNyugdijig();
		}
		
		double atlagEvNyugdijig = (double)summa/meret;
		System.out.println("Atlagevnel tobb nyugdijig:");
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			if (alkalmazottak[i].evekNyugdijig() > atlagEvNyugdijig) {
				System.out.println(alkalmazottak[i]);
			}
		}
		
		beolvas.close();
	}

}
