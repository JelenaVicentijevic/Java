/*
Napisati program koji ce ispisati n brojeva Fibonacijevog niza.
 */

import java.util.Scanner;

public class N_in_a_Fibonacci_sequence {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj:");

		int n = sc.nextInt();

		if (n > 0) {

			// prvi i drugi broj fibonacijevog niza ce biti uvek isti 0 i 1
			int prviBr = 0;
			int drugiBr = 1;

			// od treceg broja fibonacijevog niza se uocava pravilo da je taj treci broj
			// zbir prethodna dva
			int treciBr = prviBr + drugiBr;

			System.out.print("Brojevi fibonacijevog niza su: ");

			// posto su prva dva broja fiksna (nisu zbir prethodna dva) za njih ce ispis
			// biti drugaciji, a od 3 je isto pravilo
			if (n > 2) {
				System.out.print(+ prviBr + " " + drugiBr + " ");
				
				// brojac krece od 2, zbog prva dva broja
				for (int i = 2; i < n; i++) {
					treciBr = prviBr + drugiBr;
					System.out.print(treciBr + " ");
					
					/*
					 nakon sto su prvi i drugi broj sabrani u treci, drugi broj postaj prvi, treci
					 (zbir) postaje drugi, a treci broj je ponovo zbir prethodna dva
					 */
					prviBr = drugiBr;
					drugiBr = treciBr;
				}
				
			}
			// ako korisnik unese 1 ili 2 kao n
			else {
				switch (n) {
				case 1:
					System.out.println(prviBr);
					break;
				case 2:
					System.out.print(prviBr + " " + drugiBr);
					break;
				default:
					break;
				}
			}
		} 
		// ako korisnik unese negativan broj ili 0
		else {
			System.out.println("Greska. Broj ne moze biti negativan ili 0.");
		}
		sc.close();
	}
}
