import java.util.Scanner;


public class SzemHaszn {

	public static void main(String[] args) {
		
		Szemely szemely = new Szemely();
		Scanner bemenet = new Scanner(System.in);
		
		System.out.println("Adja meg a szemely nevet");
		szemely.setNev(bemenet.nextLine());
		System.out.println("Adja meg a szemely tomeget");
		szemely.setTomeg(Double.parseDouble(bemenet.nextLine()));
		System.out.println("Adja meg a szemely magassagat");
		szemely.setMagassag(Double.parseDouble(bemenet.nextLine()));
		
		System.out.println(szemely.toString());
		
		bemenet.close();
	}

}
