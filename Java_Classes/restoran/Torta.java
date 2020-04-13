package restoran;

public class Torta extends Jelo {

	public Torta(String naziv) {
		super(naziv);
	}

	public boolean tortaSaMargarinom() {
		for (int i = 0; i < getSastojci().size(); i++) {
			if (getSastojci().get(i).getNaziv().toLowerCase().equals("margarin"))
				return true;
		}
		return false;
	}

	public double procenatSecera() {
		for (int i = 0; i < getSastojci().size(); i++) {
			if (getSastojci().get(i).getNaziv().toLowerCase().equals("secer")) {
				int kolicinaSecera = getKolicina().get(i);
				int kolicinaSastojakaTorte = 0;
				for (int j = 0; j < getKolicina().size(); j++) {
					kolicinaSastojakaTorte = kolicinaSastojakaTorte + getKolicina().get(j);
				}
				return kolicinaSecera * 100d / kolicinaSastojakaTorte;
			}
		}
		return 0;
	}
}