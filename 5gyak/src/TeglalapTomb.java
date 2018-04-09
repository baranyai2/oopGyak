import java.util.Random;
import java.util.Scanner;


public class TeglalapTomb {

	public static void main(String[] args) {
		int meret = 10;
		Teglalap[] teglalaptomb = new Teglalap[meret];
		Random rnd_obj = new Random();
		
		for (int i = 0; i < teglalaptomb.length; i++) {
			teglalaptomb[i] = new Teglalap(rnd_obj.nextInt(9) + 2, rnd_obj.nextInt(8) + 2);
			System.out.println(teglalaptomb[i]);
		}
		
		int minIndex = 0;
		
		for (int i = 1; i < teglalaptomb.length; i++) {
			if (teglalaptomb[minIndex].teruletNagyobbMint(teglalaptomb[i])) {
				minIndex = i;
			}
		}
		
		Scanner bemenet = new Scanner(System.in);
		
		System.out.println(teglalaptomb[minIndex]);
		System.out.println("Adja meg a teglalap egyik odlalat!");
		int aoldal = Integer.parseInt(bemenet.nextLine());
		System.out.println("Adja meg a teglalap masik odlalat!");
		int boldal = Integer.parseInt(bemenet.nextLine());
		Teglalap ujteglalap = new Teglalap(aoldal, boldal);
		
		int kisebbTeglalapokszama = 0;
		
		for (int i = 0; i < teglalaptomb.length; i++) {
			if (ujteglalap.teruletNagyobbMint(teglalaptomb[i])) {
				kisebbTeglalapokszama++;
			}
		}
		
		System.out.println("A kisebb teglalapok szama: " + kisebbTeglalapokszama);
		
		bemenet.close();
	}

}
