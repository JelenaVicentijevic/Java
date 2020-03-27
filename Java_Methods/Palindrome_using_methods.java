/*
Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je palindrom” ili “Niz nije palindrom” 
(u zavisnosti da li niz jeste ili nije palindrom) koristeci metode.
 */

import java.util.Scanner;

public class Palindrome_using_methods {

	public static int proveraUnosa(int br, Scanner s) {

		return br;
	}

	public static int[] unos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj elemenata niza:");
		int n = sc.nextInt();
		while (n <= 0) {
			System.out.println(
					"Broj elemenata niza ne moze biti 0, niti negativan broj.\nUnesite broj elemenata niza:");
			n = sc.nextInt();
		}
		
		int[] niz = new int[n];
		
		System.out.println("Unesite elemente niza:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		sc.close();
		return niz;
	}

	public static int[] inverzniNiz(int[] n1) {
		int[] n2 = new int[n1.length];
		for (int i = 0; i < n2.length; i++) {
			n2[i] = n1[n2.length - 1 - i];
		}
		return n2;
	}

	public static void poredjenjeNizova(int[] n1, int[] n2) {
		for (int i = 0; i < n1.length; i++) {
			if (n1[i] != n2[i]) {
				System.out.println("Niz nije palindrom.");
				return;
			}
		}
		System.out.println("Niz jeste palindrom.");
	}

	public static void main(String[] args) {

		int[] niz1 = unos();
		int[] niz2 = inverzniNiz(niz1);
		poredjenjeNizova(niz1, niz2);
	}

}
