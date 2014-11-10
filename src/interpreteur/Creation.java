package interpreteur;

import java.awt.Color;

import Main.Script;
import moteur.CourbeDeBezier;
import moteur.Trait;
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



	public static Rectangle Rectangle(double longueur, double largeur, Point p1) {
		Rectangle rec = new Rectangle(longueur, largeur, p1);
		Script.creer(rec);
		return rec;
	}

	public static Rectangle Rectangle(double longueur, double largeur, Point p1, float largeurCray) {
		Rectangle rec = new Rectangle(longueur, largeur, p1);
		Crayon cray = new Crayon((int) largeurCray, Color.black);
		Script.creer(rec,cray);
		return rec;
	}


	public static Point Point(double i, double j) {
		Point pt = new Point(i, j);
		Script.creer(pt);
		return pt;
	}

	public static Cercle Cercle(Point centre, double rayon, float largeurCray){
		Cercle cercle = new Cercle(rayon, centre);
		Crayon cray = new Crayon((int)largeurCray, Color.black);
		Script.creer(cercle, cray);
		return cercle;
	}

	public static Trait Trait(Point debut, Point fin, float largeurCray) {
		// TODO Auto-generated method stub
		Trait trait = new Trait(debut,fin);
		Crayon cray = new Crayon((int)largeurCray, Color.black);
		Script.creer(trait, cray);
		return trait;
	}

	public static CourbeDeBezier CourbeDeBezier(Point p1,Point p2, Point p3, Point p4, float largeurCray){
		CourbeDeBezier courbe = new CourbeDeBezier(p1,p2,p3,p4);
		Crayon cray = new Crayon((int)largeurCray, Color.black);
		Script.creer(courbe, cray);
		return courbe;
	}

}
