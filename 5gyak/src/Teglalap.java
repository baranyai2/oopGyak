
public class Teglalap {
	
	private int aoldal;
	private int boldal;
	
	public Teglalap(int aoldal, int boldal) {
		setOldalak(aoldal, boldal);
	}
	
	public Teglalap(int oldalhossz) {
		setOldalak(oldalhossz);
	}
	
	public int terulet() {
		return aoldal * boldal;
	}

	@Override
	public String toString() {
		return "a_oldal: " + aoldal + ", b_oldal: " + boldal + ", terulet: " + terulet();
	}

	public void setOldalak (int aoldal, int boldal) {
		this.aoldal = aoldal;
		this.boldal = boldal;
	}
	
	public void setOldalak (int oldalhossz) {
		this.aoldal = this.boldal = oldalhossz;
	}
	
	public boolean teruletNagyobbMint(Teglalap masikTeglalap) {
		return terulet() > masikTeglalap.terulet();
	}
	
	public boolean egyezikE(Teglalap masikTeglalap) {
		return aoldal == masikTeglalap.aoldal && boldal == masikTeglalap.boldal;
	}
	
}