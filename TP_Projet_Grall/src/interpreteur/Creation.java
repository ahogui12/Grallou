package interpreteur;

import java.awt.Color;

import Main.Script;
import moteur.Cercle;
import moteur.Crayon;
import moteur.Point;
import moteur.Rectangle;

public class Creation implements Fonctions {
	
	private Forme shape;
	private Crayon cray;
	
	public Creation(Forme sh) {
		this.shape = sh;
		this.cray = new Crayon();
		
	}

	
	
	public Creation(Forme sh, Crayon cray) {
		this.shape = sh;
		this.cray = cray;
	}



	public Forme getShape() {
		return shape;
	}

	@Override
	public void interpreter() {
		shape.creer(cray);

	}	

	public Crayon getCray() {
		return cray;
	}

	public void setCray(Crayon cray) {
		this.cray = cray;
	}

	

}