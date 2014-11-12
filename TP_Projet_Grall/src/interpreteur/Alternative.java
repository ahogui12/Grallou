package interpreteur;

public abstract class Alternative implements Operateur{
	
	private Operateur gauche;
	private Operateur droite;
	/**
	 * @param gauche
	 * @param droite
	 */
	public Alternative(Operateur gauche, Operateur droite) {
		this.gauche = gauche;
		this.droite = droite;
	}
	public Operateur getGauche() {
		return gauche;
	}
	public Operateur getDroite() {
		return droite;
	}
	public abstract boolean executer();
	
	
	
}
