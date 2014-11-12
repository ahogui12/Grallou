package interpreteur;

public class If extends Alternative {

	public If(Operateur gauche, Operateur droite) {
		super(gauche, droite);
		this.executer();
	}

	@Override
	public boolean executer() {
		if (this.getGauche().executer()){
		 return this.getDroite().executer();
		}
		return false;
	}

	
}
