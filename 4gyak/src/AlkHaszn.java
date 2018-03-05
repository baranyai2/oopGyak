import java.util.Random;


public class AlkHaszn {

	public static void main(String[] args) {
		Alkalmazott alkalmazott = new Alkalmazott();
		
		alkalmazott.setNev("Kiss Jozsef");
		alkalmazott.setFizetes(20);
		
		System.out.println(alkalmazott.getNev());
		System.out.println(alkalmazott.getFizetes());
		System.out.println(alkalmazott);
		alkalmazott.fizetestNovel(5);
		System.out.println(alkalmazott);
		System.out.println(alkalmazott.fizetesIntervallumokKozott(10, 50));
		System.out.println(alkalmazott.fizetendoAdo());
		
		Alkalmazott alkalmazott2 = new Alkalmazott();
		alkalmazott2.setNev("Kiss Klaudia");
		alkalmazott2.setFizetes(80);
		
		Alkalmazott[] alkalmazottak = new Alkalmazott[5];
		Random rnd_obj = new Random();
		
		for (int i = 0; i < alkalmazottak.length; i++) {
			alkalmazottak[i] = new Alkalmazott();
			alkalmazottak[i].setNev("A");
			alkalmazottak[i].setFizetes(rnd_obj.nextInt(50) + 1);
			System.out.println(alkalmazottak[i]);
		}
	}

}
