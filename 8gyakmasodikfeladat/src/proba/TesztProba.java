package proba;

import java.awt.Color;
import harmadik.SzinesPont;
import harmadik.Toll;
import sajat.ISzinezheto;

public class TesztProba {

	public static void main(String[] args) {
		ISzinezheto szinespont = new SzinesPont(Color.BLUE);
		
		System.out.println(szinespont);
		szinespont.setSzin(Color.GREEN);
		System.out.println(szinespont);
		
		atszinezo(szinespont);
		System.out.println(szinespont);
		
		ISzinezheto toll = new Toll("toll", "Parker", 2000, Color.CYAN);
		
		System.out.println(toll);
		toll.setSzin(Color.ORANGE);
		System.out.println(toll);
		atszinezo(toll);
		System.out.println(toll);
		System.out.println(((Toll)toll).markaEgyenlo((Toll)toll));
	}
	
	public static void atszinezo(ISzinezheto szinespont) {
		szinespont.setSzin(ISzinezheto.alapertelmezettSzin);
		}
}

