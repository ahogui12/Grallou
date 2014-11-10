package moteur;

import java.awt.Graphics2D;
import java.awt.Shape;

import interpreteur.Forme;

public abstract class Chemin implements Geometrie {

	private Graphics2D graphics;
	private Shape shape;

	public abstract void dessiner();

	public abstract Forme creer(Crayon sh);

	public abstract void inserer(Forme fig) throws Exception;
	
	public void remplir() throws Exception {
		graphics.fill(this.shape);
	}
		
	public abstract void etiqueter();

}
