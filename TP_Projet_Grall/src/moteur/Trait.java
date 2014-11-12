package moteur;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.Box.Filler;

import Main.Script;
import affichage.Etiquette;
import affichage.PanelGraph;
import interpreteur.Forme;

public class Trait extends Chemin implements Ferme {
	private Point debut,fin;
	private boolean dessiner;
	private boolean etiqueter;
	public Trait(Point d, Point f) {
		this.debut = d;
		this.fin = f;
	}
	public Trait() {
	}
	public Point getDebut() {
		return debut;
	}
	public void setDebut(Point debut) {
		this.debut = debut;
	}
	public Point getFin() {
		return fin;
	}
	public void setFin(Point fin) {
		this.fin = fin;
	}
	public boolean isDessiner() {
		return dessiner;
	}
	
	@Override
	public void dessiner() {
		this.dessiner = true;
	}
	
	@Override
	public void paintComponent(Graphics g, PanelGraph panelGraph, Crayon trace) {
		Line2D.Double trait = new Line2D.Double(new Point2D.Double(debut.abscisse(), debut.ordonnee()), new Point2D.Double(fin.abscisse(),fin.ordonnee()));
		Graphics2D gra = (Graphics2D) g;
		if (dessiner) {
			gra.setColor(trace.getCouleur());
			gra.setStroke(new BasicStroke((float)trace.getEpaisseur()));
			gra.draw(trait);
		}
		if (etiqueter){
			Point p;
			if (debut.abscisse() >= fin.abscisse()) {p = debut;}
			else {p = fin;}
			Etiquette E = new Etiquette("Trait", p);
			Script.getEtiquettes().add(E);
		}
	}
	@Override
	public void remplir(Color col) throws Exception {
		throw new Exception("on ne peut pas remplir un trait!");
	}
	@Override
	public void inserer(Forme fig) throws Exception {
		// TODO Auto-generated method stub
		throw new Exception("on ne peut rien insérer dans un trait!");
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


	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean executer() {
		Script.creer(this);
		return true;
		}

	public static Trait Trait(Point debut, Point fin, int largeurCray) {
		Trait tr = new Trait(debut, fin);
		Crayon cray = new Crayon(largeurCray, Color.black);
		Script.creer(tr, cray);
		return tr;
	}
	
	public Trait creer(Point debut, Point fin) {
		return new Trait(debut, fin);
	
	}


}
