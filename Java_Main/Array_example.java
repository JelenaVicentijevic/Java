/*
 Korisnik ucitava niz od n elemenata niza, kao i neki broj br. 
 Program ispisuje elemente niza deljive brojem br.
 */

import java.util.Scanner;

public class Array_example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza:");

		int n, br; // n je broj elemenata niza, br je broj kojim se deli
		boolean deljivost = false;
		n = sc.nextInt();
		
		// ako korisnik unese 0 ili negativan broj za duzinu niza
		while (n <= 0) {
			System.out.println("Duzina niza ne moze biti 0, niti negativan broj. Unesite broj elemenata niza ponovo:");
			n = sc.nextInt();
		}
		
		int[] niz = new int[n];
		
		// unosenje elemenata niza
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite element niza na poziciji " + i);
			niz[i] = sc.nextInt();
		}

		// unosenje broja kojim se deli
		System.out.println("Unesite neki broj: ");
		br = sc.nextInt();

		// ako korisnik unese 0
		while (br == 0) {
			System.out.println("Uneli ste nulu, nije moguce deliti nulom. Unesite ponovo broj:");
			br = sc.nextInt();
		}

		System.out.print("Elementi niza deljivi brojem " + br + " su: ");

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] % br == 0) {
				System.out.print(+niz[i] + " ");
				deljivost = true;
			}
		}
		// ako nijedan element niza nije deljiv sa unetim brojem
		if (deljivost == false)
			System.out.print("nema takvih elemenata niza.");
		sc.close();
	}

}
