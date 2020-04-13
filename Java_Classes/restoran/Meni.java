package restoran;

import java.util.ArrayList;

public class Meni {

	private ArrayList<Jelo> jela;

	public Meni() {
		jela = new ArrayList<Jelo>();
	}

	public void dodajJelo(Jelo j) {
		jela.add(j);
	}

	public Jelo getJelo(String naziv) {
		for (int i = 0; i < jela.size(); i++) {
			if (naziv.toLowerCase().equals(jela.get(i).getNazivJela().toLowerCase()))
				return jela.get(i);
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < jela.size(); i++) {
			sb.append(jela.get(i)).append("\n");
		}
		return sb.toString();
	}
}
