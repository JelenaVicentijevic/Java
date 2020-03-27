/*
 Dete ima ime, prezime, broj godina i broj klikera. 
 Napraviti mogucnost da se kreira vise objekata klase Dete. 
 Ako se pozove metoda dodajKlikere ili metoda oduzmiKlikere, broj klikera se azurira.
 Napraviti metodu koja ce ispisivati broj klikera i metodu koja ispisuje prosecan broj decjih godina
 (ako imamo troje dece, broj prosecnih godina za njih troje; 
 ako imamo dvoje racunamo prosecne godine za to dvoje).
 */
package child;

public class GlavniProgram {

	public static void main(String[] args) {

		Dete d1 = new Dete("pera", "peric", 5, 2);

		System.out.println("Dete d1 ima broj klikera: " + d1.getBrKlikeraDeteta());

		System.out.println("Ukupan broj klikera dece je " + Dete.getGlobalBrKlikera());
		System.out.println("Prosecan broj godina sve dece je " + Dete.prosecanBrGodDece());

		Dete d2 = new Dete("mara", "maric", 2, 8);
		System.out.println("Dete d2 ima klikera: " + d2.getBrKlikeraDeteta());
		System.out.println("Ukupan broj klikera sve dece je " + Dete.getGlobalBrKlikera());
		System.out.println("Prosek godina dece je " + Dete.prosecanBrGodDece());
		d2.oduzmiKlikere(2);
		d2.dodajKlikere(5);
		System.out.println("Mara sada ima klikera: "+d2.getBrKlikeraDeteta());
	}

}
