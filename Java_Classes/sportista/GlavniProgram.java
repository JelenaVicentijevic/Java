/*
Sportista poseduje ime, prezime i godinu rodjenja. 
Ime, prezime i godina rodjenja se zadaju prilikom kreiranja i ne mogu da se promene. 
Sportistu ispisati u obliku: IME_PREZIME: godinaRodjenja
Klub poseduje naziv, sediste (grad), godinu osnivanja i niz sportista tipa Sportista. 
Sva polja mogu da se dohvate, a naziv kluba moze i da se postavi.
Napisati metodu koja ce ispisati ceo objekat klase klub.
Napisati glavni program, gde cete testirati kako ove klase funkcionisu.

Dodatni domaci: napravi niz koji ce imati sve klubove za koje je sportista igrao.
 */

package sportista;
public class GlavniProgram {

	public static void main(String[] args) {

		// objekti klase Sportista
		Sportista s1 = new Sportista("pera", "peric", 1990);
		Sportista s2 = new Sportista("misa", "misic", 1985);
		Sportista s3 = new Sportista("zika", "zikic", 2000);

		System.out.println("Prvi sportista se zove " + s1.getIme());
		System.out.println("Drugi sportista se preziva " + s2.getPrezime());
		System.out.println("Treci sportista je rodjen " + s3.getGodiste());

		System.out.println("\nPodaci o sportistima su:\n" + s1 + "\n" + s2 + "\n" + s3 + "\n");

		// nizovi sportista
		Sportista[] fudbaleri1 = { s1, s2, s3 };
		Sportista[] fudbaleri2 = { s1, s3 };
		Sportista[] fudbaleri3 = { s1, s2 };
		System.out.println("Fudbaleri1 kao svog drugog clana imaju sportistu sa imenom i prezimenom "
				+ fudbaleri1[1].getIme() + " " + fudbaleri1[1].getPrezime());

		// objekti klase Klub
		Klub k1 = new Klub("Real Madrid", "Madrid", 1902, fudbaleri3);
		Klub k2 = new Klub("Atletiko", "Madrid", 1905, fudbaleri1);
		Klub k3 = new Klub("Inter", "Milan", 1908, fudbaleri2);
		Klub k4 = new Klub("Crvena zvezda", "Beograd", 1945, fudbaleri1);
		Klub k5 = new Klub("Partizan", "Beograd", 1945, fudbaleri2);

		k1.setNaziv("Real");
		System.out.println("\nSvi podaci o klubu k1 su:");
		System.out.println(k1);

		//Dodatni domaci: napravi niz koji ce imati sve klubove za koje je sportista igrao.
		
		// niz svih klubova
		Klub[] klubovi = { k1, k2, k3, k4, k5 };

		// niz klubova sportiste s1
		Klub[] kluboviSportisteS1 = new Klub[klubovi.length];
		int pozS1 = 0; // popunjena duzina niza klubova sportiste s1(elementi koji nisu null

		// prva for petlja vrti klubove iz niza svih klubova
		for (int i = 0; i < klubovi.length; i++) {
			// druga for petlja vrti sportiste u tom konkretnom klubu (u tom elementu niza
			// svih klubova)
			for (int j = 0; j < klubovi[i].getNizSportista().length; j++) {
				if (s1 == klubovi[i].getNizSportista()[j]) {
					kluboviSportisteS1[pozS1] = klubovi[i];
					pozS1++;
				}
			}
		}

		System.out.println("\nSportista " + s1 + " je igrao u klubovima:");
		for (int i = 0; i < pozS1; i++) {
			if (i != pozS1 - 1)
				System.out.print(kluboviSportisteS1[i].getNaziv() + ", ");
			else
				System.out.println(kluboviSportisteS1[i].getNaziv() + ".");
		}

		// niz klubova sportiste s2
		Klub[] kluboviSportisteS2 = new Klub[klubovi.length];
		int pozS2 = 0;
		for (int i = 0; i < klubovi.length; i++) {
			for (int j = 0; j < klubovi[i].getNizSportista().length; j++) {
				if (s2 == klubovi[i].getNizSportista()[j]) {
					kluboviSportisteS2[pozS2] = klubovi[i];
					pozS2++;
				}
			}
		}

		System.out.println("\nSportista " + s2 + " je igrao u klubovima:");
		for (int i = 0; i < pozS2; i++) {
			if (i != pozS2 - 1)
				System.out.print(kluboviSportisteS2[i].getNaziv() + ", ");
			else
				System.out.println(kluboviSportisteS2[i].getNaziv() + ".");
		}

		// niz klubova sportiste s3
		Klub[] kluboviSportisteS3 = new Klub[klubovi.length];
		int pozS3 = 0;
		for (int i = 0; i < klubovi.length; i++) {
			for (int j = 0; j < klubovi[i].getNizSportista().length; j++) {
				if (s3 == klubovi[i].getNizSportista()[j]) {
					kluboviSportisteS3[pozS3] = klubovi[i];
					pozS3++;
				}
			}
		}

		System.out.println("\nSportista " + s3 + " je igrao u klubovima:");
		for (int i = 0; i < pozS3; i++) {
			if (i != pozS3 - 1)
				System.out.print(kluboviSportisteS3[i].getNaziv() + ", ");
			else
				System.out.println(kluboviSportisteS3[i].getNaziv() + ".");
		}

	}

}
