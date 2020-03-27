/*
Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].
 */
package theatre;
public class Glumac extends Zaposleni {

	// polja
	private String uloga;

	// konstruktor
	public Glumac(String ime, Pozoriste pozoriste, String uloga) {
		super(ime, pozoriste);
		this.uloga = uloga;
	}

	// metode
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(uloga).append("_").append(this.getIme()).append("[");
		sb.append(this.getPozoriste().getNaziv()).append("]");
		return sb.toString();
	}

}
