/*
 Dete ima ime, prezime, broj godina i broj klikera. 
 Napraviti mogucnost da se kreira vise objekata klase Dete. 
 Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira.
 Napraviti metodu koja ce ispisivati broj klikera i metodu koja ispisuje prosecan broj decjih godina
 (ako imamo troje dece, broj prosecnih godina za njih troje; 
 ako imamo dvoje racunamo prosecne godine za to dvoje).
 */
package child;
public class Dete {

	// polja
	private String ime;
	private String prezime;
	private int brGodDeteta;
	private int brKlikeraDeteta;
	private static int globalBrKlikera = 0;
	private static int globalBrGodDece = 0;
	private static int globalBrDece = 0;

	// konstruktor
	public Dete(String ime, String prezime, int brGodDeteta, int brKlikeraDeteta) {
		this.ime = ime;
		this.prezime = prezime;
		this.brGodDeteta = brGodDeteta;
		this.brKlikeraDeteta = brKlikeraDeteta;
		globalBrKlikera += brKlikeraDeteta;
		globalBrGodDece += brGodDeteta;
		globalBrDece++;
	}

	// metode
	// ako se dodaje odredjeni broj klikera pri pozivu metode se prosledi taj broj
	public void dodajKlikere(int br) {
		if (br > 0) {
			brKlikeraDeteta += br;
			globalBrKlikera += br;
		}
	}

	// ako se prilikom pozivanja metode ne prosledi broj nego se podrazumeva da se
	// doda jedan kliker
	public void dodajKlikere() {
		brKlikeraDeteta++;
		globalBrKlikera++;
	}

	// ako se oduzima odredjeni broj klikera pri pozivu metode se prosledi taj broj
	public void oduzmiKlikere(int br) {
		if (br > 0 && brKlikeraDeteta >= br) {
			brKlikeraDeteta -= br;
			globalBrKlikera -= br;
		}
	}

	// ako se prilikom pozivanja metode ne prosledi broj nego se podrazumeva da se
	// oduzme jedan kliker
	public void oduzmiKlikere() {
		if (brKlikeraDeteta > 0) {
			brKlikeraDeteta--;
			globalBrKlikera--;
		}
	}
	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public int getBrGodDeteta() {
		return brGodDeteta;
	}

	public static int getGlobalBrGodDece() {
		return globalBrGodDece;
	}

	public int getBrKlikeraDeteta() {
		return brKlikeraDeteta;
	}

	public static int getGlobalBrKlikera() {
		return globalBrKlikera;
	}

	public static float prosecanBrGodDece() {
		return (float) globalBrGodDece / globalBrDece;
	}
}
