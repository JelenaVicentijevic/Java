Tekst:

Sastojak sadrzi naziv i cenu po kilogramu. Svi podaci mogu da se dohvate. 
Omoguciti da cena moze i da se promeni, ali da nikada neæe biti negativna.

Jelo sadrži svoj naziv, proizvoljno mnogo sastojaka, a za svaki sastojak treba znati i koliko grama je potrebno. 
Pri kreiranju se zadaje samo naziv jela.
Treba napraviti metodu koja ce omoguciti dodavanje sastojka koja izgleda ovako:
public void dodajSastojak(Sastojak s, int kolicina);
Lista sastojaka može da se dohvati, kao i naziv.
U klasi jelo postoji metoda koja raèuna koliko novca je potrebno da bi se sve namirnice nabavile.

Torta 	je jelo za koje se moze doci do informacije o tome da li sadrzi i margarin ili ne.
Dodatni zahtev: moze se doci i do informacije o tome koliko procenata secera postoji u odnosu na celu tortu.

Supa je jelo za koje se pamti informacija o tome koliko dugo se kuva koja može da se dohvati.

Meni sadrži listu jela. Sadrži metodu koja dodaje jelo u meni. Može da se ispiše ceo meni u sledeæem formatu: 
	NAZIVJELA: nazivNamirnice, nazivNamirnice, … , nazivNamirnice
	NAZIVJELA: nazivNamirnice, nazivNamirnice, … , nazivNamirnice
	NAZIVJELA: nazivNamirnice, nazivNamirnice, … , nazivNamirnice
	….

	Dodatni zahtev: Omoguæiti da svako jelo može da se dohvati na osnovu naziva.

Napraviti glavni program koji æe da kreira nekoliko jela (barem jednu tortu i jednu supu), ispiše cenu nekog od njih, 
napravi i ispiše meni.