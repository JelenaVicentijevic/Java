/*
Napisati program u programskom jeziku Java koji ispunjava sledece funkcionalnosti:
-   Sacuva jednu rec proizvoljno odabranu u jednoj promeljivoj.
-	Omogucava korisniku da unosi reci sve dok ne pogodi rec koja je odabrana u prethodnom koraku.
-	Nakon svakog korisnickog unosa ispisati poruku da li je pogodio rec ili nije
*/
package unosenje_reci;

import java.util.Scanner;

public class PogadjajRec {

	public static void main(String[] args) {
		String izabranaRec = "TEST";
		String rec = "";
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Unesite rec koja mislite da je izabrana:");
			
			rec = sc.next();
			if (!izabranaRec.equals(rec.toUpperCase())) {
				System.out.println("Nazalost niste pogodili rec. Pokusajte ponovo.");
			}
			
		} while (!izabranaRec.equals(rec.toUpperCase()));

		System.out.println("Bravo! Pogodili ste rec.");
		
		sc.close();
	}

}
