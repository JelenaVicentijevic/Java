/*
Napisati program u programskom jeziku Java koji ispunjava sledece funkcionalnosti:
-   Sacuva jednu rec proizvoljno odabranu u jednoj promeljivoj.
-	Omogucava korisniku da unosi reci sve dok ne pogodi rec koja je odabrana u prethodnom koraku.
-	Nakon svakog korisnickog unosa ispisati poruku da li je pogodio rec ili nije
-	Sacuvati zadatak koji ispunjava prethodne zahteve. 
Modifikovati ga tako da korisnik moze da pogadja rec najvise pet puta.
*/
package unosenje_reci;

import java.util.Scanner;

public class PogadjajRec5Puta {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String izabranaRec = "TEST";
		String rec = "";

		for (int i = 0; i < 5; i++) {
			System.out.println("Unesite rec koja mislite da je zadata:");
			rec = sc.next();
			if (izabranaRec.equals(rec.toUpperCase())) {
				System.out.println("Bravo! Pogodili ste rec u " + (i + 1) + ". pokusaju.");
				i = 5;
			} else if (i == 4) {
				System.out
						.println("Nazalost niste uspeli da pogodite rec. Iskoristili ste svih 5 pokusaja.");
			} else {
				System.out.println("To nije izabrana rec. Imate jos " + (4 - i) + " pokusaja.");
			}
		}
		sc.close();
	}

}
