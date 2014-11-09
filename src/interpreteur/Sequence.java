package interpreteur;

import java.util.ArrayList;

public class Sequence {

	private ArrayList<Fonctions> fonc ;
	
	public Sequence() {
		fonc = new ArrayList<>();
	}
	
	public ArrayList<Fonctions> getFonc() {
		return fonc;
	}

	public boolean add(Fonctions f) {
		return this.fonc.add(f);
	}
	public void interpreter() throws Exception {
		for (int i = 0; i < this.fonc.size(); i++) {
			this.fonc.get(i).interpreter();
		}
	}
}

