package interpreteur;

public class SuperieurOuEgal implements Booleen{

	private int gauche;
	private int droite;
	
	public SuperieurOuEgal(int gauche,int droite) {
		this.gauche = gauche;
		this.droite = droite;
	}
	
	@Override
	public boolean executer() {
		return (this.gauche >= this.droite);
		
	}

}
