/*
Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).
*/

package bus;

public class Vozac extends Covek {

	// polja
	private String zanimanje;

	// konstruktor
	public Vozac(String ime, String prezime) {
		super(ime, prezime);
		zanimanje = "sofer"; // pretpostavka je da je potrebno da zanimanje pri kreiranju objekta vozaca bude
							 // postavljeno na sofer
	}

	@Override // pretpostavka je da ce se vozac ispisivati u formatu Ime Prezime: zanimanje
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Character.toUpperCase(this.getIme().charAt(0)));
		sb.append(this.getIme().substring(1).toLowerCase()).append(" ");
		sb.append(Character.toUpperCase(this.getPrezime().charAt(0)));
		sb.append(this.getPrezime().substring(1).toLowerCase()).append(": ");
		sb.append(zanimanje);

		return sb.toString();
	}

}
