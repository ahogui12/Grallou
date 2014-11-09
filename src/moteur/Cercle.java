package moteur;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.Box.Filler;

import Main.Script;
import affichage.Etiquette;
import affichage.PanelGraph;
import interpreteur.Forme;

public class Cercle extends Chemin implements Ferme {

	private double rayon;
	private Point centre;
	private boolean dessiner;
	private boolean remplir;
	private boolean etiqueter;
	private Color remplissage;

	public Cercle(double r, Point p1) {
		this.centre = p1;
		this.rayon = r;
	}

	public Cercle() {

	}

	public Point getCentre() {
		return centre;
	}
	public void setCentre(Point centre) {
		this.centre = centre;
	}
	public double getRayon() {
		return rayon;
	}
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}

	public boolean isDessiner() {
		return dessiner;
	}
	public void dessiner() {
		System.out.println("swagswagswag");
		this.dessiner = true;
	}
	public boolean isRemplir() {
		return remplir;
	}	
	public void remplir() {
		this.remplir = true;
	}


	@Override
	public void paintComponent(Graphics g, PanelGraph panelGraph, Crayon trace) {
		System.out.println("swag putain");
		Ellipse2D.Double cercle = new Ellipse2D.Double(centre.abscisse()-rayon, centre.ordonnee()+rayon, 2*rayon, 2*rayon);
		Graphics2D gra = (Graphics2D) g;
		if (dessiner) {
			System.out.println("swagputain");
			gra.setColor(trace.getCouleur());
			gra.setStroke(new BasicStroke((float)trace.getEpaisseur()));
			gra.draw(cercle);
		}
		if (remplir) {
			gra.setColor(this.remplissage);
			gra.fill(cercle);
		}
		if (etiqueter){
			//Etiquette E = new Etiquette("Cercle");
			//E.setLocation(new java.awt.Point((int)(centre.abscisse()+rayon), (int)centre.ordonnee()));
			//System.out.println("Etiquette placée en" );
			//panelGraph.add(E);
		}

	}


	@Override
	public void remplir(Color col) throws Exception {
		this.remplir = true;
		this.remplissage = col;

	}

	@Override
	public void inserer(Forme fig) {
		// TODO Auto-generated method stub

	}

	@Override
	public void etiqueter() {
		// TODO Auto-generated method stub
		this.etiqueter = true;
	}


	@Override
	public Forme creer(Crayon sh) {
		Dessin dess = new Dessin(this, sh);
		Script.getDess().add(dess);
		return this;
	}		
}

