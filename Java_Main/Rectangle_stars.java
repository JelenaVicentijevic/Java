/*
 Napravi program koji ce na izlazu izbaciti sliku pravougaonika od zvezdica:
 */

import java.util.Scanner;

public class Rectangle_stars {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int visina, sirina;

		System.out.println("Unesite visinu pravugaonika (mereno brojem zvezdica):");
		visina = sc.nextInt();

		System.out.println("Unesite sirinu pravugaonika (mereno brojem zvezdica):");
		sirina = sc.nextInt();

		if (visina > 0 && sirina > 0) {
			for (int m = 0; m < visina; m++) {
				for (int n = 0; n < sirina; n++) {
					System.out.print("*");
					System.out.print(" ");
				}
				System.out.println();
			}
		} 
		else
			System.out.println("Greska! Ni visina, ni sirina pravugaonika ne mogu biti negativan broj niti 0.");
		sc.close();
	}

}
