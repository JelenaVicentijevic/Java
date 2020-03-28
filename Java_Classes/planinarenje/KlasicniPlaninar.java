/*
Klasicni planinar je plainar koji se penje po planinama nizim od 2000m,inace je penjanje
neuspesno.Tekstualni oblik je K_ime-ident.
*/
package planinarenje;

public class KlasicniPlaninar extends Planinar {
	// konstruktor
	public KlasicniPlaninar(String ime, String prezime) {
		super(ime, prezime);

	}

	// metode
	public boolean penjanjeK(Planina p) {
		if (p.getVisina() < 2000 && this.penjanje(p))
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "K_" + this.getIme() + "-" + this.getId();
	}

}
