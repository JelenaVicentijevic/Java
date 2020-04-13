/*

Sastojak sadr�i naziv i cenu po kilogramu. Svi podaci mogu da se dohvate. 
Omogu�iti da cena mo�e i da se promeni, ali da nikada ne�e biti negativna.

Jelo sadr�i svoj naziv, proizvoljno mnogo sastojaka, a za svaki sastojak treba znati i koliko grama je potrebno. 
Pri kreiranju se zadaje samo naziv jela.
Treba napraviti metodu koja �e omogu�iti dodavanje sastojka koja izgleda ovako:
public void dodajSastojak(Sastojak s, int kolicina);
Lista sastojaka mo�e da se dohvati, kao i naziv.
U klasi jelo postoji metoda koja ra�una koliko novca je potrebno da bi se sve namirnice nabavile.

Torta 	je jelo za koje se mo�e do�i do informacije o tome da li sadr�ii margarin ili ne.
Dodatni zahtev: mo�e se do�i i do informacije o tome koliko procenata �e�era postoji u odnosu na celu tortu.

Supa je jelo za koje se pamti informacija o tome koliko dugo se kuva koja mo�e da se dohvati.

Meni sadr�i listu jela. Sadr�i metodu koja dodaje jelo u meni. Mo�e da se ispi�e ceo meni u slede�em formatu: 
	NAZIVJELA: nazivNamirnice, nazivNamirnice, � , nazivNamirnice
	NAZIVJELA: nazivNamirnice, nazivNamirnice, � , nazivNamirnice
	NAZIVJELA: nazivNamirnice, nazivNamirnice, � , nazivNamirnice
	�.

	Dodatni zahtev: Omogu�iti da svako jelo mo�e da se dohvati na osnovu naziva.

Napraviti glavni program koji �e da kreira nekoliko jela (barem jednu tortu i jednu supu), ispi�e cenu nekog od njih, 
napravi i ispi�e meni.

*/
package restoran;

public class GlavniProgram {

	public static void main(String[] args) {

		// sastojak
		Sastojak s1 = new Sastojak("smedji secer", 75.5);
		System.out.println("Prvi sastojak je " + s1.getNaziv() + ".");
		s1.setCena(-88);
		System.out.println("Cena prvog sastojka po kilogramu je " + s1.getCena() + " dinara.");
		s1.setCena(88);
		System.out.println("Nakon poskupljenja, cena prvog sastojka po kilogramu je " + s1.getCena() + " dinara.");

		// jelo
		Jelo j1 = new Jelo("hleb");
		j1.dodajSastojak(new Sastojak("brasno", 50), 1000);
		j1.dodajSastojak(new Sastojak("so", 30), 10);
		System.out.println(
				"\nDa bi se napravio " + j1.getNazivJela() + " potrebno je " + j1.potrebanNovac() + " dinara.");

		// torta
		Torta t1 = new Torta("reforma");
		Sastojak ts1 = new Sastojak("cokolada", 3000);
		t1.dodajSastojak(ts1, 300);
		Sastojak ts2 = new Sastojak("maslac", 2000);
		t1.dodajSastojak(ts2, 100);
		Sastojak ts3 = new Sastojak("Secer", 80);
		t1.dodajSastojak(ts3, 150);

		if (t1.tortaSaMargarinom())
			System.out.println("\nTorta " + t1.getNazivJela() + " se pravi sa margarinom.");
		else
			System.out.println("\nTorta " + t1.getNazivJela() + " se ne pravi sa margarinom.");

		System.out.println("Torta " + t1.getNazivJela() + " sadrzi " + t1.procenatSecera() + " procenata secera.");

		// supa
		Supa supa1 = new Supa("corba sa pecurkama", 15);
		Sastojak ss1 = new Sastojak("sampinjoni", 150.99);
		supa1.dodajSastojak(ss1, 200);
		Sastojak ss2 = new Sastojak("pavlaka za kuvanje", 200);
		supa1.dodajSastojak(ss2, 155);
		System.out.println("\nZa pripremu " + supa1.getNazivJela() + " potrebno je izdvojiti " + supa1.potrebanNovac()
				+ " dinara.");
		System.out.println("Jelo " + supa1.getNazivJela() + " se priprema " + supa1.getVremeKuvanja() + " minuta.\n");

		// meni
		
		Meni m1 = new Meni();
		m1.dodajJelo(j1);
		m1.dodajJelo(supa1);
		m1.dodajJelo(t1);
		
		System.out.println(m1);
		
		
	}

}
