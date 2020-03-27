/*
Zadatak Knight_chess_attack uraditi obrnuto, to jest, proveriti da li je pion napadnut.
 */

import java.util.Scanner;

public class Pawn_chess_attack {

	public static int[] unos() {
		Scanner sc = new Scanner(System.in);
		int[] niz = new int[4];
		do {
			System.out.println(
					"Da biste uneli pozicije piona i skakaca, potrebno je da unesete 4 broja.\nPrva 2 su pozicija piona, druga 2 su pozicija skakaca.\nUnesite pozicije:");

			for (int i = 0; i < niz.length; i++) {
				niz[i] = sc.nextInt();
			}
		} while (proveraUnosa(niz) != true);
		sc.close();
		return niz;
	}

	public static boolean proveraUnosa(int[] niz) {
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] < 1 || niz[i] > 8) {
				System.out.println("Unos nije validan. Unesite pozicije ponovo:");
				return false;
			}
		}
		if (niz[0] == niz[2] && niz[1] == niz[3]) {
			System.out.println("Pion i skakac ne mogu biti na istoj poziciji.\nUnesite pozicije piona i skakaca ponovo:");
			return false;
		}
		return true;
	}

	public static void odnosPozicija(int[] n) {
		if (Math.abs(n[2] - n[0]) == 1 && Math.abs(n[3] - n[1]) == 2)
			System.out.println("Pion jeste napadnut.");
		else if (Math.abs(n[2] - n[0]) == 2 && Math.abs(n[3] - n[1]) == 1)
			System.out.println("Pion jeste napadnut.");
		else
			System.out.println("Pion nije napadnut.");
	}

	public static void main(String[] args) {

		int[] pozicijePionSkakac = unos();

		odnosPozicija(pozicijePionSkakac);

	}
}
