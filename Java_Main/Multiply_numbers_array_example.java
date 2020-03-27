/*
Napisati program koji ce na standardnom izlazu ispisati proizvod elemenata niza koji su veci od 
svog indeksa (preko konzole uneti duzinu i clanove niza)
 */

import java.util.Scanner;

public class Multiply_numbers_array_example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza:");
		int n = sc.nextInt();

		while (n <= 0) {
			System.out.println("Broj elemenata niza ne moze biti 0, niti negativan broj.");
			n = sc.nextInt();
		}

		int[] niz = new int[n];
		boolean nema = true;
		int proizvod = 1;
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite element niza:");
			niz[i] = sc.nextInt();

			if (niz[i] > i) {
				proizvod = proizvod * niz[i]; nema = false;
			}
		}
		if (nema==false)System.out.println("Proizvod elemenata niza je " + proizvod+".");
		else System.out.println("Nema takvih elemenata niza koji ispunjavaju uslov da se mnoze.");
	sc.close();
	}

}
