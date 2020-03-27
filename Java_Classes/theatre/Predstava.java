/*
Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju 
u realizaciji predstave. Zaposleni za realizaciju predstave mogu da se dodaju i izbace. 
Moze da se dohvati broj zaposlenih na predstavi.
Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se 
predstava odrzava razdvojene zarezom, a potom zaposlene koji ucestvuju u realizaciji predstave 
(svakog zaposlenog u zasebnom redu).
*/
package theatre;
import java.util.ArrayList;

public class Predstava {
	// polja
	private String naziv;
	private Pozoriste pozoriste;
	private ArrayList<Zaposleni> zaposleni;

	// konstruktor
	public Predstava(String naziv, Pozoriste pozoriste) {
		this.naziv = naziv;
		this.pozoriste = pozoriste;
		zaposleni = new ArrayList<Zaposleni>();
	}
	// metode
	public void dodajZaposlenog(Zaposleni z) {
		zaposleni.add(z);
	}
	public void oduzmiZaposlenog(Zaposleni z) {
		for(int i=0; i<zaposleni.size(); i++) {
			if(z==zaposleni.get(i)) {
				zaposleni.remove(i);
			}
		}
	}
	public int dohvatiBrZaposlenih() {
		return zaposleni.size();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n").append(naziv).append(", ").append(pozoriste.naziv).append("\n");
		
		for(int i=0; i<zaposleni.size(); i++) {
			sb.append(zaposleni.get(i)).append("\n");
		}
		return sb.toString();
	}
	
}
