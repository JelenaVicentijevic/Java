/*
Napisati program koji ucitava duzinu niza, niz i proverava da li je niz rastuci.
Primer1 niza: 3 54 123 18
Ispis: Niz nije rastuci.
Primer2 niza: 71 422 1001 5054
Ispis: Niz je rastuci.
 */

import java.util.Scanner;

public class Ascending_array_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite duzinu niza:");
		int duzina = sc.nextInt();

		while (duzina <= 0) {
			System.out.println("Duzina niza ne moze biti 0, niti negativan broj. Unesite duzinu niza ponovo:");
			duzina = sc.nextInt();
		}

		int[] nizbrojeva = new int[duzina];
		int i;
		boolean rastuci = false;

		for (i = 0; i < nizbrojeva.length; i++) {
			System.out.println("Unesite element niza na poziciji " + i + ": ");
			nizbrojeva[i] = sc.nextInt();
		}

		System.out.print("Elementi niza su: ");
		for (i = 0; i < nizbrojeva.length; i++) {
			System.out.print(nizbrojeva[i] + " ");
		}
		System.out.println();

		for (i = 0; i < nizbrojeva.length - 1; i++) {
			if (nizbrojeva[i] < nizbrojeva[i + 1])
				rastuci = true;
			else {
				rastuci = false;
				i = nizbrojeva.length;
			}
		}
		if (rastuci == true)
			System.out.println("Niz je rastuci.");
		else
			System.out.println("Niz nije rastuci.");

		sc.close();
	}

}
