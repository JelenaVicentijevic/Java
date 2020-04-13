/*
Zadatak 1:
Zadatak predstavlja jedan deo kartaške igre Tabliæ. 

-	Napraviti metodu koja ce da u jedan niz ucita sve karte koje je jedan korisnik sakupio. 
Karte uèitavati kao cele brojeve - kec je broj 11, žandar 12, dama 13 i kralj 14. 
Tražiti od korisnika da uèita koliko karata ima, a nakon toga koje su to karte. 
Voditi raèuna o tome da li su broj karata, kao i svaka karta korektne vrednosti.

-	Napraviti metodu koja broji koliko ima štihova u nizu. 
Podrazumevati da mala dvojka i dupla desetka nemaju specijalno znacenje.

-	Napraviti metodu koja æe za dva prosleðena niza vratiti informaciju o tome ko je pobednik
 (ko ima više sakupljenih štihova).

-	Napraviti glavni program koji prikazuje primenu svih prethodno napisanih metoda.
 */

package tablic;

import java.util.Scanner;

public class Tablic {

	// metoda za unos broja karata igraca i za ucitavanje svake karte koju igrac ima

	@SuppressWarnings("resource")
	public static int[] ucitajKarte() {
		System.out.println("Unesite broj karata:");
		Scanner sc = new Scanner(System.in);
		int br = sc.nextInt();
		while (br < 0 || br > 52) {
			System.out.println("Greska! Unos nije validan. Unesite ponovo broj karata:");
			br = sc.nextInt();
		}
		int[] nizKarata = new int[br];
		System.out.println("Unesite karte koje imate kao cele brojeve: ");
		for (int i = 0; i < nizKarata.length; i++) {
			nizKarata[i] = sc.nextInt();
			while (nizKarata[i] <= 1 || nizKarata[i] > 14) {
				System.out.println("Greska! Unos karte nije validan, unesite ponovo:");
				nizKarata[i] = sc.nextInt();
			}
		}
		return nizKarata;
	}

	// metoda koja broji koliko ima stihova u nizu
	public static int prebrojStihove(int[] niz) {
		int brojac = 0;
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] >= 10) {
				brojac++;
			}
		}
		return brojac;
	}

	// metoda koja vraca informaciju ko je pobednik na osnovu dva prosledjena niza
	public static void pobednik(int[] n1, int[] n2) {
		int b1 = 0;
		for (int i = 0; i < n1.length; i++) {
			if (n1[i] >=10) {
				b1++;
			}
		}
		int b2 = 0;
		for (int i = 0; i < n2.length; i++) {
			if (n2[i] >=10) {
				b2++;
			}
		}

		if (b1 == b2) {
			System.out.println("Nereseno je.");
		} else {
			if (b1 > b2) {
				System.out.println("Pobednik je igrac1.");
			} else {
				System.out.println("Pobednik je igrac2.");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Prvi igrac unosi karte:");
		int[] igrac1 = ucitajKarte();
		System.out.println("Drugi igrac unosi karte:");
		int[] igrac2 = ucitajKarte();

		int brStihovaIgraca1 = prebrojStihove(igrac1);
		System.out.println("Igrac1 ima ukupno " + brStihovaIgraca1 + " stihova.");
		int brStihovaIgraca2 = prebrojStihove(igrac2);
		System.out.println("Igrac2 ima ukupno " + brStihovaIgraca2 + " stihova.");

		pobednik(igrac1, igrac2);
	}

}
