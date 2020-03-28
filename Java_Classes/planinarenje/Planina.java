/*
Planina ima ime i visinu (u metrima) koji mogu da se dohvate. Moze da se sastavi tekstualni
opis planine u obliku ime(visina). Takodje planina sadrizi listu planinara. Moze da se dohvati
planinar na nekoj odredjenoj poziciji u listi, moguce je da se doda/ukloni planinar. Takodje
moguce je ispisati sve planinare na planini u obliku [ime-ident,ime-ident,ime-ident...]
*/
package planinarenje;

import java.util.ArrayList;

public class Planina {
	// polja
	private String ime;
	private float visina;
	private ArrayList<Planinar> planinari;

	// konstruktor
	public Planina(String ime, float visina) {
		super();
		this.ime = ime;
		this.visina = visina;
		planinari = new ArrayList<Planinar>();
	}

	// metode
	public String getIme() {
		return ime;
	}

	public float getVisina() {
		return visina;
	}

	public Planinar getPlaninar(int id) {
		return planinari.get(id);
	}
	public ArrayList<Planinar> getPlaninari(){
		return planinari;
	}
	
	public void dodajPlaninara(Planinar p) {
		planinari.add(p);
	}

	public void ukloniPlaninara(Planinar p) {
		for (int i = 0; i < planinari.size(); i++) {
			if (p == planinari.get(i))
				planinari.remove(i);
		}
	}

	public String ispisPlaninara() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < planinari.size(); i++) {
			if (i<planinari.size()-1) sb.append(planinari.get(i)).append(",");
			else sb.append(planinari.get(i));
		}
		sb.append("]");
		return sb.toString();
	}

	@Override
	public String toString() {
		return ime + "(" + visina + ")";
	}

}
