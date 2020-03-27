/*
 Zadatak: U zgradi se nalazi lift nosivosti 680kg. Napisati program koji proverava 
 da li ce lift bezbedno krenuti u zavisnosti od tezine koju treba da ponese. 
 Podrazumevane 3 opcije:
 1) Lift je preopterecen,
 2) Na granici je,
 3) Lift je pokrenut (zahtevi zadatka namerno nisu dalje razradjivani).
 */

import java.util.Scanner;

public class Lift_logic {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// broj osoba u liftu
		int brOsoba;

		// masa jedne osobe
		double masa = 0;

		// ukupna masa u liftu
		double ukupnaMasa = 0;

		// promenljiva koja broji iteracije u petlji
		int b = 1;

		// ukupna masa osoba izaslih iz lifta na spratu
		double masaIzlaz;

		// predstavlja ukupnu masu osoba koje su usle u lift na spratu
		double masaUlaz;

		// uneti broj osoba koje ulaze u lift pre prvog pokretanja lifta
		System.out.println("Uneti broj osoba koje su u liftu:");

		brOsoba = sc.nextInt();

		while (brOsoba < 0) {

			System.out.println("Niste uneli validan broj. Broj osoba u liftu ne moze biti negativan");

			brOsoba = sc.nextInt();
		}

		// unosenje mase za svaku osobu koja je u liftu
		while (b <= brOsoba) {

			System.out.println("Unesite masu " + b + ". osobe:");

			masa = sc.nextDouble();

			while (masa <= 0) {

				System.out.println("Greska! Unet broj nije validan. Masa osobe ne moze biti negativan broj.");

				masa = sc.nextDouble();
			}

			ukupnaMasa = ukupnaMasa + masa;

			if (ukupnaMasa > 680) {

				System.out.println("Lift je preopterecen!!! Svih " + brOsoba + " osoba ne moze da udje u lift!");

				b = b - 1;

				ukupnaMasa = ukupnaMasa - masa;

				System.out.println("U liftu je " + b + " osoba. Ostale " + (brOsoba - b)
						+ " osobe moraju da sacekaju da se lift isprazni!");

				brOsoba = b;

				break;
			}

			b = b + 1;

		}

		System.out.println("Trenutna ukupna masa u liftu je " + ukupnaMasa + " kg.");

		// rad lifta sve dok ne dodje do preopterecenosti
		while (ukupnaMasa <= 680) {

			System.out.println("Lift se zaustavio na spratu.");

			if (ukupnaMasa != 0) {

				System.out.println("Uneti ukupnu masu osoba koje su izasle iz lifta na spratu:");

				masaIzlaz = sc.nextDouble();

				while (masaIzlaz < 0 || ukupnaMasa < masaIzlaz) {

					if (masaIzlaz < 0)

						System.out.println(
								"Greska! Ukupna masa osoba izaslih iz lifta na spratu ne moze biti negativan broj!");

					else
						System.out.println(
								"Greska! Ukupna masa osoba koje su izasle na spratu ne moze biti veca od ukupne mase osoba u liftu!");

					masaIzlaz = sc.nextDouble();
				}

				ukupnaMasa = ukupnaMasa - masaIzlaz;

				if (ukupnaMasa == 680)

					System.out.println("Trenutna ukupna masa u liftu je " + ukupnaMasa
							+ " kg. Lift je na granici preopterecenosti!");

				else
					System.out.println("Trenutna ukupna masa u liftu je " + ukupnaMasa + " kg.");
			}

			System.out.println("Uneti ukupnu masu osoba koje su usle u lift na spratu");

			masaUlaz = sc.nextDouble();

			while (masaUlaz < 0) {

				System.out.println("Greska. Masa osoba koje su usle u lift ne moze biti negativan.");

				masaUlaz = sc.nextDouble();
			}

			ukupnaMasa = ukupnaMasa + masaUlaz;

			if (ukupnaMasa <= 680) {

				if (ukupnaMasa == 680)

					System.out.println("Trenutna ukupna masa u liftu je " + ukupnaMasa
							+ " Upozorenje! Lift je na granici preopterecenosti!");

				else
					System.out.println("Trenutna ukupna masa u liftu je " + ukupnaMasa + " kg.");

			}

		}

		System.out.println("Lift se pokvario usled preopterecenosti!!! Za popravku lifta pokrenuti program ponovo.");

		sc.close();
	}

}
