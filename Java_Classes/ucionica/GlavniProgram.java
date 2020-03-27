/*
 1.	Napraviti paket ucionica.
Unutar paketa ucionica, pisati klase.
Polaznik  ima ime i prezime koje se zadaje prilikom kreiranja polaznika. 
Ime i prezime polaznika se moze dohvatiti ali ne i postaviti. 
Polaznik se ispisuje u obliku: IME_PREZIME.

Laptop poseduje listu polaznika koji ga koriste i marku koji se zadaju prilikom kreiranja. 
Marka moze samo da se dohvati. Lista polaznika koji koriste laptop moze da se prosiri i da se smanji. 
Moze da se ispise u obliku (koristiti metodu): MARKA{POLAZNIK 1, POLAZNIK 2,.....}
 */
package ucionica;

import java.util.ArrayList;

public class GlavniProgram {

	public static void main(String[] args) {

		// objekti klase olaznik
		Polaznik p1 = new Polaznik("petar petrovic");
		Polaznik p2 = new Polaznik("marko markovic");
		Polaznik p3 = new Polaznik("milos milosevic");
		Polaznik p4 = new Polaznik("jovan Jovanovic");
		Polaznik p5 = new Polaznik("Mara Maric");

		System.out.println("Polaznik p1 je " + p1 + "\n");

		// kreiranje lista polaznika
		ArrayList<Polaznik> polazniciHP = new ArrayList<Polaznik>();
		ArrayList<Polaznik> polazniciDELL = new ArrayList<Polaznik>();
		ArrayList<Polaznik> polazniciAsus = new ArrayList<Polaznik>();

		// dodavanje polaznika u liste polaznika
		polazniciHP.add(p3);
		polazniciHP.add(p1);
		polazniciDELL.add(p5);
		polazniciDELL.add(p2);
		polazniciDELL.add(p4);

		// kreiranje objekata klase laptop
		Laptop l1 = new Laptop("hp", polazniciHP);
		Laptop l2 = new Laptop("dell", polazniciDELL);
		Laptop l3 = new Laptop("asus", polazniciAsus);

		// ispis liste polaznika i marke za laptop l2
		System.out.println("Laptopa l2 " + l2);
		// brisanje treceg po redu polaznika iz liste polaznika za objekat l2
		l2.getPolaznik().remove(2);
		System.out.println("Laptop l2 nakon brisanja treceg polaznika " + l2);

		System.out.println("\nLaptop l3 " + l3);
		l3.dodajPolaznika(p4);
		l3.izbrisiPolaznika(p4);
		Polaznik p6 = new Polaznik("Iva Ivic");
		l3.dodajPolaznika(p6);
		System.out.println("Laptop l3 nakon izmena " + l3);

		System.out.println("\nLaptop l1 "+l1);

	}

}
