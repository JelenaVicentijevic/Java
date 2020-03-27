/*Napisati 8 primera za post inkrementu (i++), pre inkrementu (++i), post dekrementu (i--) i 
 * pre dekrementu (--i) i u programu u komentarima opisati kako koji primer funkcionise. 
 * Napisati po 2 primera o svakom, koristeci promenljive a, b, c koje su i deklarisane i definisane 
 * (kao sto smo na tabli vezbali na casu)
*/

public class PostincrementPreincrement_PostdecrementPredecrement_Examples {

	public static void main(String[] args) {

		int a, b, c;
		a = 5;
		b = 7;
		c = 13;

		// i++ 2 primera:

		a = a++ + b++ + c++; /* prvo ucita vrednost a koja je 5 u izraz, pa tek onda uveca a za 1 (a postaje 6)
		 						+ prvo ucita vrednost b koja je 7 u izraz pa onda uveca b za 1 (b postaje 8)
		 						+ prvo ucita vrednost c koja je u tom momentu 13 pa tek onda uveca c za 1(c postaje 14)
		 						nakon izvrsavanja ovog izraza a =25; b=8; c=14;*/
		
		System.out.println("Vrednost promenljivih nakon prvog primera za i++ je:");
		System.out.println("a=" + a + " b=" + b + " c=" + c);
		
		b = c++ + a++ - b++;/*prvo ucita vrednost c koja je trenutno 14 u izraz pa onda uveca c za 1 (c postaje 15)
		 					  + prvo ucita trenutnu vrednost a koja je 25 u izraz pa tek onda uveca a za 1 (a postaje 26)
		 					  - prvo ucita trenutnu vrednost b u izraz koja je b, pa tek onda uveca b za 1 (b postaje 9)
		 					  nakon izvrsavanja ovog izraza a=26; b=31; c=15;*/

		System.out.println("Vrednost promenljivih nakon drugog primera za i++ je:");
		System.out.println("a=" + a + " b=" + b + " c=" + c);

		// ++i 2 primera:

		b = ++a - ++b + ++c;/*prvo uveca 1 na trenutnu vrednost a (trenutna vrednost a je 26, nakon uvecanja za 1 postaje 27)pa tek onda 
							uvecanu vrednost a (ovde je 27) upise u izraz
							- prvo uveca trenutnu vrednost b (31) za 1 (b postaje 32) pa tek onda upisuje u izraz b nakon uvecanja za 1 
							(za b upisuje 32 u izraz)
							+ prvo uveca trenutnu vrednost c (15) za 1 (c postaje 16) pa onda upisuje u izraz c nakon uvecanja za 1
							(za c upisuje u izraz 16)
							nakon izvrsavanja ovog izraza a=27; b=11; c=16*/
		
		System.out.println("Vrednost promenljivih nakon prvog primera za ++i je:");
		System.out.println("a=" + a + " b=" + b + " c=" + c);
		
		c = ++c + ++b - ++a;/*prvo uveca 1 na trenutnu vrednost c (trenutna vrednost a je 16, nakon uvecanja za 1 postaje 17)pa tek onda 
							uvecanu vrednost c (ovde je 17) upise u izraz
							+ prvo uveca trenutnu vrednost b (11) za 1 (b postaje 12) pa tek onda upisuje u izraz b nakon uvecanja za 1 
							(za b upisuje 12 u izraz)
							- prvo uveca trenutnu vrednost a (27) za 1 (a postaje 28) pa onda upisuje u izraz a nakon uvecanja za 1
							(za a upisuje u izraz 28)
							nakon izvrsavanja ovog izraza a=28; b=12; c=1*/
		
		System.out.println("Vrednost promenljivih nakon drugog primera za ++i je:");
		System.out.println("a=" + a + " b=" + b + " c=" + c);

		// i-- 2 primera:

		a = a-- - b-- + c--; /* prvo ucita vrednost a koja je 28 u izraz, pa tek onda umanji a za 1 (a postaje 27)
							 - prvo ucita vrednost b koja je 12 u izraz pa onda umanji b za 1 (b postaje 11)
							 + prvo ucita vrednost c koja je u tom momentu 1 pa tek onda umanji c za 1(c postaje 0)
							 nakon izvrsavanja ovog izraza a =17; b=11; c=0;*/
		
		System.out.println("Vrednost promenljivih nakon prvog primera za i-- je:");
		System.out.println("a=" + a + " b=" + b + " c=" + c);
		
		c = b-- + a-- - c--; /* prvo ucita vrednost b koja je 11 u izraz, pa tek onda umanji b za 1 (a postaje 10)
							 + prvo ucita vrednost a koja je 17 u izraz pa onda umanji a za 1 (b postaje 16)
							 - prvo ucita vrednost c koja je u tom momentu 1 pa tek onda umanji c za 1(c postaje 0)
							 nakon izvrsavanja ovog izraza a =16; b=10; c=28;*/

		System.out.println("Vrednost promenljivih nakon drugog primera za i-- je:");
		System.out.println("a=" + a + " b=" + b + " c=" + c);

		// --i 2 primera:

		a = --c - --b + --a; /*prvo umanji za 1 trenutnu vrednost c (trenutna vrednost a je 28, nakon umanjenja za 1 postaje 27)pa tek onda 
							 umanjenu vrednost c (ovde je 27) upise u izraz
							 - prvo umanji trenutnu vrednost b (10) za 1 (b postaje 10) pa tek onda upisuje u izraz b nakon umanjenja za 1 
							 (za b upisuje 10 u izraz)
							 + prvo umanji trenutnu vrednost a (16) za 1 (a postaje 15) pa onda upisuje u izraz a nakon umanjenja za 1
							 (za a upisuje u izraz 15)
							 nakon izvrsavanja ovog izraza a=33; b=9; c=27*/
		
		System.out.println("Vrednost promenljivih nakon prvog primera za --i je:");
		System.out.println("a=" + a + " b=" + b + " c=" + c);
		
		b = --a - --b - --c; /*prvo umanji za 1 trenutnu vrednost a (trenutna vrednost a je 33, nakon umanjenja za 1 postaje 32)pa tek onda 
							 umanjenu vrednost a (ovde je 32) upise u izraz
							 - prvo umanji trenutnu vrednost b (9) za 1 (b postaje 8) pa tek onda upisuje u izraz b nakon umanjenja za 1 
							(za b upisuje 8 u izraz)
							 - prvo umanji trenutnu vrednost c (27) za 1 (a postaje 26) pa onda upisuje u izraz a nakon umanjenja za 1
							 (za c upisuje u izraz 26)
							 nakon izvrsavanja ovog izraza a=32; b=-2; c=26*/

		System.out.println("Vrednost promenljivih nakon drugog primera za --i je:");
		System.out.println("a=" + a + " b=" + b + " c=" + c);
		
	}

}
