/*
Na sahovskoj tabli je red obelezen brojevima 1 2 3 4 5 6 7 8 i kolona takodje brojevima 1 2 3 4 5 6 7 8. 
Tabla je obelezena ovako:

1	2	3	4	5	6	7	8
2							
3							
4							
5							
6							
7							
8							

Na tabli stoje beli pion i crni skakac. Beli pion pocinje sa dna table a crni skakac sa vrha. 
Korisnik prvo unosi poziciju piona kao dva cela broja, a zatim poziciju skakaca, 
gde prvi broj predstavlja red, a drugi kolonu. 
Program treba da ispise da li se figure nalaze u poziciji da je skakac napadnut.
Primeri: 6 4 7 4 ---> skakac nije napadnut
              6 4 5 5 ---> skakac jeste napadnut 
              2 2 1 1 ---> skakac jeste napadnut
              9 1 6 8 ---> greska u unosu

*/

import java.util.Scanner;

public class Knight_chess_attack {

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
				System.out.println("Unos nije validan. Unesite ponovo poziciju:");
				return false;
			}
		}
		if (niz[0] == niz[2] && niz[1] == niz[3]) {
			System.out.println("Pion i skakac ne mogu biti na istoj poziciji.\nUnesite pozicije piona i skakaca ponovo:");
			return false;
		}
		return true;
	}

	public static void odnosPozicija(int[] niz1) {
		if (niz1[0] == 1)
			System.out.println("Skakac nije napadnut.");
		else {
			if (niz1[0] - niz1[2] == 1) {
				if (Math.abs(niz1[1] - niz1[3]) == 1)
					System.out.println("Skakac jeste napadnut.");
				else
					System.out.println("Skakac nije napadnut");
			} else
				System.out.println("Skakac nije napadnut.");
		}
	}

	public static void main(String[] args) {

		int[] pozPionSkakac = unos();

		odnosPozicija(pozPionSkakac);
	}

}
