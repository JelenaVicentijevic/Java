/*
Napisati program koji ce prebrojati koliko je brojeva od 9 do 250 (ukljucujuci i njih) 
 deljivih brojem 3.
 */



public class For_loop_example {

	public static void main(String[] args) {
		
		int n = 0;
		
		// ukljucuje brojeve 9 i 250
		for (int i = 9; i <= 250; i++) {
			if (i % 3 == 0)
				n += 1;
		}
		System.out.println("Broj brojeva deljivih sa 3 od 9 do 250 je " + n + ".");

	}

}
