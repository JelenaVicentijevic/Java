/*
Dodatni neobavezni zadatak
Korisnik unosi recenicu po izboru. Prebrojati koliko ima reci koje pocinju slovom d.
*/
package domaci_0302;

import java.util.Scanner;

public class First_letter_D_words_counting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite recenicu:");
		String recenica = sc.nextLine();
		recenica = recenica.toLowerCase();
		String[] reci = recenica.split(" ");

		int dReci = 0;

		for (int i = 0; i < reci.length; i++) {
			if (reci[i].charAt(0) == 'd') {
				dReci++;
			}
		}
		System.out.println("Broj reci u recenici koji pocinju slovom d je " + dReci + ".");
		sc.close();
	}

}
