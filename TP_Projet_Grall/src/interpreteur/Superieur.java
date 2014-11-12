package interpreteur;

public class Superieur implements Booleen {
	private int gauche;
	private int droite;
	
	public Superieur(int gauche,int droite) {
		this.gauche = gauche;
		this.droite = droite;
	}
	
	@Override
	public boolean executer() {
		return (this.gauche > this.droite);
		
	}

}
