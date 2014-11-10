package moteur;

import java.awt.Color;

public class Crayon {
	
	private int epaisseur;
	private Color couleur;
	 
	
	public Crayon(int epaisseur, Color couleur){
		this.epaisseur = epaisseur;
		this.couleur = couleur;
	}
	
	public Crayon(){
		this(1, Color.black);
	}

	public int getEpaisseur() {
		return epaisseur;
	}

	public void setEpaisseur(int epaisseur) {
		this.epaisseur = epaisseur;
	}

	public Color getCouleur() {
		return couleur;
	}

	public void setCouleur(Color couleur) {
		this.couleur = couleur;
	}

	
}
