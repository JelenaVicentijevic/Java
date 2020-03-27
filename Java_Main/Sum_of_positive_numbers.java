/*Napisati program koji unosi i sabira brojeve dokle god nije unesen negativan broj, i ispisuje njihov zbir 
 (zbir pozitivnih brojeva).
primer: ako korisnik unese 1 2 5 3 -1,  program treba da ispise 11*/

import java.util.Scanner;

public class Sum_of_positive_numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj:");
		int n = sc.nextInt();

		int zbir = 0;

		// moguce je unositi brojeve sve dok se ne unese negativan broj
		while (n >= 0) {
			zbir = zbir + n;
			n = sc.nextInt();
		}
		System.out.println("Uneli ste negativan broj. Unos je prekinut.");
		System.out.print("Zbir unetih brojeva do unetog negativnog broja je " + zbir + ".");
		sc.close();
	}

}
