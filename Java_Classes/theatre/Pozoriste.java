/*
Pozoriste ima jednoznacan automatski generisan celobrojan identifikator i naziv koji mogu da se dohvate. 
Moze da se sastavi tekstualni opis u obliku naziv[id].
 */
package theatre;
public class Pozoriste {
	// polja
	public int id;
	public String naziv;
	public static int globalId = 1; //ne bih da id krece od nule nego od jedan

	// konstruktor
	public Pozoriste(String naziv) {
		id = globalId;
		globalId++;
		this.naziv = naziv;
	}

	// metode
	public String getNaziv() {
		return naziv;
	}

	public int getId() {
		return id;
	}
	public static int getGlobalId() {
		return globalId;
	}
	
	@Override
	public String toString() {
		return naziv + "[" + id + "]";
	}

}
