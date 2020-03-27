/*
 * Zadatak: Napisati program koji ce racunati povrsinu okrecene prostorije,
 * tako sto se ivice prostorije ucitavaju preko konzole (za pretpostavku uzeti da soba
 * ime zidove oblika pravugaonika i da nema prozora).
 */

import java.util.Scanner;

public class Room_painting_if_statement {

	public static void main(String[] args) {

		System.out.println("Uneti sirinu, duzinu i visinu sobe u metrima:");

		Scanner unos = new Scanner(System.in);

		float sirina = unos.nextFloat();
		float duzina = unos.nextFloat();
		float visina = unos.nextFloat();
		float povrsina = 2 * sirina * visina + 2 * duzina * visina + sirina * duzina;

		// u slucaju da je uneta negativna vrednost ili 0 za dimenzije zidova
		if (sirina <= 0 || duzina <= 0 || visina <= 0) {
			System.out.println("Greska! Unos dimenzija sobe nije validan.");
		}

		// ako su unete validne vrednosti dimenzija zidova
		else {
			System.out.println("Unesite da li soba ima 1 vrata ili 0 vrata:");

			int brvrata = unos.nextInt();

			// ako je za broj vrata uneto bilo sta sto nije 0 ili 1
			if (brvrata < 0 || brvrata > 1) {
				System.out.println("Greska! Unos broja vrata nije validan");
			}

			// ako je uneti broj vrata validan
			else {
				
				// ako nema vrata
				if (brvrata == 0) {
					float povrsinaSobe = povrsina;
					System.out.println("Povrsina sobe je " + povrsinaSobe + " kvadratnih metara.");
				} 
				
				// ako postoje jedna vrata 
				else {
					System.out.println("Unesite visinu i sirinu vrata u metrima:");
					float visvrata = unos.nextFloat();
					float sirvrata = unos.nextFloat();

					// ako nije uneta validna dimenzija vrata
					if (visvrata <= 0 || sirvrata <= 0 || visvrata >= visina || sirvrata >= sirina) {
						System.out.println("Greska! Unos dimenzija vrata nije validan");
					} 
					
					// ako je uneta validna dimenzija vrata
					else {
						float povrsinaVrata = visvrata * sirvrata;
						float povrsinaSobe2 = povrsina - povrsinaVrata;
						System.out.println("Povrsina sobe je " + povrsinaSobe2 + " kvadratnih metara.");

					}
				}

			}
		}
		unos.close();
	}

}
