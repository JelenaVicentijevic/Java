/*
Napisati program koji ce na standarnom izlazu ispisati poruku “Niz je palindrom” ili “Niz nije palindrom” 
(u zavisnosti da li niz jeste ili nije palindrom). 
Korisnik unosi int []
 */

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite duzinu niza:");
		int n = sc.nextInt();
		
		while (n <= 0) {
			System.out.println("Broj elemenata niza ne moze biti 0, niti negativan broj.");
			n = sc.nextInt();
		}
		
		int[] niz = new int[n];
		int i, j;
		
		boolean palindrom = false;
		
		for (i = 0; i < niz.length; i++) {
			System.out.println("Unesite element niza:");
			niz[i] = sc.nextInt();
		}

		for (i = 0, j = niz.length - 1; i <= j; i++, j--) {
			if (niz[i] != niz[j]) {
				palindrom = false;
				break;
			} else
				palindrom = true;
		}
		if (palindrom == true)
			System.out.println("Niz jeste palindrom.");
		else
			System.out.println("Niz nije palindrom.");
		sc.close();
	}

}
