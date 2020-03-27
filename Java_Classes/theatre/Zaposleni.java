/*
Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen. 
Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].
*/
package theatre;
public class Zaposleni {

	// polja
	private String ime; // polje sadrzi ime i prezime
	private Pozoriste pozoriste;

	// konstruktor
	public Zaposleni(String ime, Pozoriste pozoriste) {
		super();
		this.ime = ime;
		this.pozoriste = pozoriste;
	}

	// metode
	public String getIme() {
		return ime;
	}

	public Pozoriste getPozoriste() {
		return pozoriste;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(ime).append("[").append(pozoriste.naziv);
		//ukoliko je potreban ispis sa donjom crtom izmedju reci koje cine naziv pozorista
	/*	String[] reci = pozoriste.getNaziv().split(" ");

		sb.append(ime).append("[");
		for (int i = 0; i < reci.length; i++) {
			if (i < reci.length - 1)
				sb.append(reci[i]).append("_");
			else
				sb.append(reci[i]);

		}*/
		sb.append("]");
		return sb.toString();
	}

}
