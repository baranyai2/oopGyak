package proba;

import java.awt.Color;

import org.omg.CORBA.PUBLIC_MEMBER;

import harmadik.SzinesPont;
import sajat.ISzinezheto;

public class TesztProba {

	public static void main(String[] args) {
		ISzinezheto szinespont = new SzinesPont(Color.BLUE);
		
		System.out.println(szinespont);
		szinespont.setSzin(Color.GREEN);
		System.out.println(szinespont);
		
		atszinezo(szinespont);
		System.out.println(szinespont);
		
		}
	
	public static void atszinezo(ISzinezheto szinespont) {
		szinespont.setSzin(ISzinezheto.alapertelmezettSzin);
		}
	}

