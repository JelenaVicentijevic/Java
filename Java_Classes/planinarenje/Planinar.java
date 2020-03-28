/*
Planinar ima ime, prezime i jedinstveni celobrojni identifikacioni broj. Planinar moze da se penje
po zadatoj planini. Penjanje moze biti uspesno ili neuspesno. Moze da se sastavi tekstualni
opis planinara u obliku ime-ident.
*/
package planinarenje;

public class Planinar {
	// polja
	private String ime;
	private String prezime;
	private int id;
	private static int globalId = 1; // brojanje krece od 1

	// konstruktor
	public Planinar(String ime, String prezime) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		id = globalId;
		globalId++;
	}

	// metode
	public boolean penjanje(Planina p) {
		if (p.getPlaninari() != null) {
			for (int i = 0; i < p.getPlaninari().size(); i++) {
				if (id == p.getPlaninar(i).id)
					return true;
			}
		}
		return false;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getId() {
		return id;
	}

	public static int getGlobalId() {
		return globalId;
	}

	@Override
	public String toString() {
		return ime + "-" + id;
	}

}
