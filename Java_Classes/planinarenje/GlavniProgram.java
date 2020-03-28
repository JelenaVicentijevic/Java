/*
Planinar ima ime, prezime i jedinstveni celobrojni identifikacioni broj. Planinar moze da se penje
po zadatoj planini. Penjanje moze biti uspesno ili neuspesno. Moze da se sastavi tekstualni
opis planinara u obliku ime-ident.

Klasicni planinar je plainar koji se penje po planinama nizim od 2000m,inace je penjanje
neuspesno.Tekstualni oblik je K_ime-ident.

Alpinista je planinar kome moze da se dodeli drugi Alpinista kao partner i koji se penje po
planinama visim od 3000m. Partner moze da se dohvati i postavi. Nije moguce postaviti
partnera ukoliko partner vec ima dodeljenog partnera. Ukoliko alpinista nema dodeljenog
partnera ili je planina manja od 3000m, penjanje je neuspesno. Tekstualni opis je A_ime-ident.

Planina ima ime i visinu (u metrima) koji mogu da se dohvate. Moze da se sastavi tekstualni
opis planine u obliku ime(visina). Takodje planina sadrizi listu planinara. Moze da se dohvati
planinar na nekoj odredjenoj poziciji u listi, moguce je da se doda/ukloni planinar. Takodje
moguce je ispisati sve planinare na planini u obliku [ime-ident,ime-ident,ime-ident...]
*/
package planinarenje;

public class GlavniProgram {

	public static void main(String[] args) {
		
		Planinar p1 = new Planinar("pera", "peric");
		
		KlasicniPlaninar kp1 = new KlasicniPlaninar("zika","zikic");

		Alpinista a1 = new Alpinista("ana", "anic");
		Alpinista a2 = new Alpinista("Mika", "Mikic", a1);
		
		System.out.println(kp1);
		Planina pl1 = new Planina("Stara", 1600);
		pl1.getPlaninari().add(kp1);
		System.out.println(kp1.penjanje(pl1));
		
		pl1.dodajPlaninara(a1);
		System.out.println(a1.penjanjeA(pl1));
		pl1.dodajPlaninara(a2);
		System.out.println(a1.setPartner(a1));
		pl1.dodajPlaninara(p1);
	}

}
