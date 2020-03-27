/*
Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. 
Svi podaci mogu da se dohvate, ali ne i postave.
 */
package bus;

public class Covek {

	// polja
	private String ime;
	private String prezime;

	// konstruktor
	public Covek(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}

	// metode
	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

}
