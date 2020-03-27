/*
Putnik je covek koji poseduje novac. 
Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom kreiranja. 
Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.
*/

package bus;

public class Putnik extends Covek {
	// polja
	private int novac;

	// konstruktor
	public Putnik(String ime, String prezime, int novac) {
		super(ime, prezime);
		if (novac <= 0) // ako neko pri kreiranju objekta unese slucajno negativan broj, neka ispise 0,
						// jer nema smisla da iznos novca bude negativan broj
			this.novac = 0;
		else
			this.novac = novac;
	}

	// metode
	public int getNovac() {
		return novac;
	}

	public boolean dodajNovac(int iznos) {
		if (iznos > 0) {
			novac += iznos;
			return true;
		}
		return false;
	}

	public boolean oduzmiNovac(int iznos) {
		if (iznos > 0 && iznos <= novac) {
			novac -= iznos;
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Character.toUpperCase(this.getIme().charAt(0)));
		sb.append(this.getIme().substring(1).toLowerCase()).append(" ");
		sb.append(Character.toUpperCase(this.getPrezime().charAt(0)));
		sb.append(this.getPrezime().substring(1).toLowerCase());
		sb.append("[").append(novac).append("]");
		return sb.toString();
	}

}
