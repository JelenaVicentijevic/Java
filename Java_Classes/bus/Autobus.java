/*
Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. 
Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca. 
Moguce je naplatiti kartu putnicima samo ako je vozac prisutan. 
Autobus ispisati u sledecem obliku:
Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )
*/

package bus;

import java.util.ArrayList;

public class Autobus {

	// polja
	private String naziv;
	private Vozac vozac;
	private int cenaKarte;
	private ArrayList<Putnik> putnici;
	private int brPutnikaSaKartom; // zbog resavanja naplate putnika koji su vec u autobusu i onih koji su tek usli

	// konstruktor
	public Autobus(String naziv, int cenaKarte) {
		this.naziv = naziv;
		this.cenaKarte = cenaKarte;
		putnici = new ArrayList<Putnik>();
	}

	// metode
	public void dodajPutnika(Putnik p) {
		putnici.add(p);
	}

	public void ukloniPutnikaIzlazak(Putnik p) {
		putnici.remove(p);
		brPutnikaSaKartom--;
	}

	public boolean dodajVozaca(Vozac v) {
		vozac = v;
		return true;
	}

	public boolean ukloniVozaca(Vozac v) {
		vozac = null;
		return true;
	}

	public void naplatiKartu() {
		if (vozac != null) {
			for (int i = brPutnikaSaKartom; i < putnici.size(); i++) {
				// putnici koji nemaju dovoljno novca za kartu ce biti izbaceni
				if (putnici.get(i).oduzmiNovac(cenaKarte) == false)
					putnici.remove(i);
				else
					brPutnikaSaKartom++;
			}
		}

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(naziv).append(" ( ").append(vozac).append(" - ");
		for (int i = 0; i < putnici.size(); i++) {
			if (i < putnici.size() - 1)
				sb.append(putnici.get(i)).append(", ");
			else
				sb.append(putnici.get(i));
		}
		sb.append(" ) ");
		return sb.toString();
	}

}
