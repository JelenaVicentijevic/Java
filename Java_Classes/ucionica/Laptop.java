/*
Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju prilikom kreiranja. 
Marka moze samo da se dohvati. Lista polaznika koji koriste laptop moze da se prosiri i da se smanji. 
Moze da se ispise u obliku (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
 */
package ucionica;

import java.util.ArrayList;

public class Laptop {

	// polja
	private String marka;
	private ArrayList<Polaznik> polaznik;

	// konstruktor
	public Laptop(String marka, ArrayList<Polaznik> polaznik) {
		this.marka = marka;
		this.polaznik = polaznik;
	}

	// metode
	public String getMarka() {
		return marka;
	}
	public ArrayList<Polaznik> getPolaznik(){
		return polaznik;
	}
	public void dodajPolaznika(Polaznik novi) {
		polaznik.add(novi);
	}
	public void izbrisiPolaznika(Polaznik brisi) {
		polaznik.remove(brisi);
	}
	
	@Override
	public String toString() {
		String ispis = marka.toUpperCase() + "{";
		for (int i = 0; i < polaznik.size(); i++) {
			if (polaznik.get(i) != polaznik.get(polaznik.size() - 1))
				ispis = ispis + polaznik.get(i) + ", ";
			else
				ispis = ispis + polaznik.get(i);
		}
		return ispis+"}";
	}

}
