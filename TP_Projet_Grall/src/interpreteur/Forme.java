package interpreteur;

import java.awt.Color;

import moteur.Crayon;

public interface Forme {

	public void dessiner();
	
	public Forme creer(Crayon cray);
	
	public void inserer(Forme fig);
		
	public void remplir(Color col) throws Exception;
	
	public void etiqueter();
	
}
