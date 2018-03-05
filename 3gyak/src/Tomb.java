import java.util.Random;
//import java.lang.Math;

public class Tomb {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] tomb = new int[10];
		Random rnd_obj = new Random();
		
		for (int i = 0; i < tomb.length; i++) {
			tomb[i] = rnd_obj.nextInt(50) + 1;
			//tomb[i] = (int)(Math.random() * 50) +1;
			System.out.println(tomb[i]);
		}
		System.out.println();
		
		int max = -1;
		for (int i = 0; i < tomb.length; i++) {
			if (tomb[i] % 2 == 0) {
				if (max == -1) {
					max = i;
			} else {
				if (tomb[max] < tomb[i]) {
					max = i;
				}
			}
			}
		}
		System.out.println("A legnagyobb paros szam: " + tomb[max]);
	}

}
