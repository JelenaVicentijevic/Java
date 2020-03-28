/*
Alpinista je planinar kome moze da se dodeli drugi Alpinista kao partner i koji se penje po
planinama visim od 3000m. Partner moze da se dohvati i postavi. Nije moguce postaviti
partnera ukoliko partner vec ima dodeljenog partnera. Ukoliko alpinista nema dodeljenog
partnera ili je planina manja od 3000m, penjanje je neuspesno. Tekstualni opis je A_ime-ident.
 */
package planinarenje;

public class Alpinista extends Planinar {
	// polje
	private Alpinista partner;

	// konstruktor
	public Alpinista(String ime, String prezime, Alpinista partner) {
		super(ime, prezime);
		this.partner = partner;
	}

	public Alpinista(String ime, String prezime) {
		super(ime, prezime);
	}

	// metode
	public boolean penjanjeA(Planina p) {
		if (p.getVisina() > 3000 && partner!=null && this.penjanje(p))
			return true;
		return false;
	}

	public Alpinista getPartner() {
		return partner;
	}

	public boolean setPartner(Alpinista p) {
		if (partner == null && this.getId()!=p.getId()) {
			partner = p;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "A_" + this.getIme() + "-" + this.getId();
	}
}
