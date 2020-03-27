/*
Covek poseduje ime i prezime koji se dodeljuju prilikom kreiranja objekta. 
Svi podaci mogu da se dohvate, ali ne i postave.

Vozac je covek koji poseduje i zvanje (zanimanje -> sofer).

Putnik je covek koji poseduje novac. Inicijalno poseduje odredjenu kolicinu novca koja mu se zadaje prilikom 
kreiranja. Odredjena svota novca moze da mu se doda i/ili oduzme, gde je potrebno vratiti indikator uspesnosti.

Autobus poseduje naziv, vozaca, cenu karte i listu putnika koji se njime voze. 
Naziv i cena karte i zadaju se prilikom kreiranja. Moguce je dodati/ukloniti putnika kao i vozaca. 
Moguce je naplatiti kartu putnicima samo ako je vozac prisutan. 
Autobus ispisati u sledecem obliku:
Naziv ( vozac - Putnik1[novac], Putnik2 [novac],... )
*/
package bus;

public class GlavniProgram {

	public static void main(String[] args) {

		Vozac v1 = new Vozac("marko", "markovic");
		System.out.println("Vozac kome treba da pocne smena je " + v1);
		Autobus a1 = new Autobus("7A", 50);
		Putnik p1 = new Putnik("IVA", "IVIC", -250); // posto je unet negativan broj za novacprema konstruktoru treba da
		a1.dodajPutnika(p1); // postavi na 0
		System.out.println("Putnik koji je trenutno u autobusu na pocetnoj stanici je " + p1);
		p1.dodajNovac(1000);

		Vozac v2 = new Vozac("misa", "misic");
		a1.dodajVozaca(v2);

		System.out.println("Vozac " + v2 + " upravo izlazi iz autobusa, jer mu je smena zavrsena.");
		a1.ukloniVozaca(v2);
		a1.naplatiKartu(); // vozac nije u autobusu
		System.out.println(p1
				+ " je pokusala da plati kartu preko automata, medjutim automat je neispravan. Morace da saceka vozaca "
				+ v1);

		Putnik p2 = new Putnik("pera", "peric", 300);
		a1.dodajPutnika(p2);
		System.out.println(p2 + " je upravo usao u autobus.");
		a1.dodajVozaca(v1);
		System.out.println(v1 + " je usao u autobus, uskoro ce krenuti autobus.");

		Putnik p3 = new Putnik("zika", "zikic", 40);

		a1.dodajPutnika(p3);
		System.out.println("U autobus ulazi i putnik " + p3 + " i autobus krece.");
		a1.naplatiKartu();
		System.out.println("Nakon naplate karata " + p3
				+ " je morao da izadje na prvoj stanici, jer nije imao dovoljno novca za kartu.");
		System.out.println("\nStanje u autobusu\n" + a1 + "\n");

		a1.ukloniPutnikaIzlazak(p2);
		p3.dodajNovac(500);
		a1.dodajPutnika(p3);
		System.out.println("Na sledecoj stanici izasao je " + p2 + " dok je " + p3
				+ " podigao novac na bankomatu i stagao autobus na sledecoj stanici i usao.");

		a1.naplatiKartu();
		System.out.println("\nStanje u autobusu\n" + a1 + "\n");
	}

}
