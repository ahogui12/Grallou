package moteur;

import interpreteur.Forme;

import java.awt.Color;
import java.awt.geom.Point2D;

import Main.Script;

public class Point implements Forme{
	
	private double abscisse;
	private double ordonnee;
	

	/**
	 * @param abscisse
	 * @param ordonnee
	 */
	public Point(double abscisse, double ordonnee) {
		super();
		this.abscisse = abscisse;
		this.ordonnee = ordonnee;
	}

	public Point(){
		this(0,0);
	}

	public double abscisse() {
		return abscisse;
	}

	public double ordonnee() {
		return ordonnee;
	}

	public void setAbscisse(double abscisse) {
		this.abscisse = abscisse;
	}

	public void setOrdonnee(double ordonnee) {
		this.ordonnee = ordonnee;
	}

	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void inserer(Forme fig) {
		// TODO Auto-generated method stub
		
	}	

	@Override
	public void etiqueter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remplir(Color col) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public static Point Point(double i, double j) {
		Point pt = new Point(i, j);
		Script.creer(pt);
		return pt;
	}
	
	public Point creer(double abscisse, double ordonnee) {
	return new Point(abscisse, ordonnee);

}

	@Override
	public Forme creer(Crayon cray) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean executer() {
		Script.creer(this);
		return true;
		
	}
}