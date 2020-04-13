package restoran;

public class Sastojak {

	private String naziv;
	private double cena; // cena po kilogramu
	
	public Sastojak(String naziv, double cena) {
		super();
		this.naziv = naziv;
		this.cena = cena;
	}

	public String getNaziv() {
		return naziv;
	}

	public double getCena() {
		return cena;
	}
	
	public boolean setCena(double c) {
		if (c > 0) {
			cena = c;
			return true;
		}
		return false;
	}
}
