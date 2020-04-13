package restoran;

public class Supa extends Jelo{

	private double vremeKuvanja; // u minutima
	
	public Supa(String naziv, double vreme) {
		super(naziv);
		this.vremeKuvanja= vreme;
	}

	public double getVremeKuvanja() {
		return vremeKuvanja;
	}
}
