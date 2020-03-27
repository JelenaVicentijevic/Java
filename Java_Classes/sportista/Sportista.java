/*
Sportista poseduje ime, prezime i godinu rodjenja. 
Ime, prezime i godina rodjenja se zadaju prilikom kreiranja i ne mogu da se promene. 
Sportistu ispisati u obliku: IME_PREZIME: godinaRodjenja
 */
package sportista;
public class Sportista {
	// polja
	private String ime;
	private String prezime;
	private int godiste;

	// konstruktor
	public Sportista(String ime, String prezime, int godiste) {
		this.ime = ime;
		this.prezime = prezime;
		this.godiste = godiste;
	}

	// metode
	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getGodiste() {
		return godiste;
	}

	@Override
	public String toString() {
		return ime.toUpperCase() + "_" + prezime.toUpperCase() + ": " + godiste;
	}

}
