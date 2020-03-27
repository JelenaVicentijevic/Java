/*
Polaznik  ima ime i prezime koje se zadaje prilikom kreiranja polaznika. 
Ime i prezime polaznika se moze dohvatiti ali ne i postaviti. 
Polaznik se ispisuje u obliku: IME_PREZIME.
 */
package ucionica;

public class Polaznik {
	
	//polje
	private String imePrezime;
	
	//konstruktor
	public Polaznik(String imePrezime) {
		this.imePrezime = imePrezime;
	}
	
	//metode
	public String getImePrezime() {
		return imePrezime;
	}
	@Override
	public String toString() {
		String[] polaznik = imePrezime.toUpperCase().split(" ");
		return polaznik[0] + "_" + polaznik[1];
	}

}
