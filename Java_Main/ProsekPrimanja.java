/*
Napisati program u programskom jeziku java koji:
	-  Od korisnika trazi da unosi mesecne plate koje je zaradio u prethodnih 7 
	   meseci. 
	- Racuna i ispise prosek primanja.

*Za resavanje ovog zadatka koristiti for petlju.
*/
package prosecne_plate;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProsekPrimanja {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			double zbirPlata = 0;

			for (int i = 0; i < 7; i++) {
				System.out.println("Molimo Vas da unesete " + (i + 1) + ". platu:");

				double plata = sc.nextDouble();
				// plata ne moze biti negativan broj, ne moze biti ni 0, u slucaju 0 nema plate
				// (kada bi se racunali prihodi mogli bi biti 0, posto je zadatak plata, ne moze
				// biti jednaka nuli)
				if (plata <= 0) {
					System.out.println("Greska! Plata ne moze biti 0 niti negativan broj");
					i--;
				} else {
					zbirPlata = zbirPlata + plata;
				}
			}
			System.out.println("Vasa prosecna plata je " + zbirPlata / 7 + " dinara");
		} catch (InputMismatchException e) {
			System.out.println(
					"Greska! Pogresan tip unosa. Molimo Vas pokrenite program ponovo i za unos plate koristite iskljucivo numericke vrednosti.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
