/*
Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i naziv koji mogu da se dohvate. 
Moze da se sastavi tekstualni opis u obliku naziv[id].

Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen. 
Svi podaci mogu da se dohvate. Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].

Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].

Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].

Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju 
u realizaciji predstave. Zaposleni za realizaciju predstave mogu da se dodaju i izbace. 
Moze da se dohvati broj zaposlenih na predstavi.
Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista u kojem se 
predstava odrzava razdvojene zarezom, a potom zaposlene koji ucestvuju u realizaciji predstave 
(svakog zaposlenog u zasebnom redu).
 */
package theatre;
public class GlavniProgram {

	public static void main(String[] args) {

		Pozoriste p1 = new Pozoriste("Narodno pozoriste");
		System.out.println(p1);
		System.out.println("ID globalni je trenutno " + Pozoriste.getGlobalId());

		Zaposleni z1 = new Zaposleni("Pera Peric", p1);

		System.out.println("Zaposleni " + z1);

		Glumac g1 = new Glumac("Nina Ninic", new Pozoriste("Beogradsko dramsko"), "knjizevnica");

		System.out.println("Glumica " + g1);
		System.out.println(g1.getPozoriste());
		System.out.println("Sada je global ID " + Pozoriste.getGlobalId());

		Reditelj r1 = new Reditelj("Jovan Jovanovic", g1.getPozoriste(), "Joca");
		System.out.println("Reditelj " + r1);

		Predstava pr = new Predstava("Mali princ", p1);
		pr.dodajZaposlenog(g1);
		pr.dodajZaposlenog(r1);
		pr.dodajZaposlenog(z1);

		System.out.println("Predstava: " + pr);
		System.out.println("Broj zaposlenih na predstavi pr " + pr.dohvatiBrZaposlenih());
	}

}
