package interpreteur;

import java.awt.Color;

import moteur.Crayon;

/**
 * Interface des différentes Formes possibles
 * @author Alex
 *
 */
public interface Forme extends Operateur {

	public void dessiner();
	
	public Forme creer(Crayon cray);
	
	public void inserer(Forme fig) throws Exception;
		
	public void remplir(Color col) throws Exception;
	
	public void etiqueter();
	
	public boolean executer();
	
}
