package interpreteur;

public class Egal implements Booleen {
	private int gauche;
	private int droite;
	
	public Egal(int gauche,int droite) {
		this.gauche = gauche;
		this.droite = droite;
	}
	@Override
	public boolean executer() {
		return (this.gauche == this.droite);
		
	}

}
