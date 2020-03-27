/*
 Napisati program koji ucitava duzinu niza, niz i ispisuje niz inverznim redosledom.
 */



import java.util.Scanner;

public class Reversed_array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj elemenata niza:");

		int duzinaniza = sc.nextInt();

		while (duzinaniza <= 0) {
			System.out.println("Niz ne moze imati 0, niti negativan broj elemenata. Unesite broj elemenata niza ponovo:");
			duzinaniza = sc.nextInt();
		}
		int[] nizbrojeva = new int[duzinaniza];

		for (int i = 0; i < nizbrojeva.length; i++) {
			System.out.println("Unesite element niza na poziciji " + i);
			nizbrojeva[i] = sc.nextInt();
		}
		System.out.print("Elementi niza inverznim redosledom su: ");
		for (int i = nizbrojeva.length - 1; i >= 0; i--) {
			System.out.print(nizbrojeva[i] + " ");
		}
		sc.close();
	}

}
