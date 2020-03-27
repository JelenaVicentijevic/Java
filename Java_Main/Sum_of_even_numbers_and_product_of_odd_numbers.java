/*Napisati program koji racuna sumu parnih brojeva i proizvod neparnih brojeva od 0 do n 
  - za resavanje ovog zadatka koristiti samo jednu petlju (ne jednu vrstu petlje, vec samo jednu petlju).
// podrazumeva se da se n ucitava preko standardnog ulaza
*/

import java.util.Scanner;

public class Sum_of_even_numbers_and_product_of_odd_numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj:");
		int n = sc.nextInt();

		// suma i proizvod ce se racunati ako je uneti broj n veci od 0
		if (n > 0) {
			int suma = 0;
			int proizvod = 1;
			
			/*
			posto nije naglaseno u zadatku da li se ukljucuje i uneti broj, nije ukljucen u racunanje
 			ako bi bilo potrebno da i uneti broj n bude ukljucen u sumu ili proizvod u for petlji umesto i<n, 
 			pisalo bi i<=n kako bi se ukljucio i n
 			*/
			for (int i = 0; i < n; i++) {
				
				// provera da li je brojac u toj iteraciji paran broj i ako jeste racuna sumu
				if (i % 2 == 0) {
					suma = suma + i; 
				} 
				
				// ako nije paran znaci da je neparan i racuna se proizvod
				else 
					proizvod = proizvod * i;
			}
			
			/*
			ispisuje koji broj je unet i sumu parnih i proizvod neparnih brojeva do unetog broja 
			(pretpostavka je da se uneti broj ne racuna, samo brojevi do njega, ne ukljucujuci njega)
			*/
			System.out.println("Za broj " + n + " suma parnih brojeva je " + suma + ", a proizvod neparnih brojeva je "
					+ proizvod + ".");
		} 
		// ako je unet broj 0, ne racuna ni sumu ni proizvod(0 nije ni paran ni neparan broj)
		else if (n == 0) 
			System.out.println("Uneli ste 0. Suma i proizvod su 0.");
		
		// ako je unet negativan broj
		else 
			System.out.println("Greska! Uneli ste negativan broj.");

		sc.close();
	}

}
