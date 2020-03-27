/*
Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. 
Tekstualni oblik je nadimak_ime[naziv_pozorista].
*/
package theatre;
public class Reditelj extends Zaposleni {

	// polja
	private String nadimak;

	// konstruktor
	public Reditelj(String ime, Pozoriste pozoriste, String nadimak) {
		super(ime, pozoriste);
		this.nadimak = nadimak;
	}

	// metode
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nadimak).append("_");
		sb.append(this.getIme()).append("[");
		sb.append(this.getPozoriste().getNaziv()).append("]");
		return sb.toString();
	}

}
