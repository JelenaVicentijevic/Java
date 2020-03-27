/*
Zadatak: Napisati program koji na osnovu unetog naziva meseca ispisuje koliko ima meseci u
godini koji pocinju na to slovo (na taj glas) - za resavanje ovog zadatka koristiti switch.
 */

import java.util.Scanner;

public class Switch_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Unesite naziv meseca u godini malim slovima bez razmaka" + ":");

		Scanner sc = new Scanner(System.in);

		boolean unos = false;

		String mesec;

		while (unos == false) {

			mesec = sc.nextLine();

			switch (mesec) {
			case "januar":
			case "jun":
			case "jul":
				System.out.println("Ima " + 3 + " meseca u godini koja pocinju na to slovo.");
				unos = true;
				break;
			case "februar":
			case "septembar":
			case "oktobar":
			case "novembar":
			case "decembar":
				System.out.println("Ima " + 1 + " mesec u godini koja pocinje na to slovo.");
				unos = true;
				break;
			case "mart":
			case "maj":
			case "april":
			case "avgust":
				System.out.println("Ima " + 2 + " meseca u godini koja pocinju na to slovo.");
				unos = true;
				break;
			default:
				System.out.println("Nije unet validan naziv meseca. Unesite ponovo");
				break;
			}
		}
		sc.close();

	}

}
