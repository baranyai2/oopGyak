package harmadik;

import java.awt.Color;

import sajat.ISzinezheto;

public class Toll extends Aru implements ISzinezheto {

	Color szin;
	private String markanev;
	
	public Toll(String nev, String markanev,  int ar, Color szin) {
		super(nev, ar);
		this.szin = szin;
		this.markanev =  markanev;
	}

	@Override
	public Color getSzin() {
		return szin;
	}

	@Override
	public void setSzin(Color szin) {
		this.szin = szin;
	}

	@Override
	public String toString() {
		return "Toll szin: " + szin + " Markanev: " + markanev +  super.toString();
	}
	
	public boolean markaEgyenlo(Toll masikToll) {
		return markanev.equals(masikToll.markanev);
	}
}
