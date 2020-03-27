/*
 1.	Napisati program koji ima meni za samousluznu kasu u prodavnici. 
 Meni za potrosace sadrzi sledece opcije:
 
0 - Izlaz iz programa
1 - dodavanje cene proizvoda na racun (ubacivanje u potrosacku korpu)
2 - naplata racuna

Ukoliko korisnik unese opciju 0 program se zavrsava.

Ukoliko korisnik unese opciju 1 program 
pita korisnika da unese cenu proizvoda i ta cena se dodaje na racun u prodavnici.

Ukoliko korisnik unese opciju 2 program 
pita korisnika da unese kolicinu novca za naplatu racuna.
Ukoliko korisnik unese vrednost manju od vrednosti racuna, potrebno je da se ispise greska, 
bez umanjenja racuna i da se ponovo ispise meni.
Ukoliko korisnik unese vrednost vecu ili jednaku od cene racuna ispisuje se kusur 
i racun se ponovo postavlja na nulu. Zatim se ponovo ispisuje meni.
 */


import java.util.Scanner;

public class Self_service_cash_register_logic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int opcija;
		float racun = 0;
		
		do {
			System.out.println("Za koriscenje samousluzne kase unesite jednu od ponudjenih opcija:");
			System.out.println("Opcija 1 - ubacite proizvod u korpu");
			System.out.println("Opcija 2 - naplata racuna");
			System.out.println("Opcija 0 - izlaz iz programa");

			opcija = sc.nextInt();

			switch (opcija) {
			
			// ako unese opciju 0, izlazi iz petlje (programa)
			case 0:
				break;
				
			// ako izabere 1 da ubaci proizvod u korpu
			case 1:
				// treba da unese cenu proizvoda koji je ubacio u korpu
				System.out.println("Unesite cenu proizvoda:");
				float cena = sc.nextFloat();
				
				// ako je uneo da je cena proizvoda 0 ili negativan broj
				if (cena <= 0) {
					System.out.println("Greska! Cena proizvoda ne moze biti negativan broj ni 0.");
					System.out.println();
				} 
				
				/* 
				ako je uneo pozitivan broj za cenu proizvoda, obavestice ga koju cenu je uneo i 
				koliko trenutno ukupno iznosi njegov racun
				*/
				else {
					racun = racun + cena;
					System.out.println("Sa unetom cenom proizvoda " + cena + " dinara, vas racun trenutno iznosi "
							+ racun + " dinara.");
					System.out.println();
				}
				break;
				
			// ako je izabrao 2 za opciju naplate racuna
			case 2:
				// ako je iznos racuna veci od 0 pitace ga da unese iznos novca koji daje za placanje
				if (racun > 0) {
					System.out.println("Unesite iznos novca kojim placate:");
					int iznos = sc.nextInt();
					
					/*ako je uneo da placa iznosom koji je manji od iznosa njegovog racuna koji treba da plati izbacice mu gresku 
					i meni da ponovo izabere opciju*/
					if (iznos < racun) {
						System.out.println("Greska! Iznos kojim placate ne moze biti manji od iznosa racuna.");
						System.out.println();
					} 
					
					// ako je izabrao da placa iznosom koji je jednak ili veci od iznosa racuna koji placa 
					else {
						float kusur = iznos - racun;
						System.out.print("Hvala sto ste platili racun. Molimo vas uzmite isecak racuna");
						
						// ako je kusur veci od 0, potrebno da obavesti kupca da treba da uzme i kusur i da mu napise njegov iznos
						if (kusur > 0) {
							System.out.println(" i vas kusur koji iznosi " + kusur + " dinara.");
							System.out.println();
						} 
						else {
							System.out.println(".");
							System.out.println();
						}
					racun = 0;}
				} 
				else {
					//ako je korisnik izabrao opciju placanja, a nije ubacio nijedan proizvod i njegovu cenu
					System.out.println("Greska! Jos uvek niste ubacili nijedan proizvod u korpu.");
					System.out.println();
				}
				break;
			//ako korisnik unese nesto umesto ponudjenih opcija 1, 2, 0
			default:
				System.out.println("Greska! Unos ne odgovara nijednom od ponudjenih opcija.");
				System.out.println();
				break;
			}

		} while (opcija != 0);

		System.out.print("Dovidjenja. ");
		
		/*ako je kupac dodao proizvode u korpu i uneo je cenu, a onda ne odabere opciju 2 za placanje racuna, 
		 nego odabere 0 da izadje, potrebno je da mu se korpa isprazni i racun resetuje 
		*/
		if (racun > 0) {
			System.out.println("Vasa korpa je ispraznjena. Hvala sto ste pokusali da koristite samousluznu kasu.");
			System.out.println("Ukoliko ste greskom izasli iz programa, molimo vas da ponovo pokrenite program samousluzne kase.");
			racun = 0;
		} 
		else
			System.out.println("Hvala sto ste kupovali uz pomoc samousluzne kase.");
	sc.close();
	}

}
