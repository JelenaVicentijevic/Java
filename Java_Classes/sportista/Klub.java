/*
Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa Sportista. 
Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
Napisati metodu koja ce ispisati ceo objekat klase klub.
 */
package sportista;
public class Klub {

	// polja
	private String naziv;
	private String grad;
	private int godOsnivanja;
	private Sportista[] nizSportista;

	// konstruktor
	public Klub(String naziv, String grad, int godOsnivanja, Sportista[] nizSportista) {
		this.naziv = naziv;
		this.grad = grad;
		this.godOsnivanja = godOsnivanja;
		this.nizSportista = nizSportista;
	}

	// metode
	public String getNaziv() {
		return naziv;
	}

	public String getGrad() {
		return grad;
	}

	public int godOsnivanja() {
		return godOsnivanja;
	}

	public Sportista[] getNizSportista() {
		return nizSportista;
	}

	public String setNaziv(String naziv) {
		this.naziv = naziv;
		return this.naziv;
	}

	@Override
	public String toString() {
		String ispis = naziv + "; " + grad + "; " + godOsnivanja + "; ";
		for (int i = 0; i < nizSportista.length; i++) {
			if (i == nizSportista.length - 1)
				ispis += nizSportista[i] + " ";
			else
				ispis += nizSportista[i] + ", ";
		}
		return ispis;
	}
}
