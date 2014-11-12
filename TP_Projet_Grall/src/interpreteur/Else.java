package interpreteur;

public class Else extends Alternative {

	public Else(Operateur droite) {
		super(null, droite);
		this.executer();
	}

	@Override
	public boolean executer() {
		return this.getDroite().executer();
		
	}

}
