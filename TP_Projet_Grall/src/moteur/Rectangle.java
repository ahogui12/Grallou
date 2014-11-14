package moteur;

import interpreteur.Forme;


import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;
import javax.swing.border.StrokeBorder;

import Main.Script;
import affichage.PanelGraph;

/**
 * Implémentation des Rectangles en utilisant Rectangle2D
 * @author Alex
 *
 */
public class Rectangle extends Polygone {
	private double longueur;
	private double largeur;
	private Point p1;
	private boolean dessiner;
	private boolean remplir;
	private Color remplissage;
	private Geometrie inserer = null;
	/**
	 * @param longueur longueur du rectangle
	 * @param largeur largeur du rectangle
	 * @param p1 point d'origine
	 */
	public Rectangle(double longueur, double largeur, Point p1) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.p1 = p1;
		
	}
	/**
	 * Constructeur par défaut, à ne pas utiliser
	 */
	public Rectangle() {
		
	}
	public double getLongueur() {
		return longueur;
	}
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}
	public double getLargeur() {
		return largeur;
	}
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}
	public Point getP1() {
		return p1;
	}
	public void setP1(Point p1) {
		this.p1 = p1;
	}
	
	public boolean isDessiner() {
		return dessiner;
	}
	/**
	 * Méthode à utiliser lorsque l'objet créé doit être dessiné
	 */
	public void dessiner() {
		this.dessiner = true;
	}
	public boolean isRemplir() {
		return remplir;
	}	
	
	@Override
	public void paintComponent(Graphics g, PanelGraph panelGraph, Crayon trace) {
		Rectangle2D.Double rec = new Rectangle2D.Double(p1.abscisse(), p1.ordonnee(), longueur, largeur);
		Graphics2D gra = (Graphics2D) g;
		if (dessiner) {
			gra.setColor(trace.getCouleur());
			gra.setStroke(new BasicStroke((float)trace.getEpaisseur()));
			gra.draw(rec);
		}
		if (remplir) {
			gra.setColor(this.remplissage);
			gra.fill(rec);
		}
		if (inserer != null) {
			Rectangle2D rec1 = inserer.getShape().getBounds2D();
			
			if (rec.contains(p1.abscisse(),p1.ordonnee(),rec1.getMaxX()-rec1.getMinX(),rec1.getMaxY()-rec1.getMinY())) {
				if (inserer instanceof Cercle) {
					Point centre = new Point(p1.abscisse()+longueur/2, p1.ordonnee()+largeur/2);
					Cercle c = (Cercle)inserer;
					Ellipse2D.Double cercle = new Ellipse2D.Double(centre.abscisse()-c.getRayon(), centre.ordonnee()-c.getRayon(), 2*c.getRayon(), 2*c.getRayon());
					gra.draw(cercle);
				}
				if (inserer instanceof Rectangle) {
					Point centre = new Point(p1.abscisse()+longueur/2, p1.ordonnee()+largeur/2);
					Rectangle r = (Rectangle)inserer;
					Rectangle2D.Double rectangle = new Rectangle2D.Double(centre.abscisse()-r.getLongueur()/2, centre.ordonnee() - r.getLargeur()/2, r.getLongueur(), r.getLargeur());
					gra.draw(rectangle);

				}
			}
			
		}
		
	}
	@Override
	public Forme creer(Crayon cray) {
		Dessin dess = new Dessin(this, cray);
		Script.getDess().add(dess);
		return this;
	}
	
	
	@Override
	public void remplir(Color col) throws Exception {
		this.remplir = true;
		this.remplissage = col;
		
	}
	
	public void inserer(Forme fig1) {
		inserer = (Geometrie) fig1;
	}
	@Override
	public Shape getShape() {
		return new Rectangle2D.Double(p1.abscisse(), p1.ordonnee(), longueur, largeur);
	}
	
	/**
	 * Méthode statique permettant la création d'un rectangle
	 * A utiliser comme instance du langage
	 * @param longueur
	 * @param largeur
	 * @param p1
	 * @return
	 */
	public static Rectangle Rectangle(int longueur, int largeur, Point p1) {
		Rectangle rec = new Rectangle(longueur, largeur, p1);
		Script.creer(rec);
		return rec;
	}
	
	/**
	 * Méthode statique permettant la création d'un rectangle
	 * A utiliser comme instance du langage
	 * @param longueur
	 * @param largeur
	 * @param p1
	 * @param largeurCray
	 * @return
	 */
	public static Rectangle Rectangle(double longueur, double largeur, Point p1, float largeurCray) {
		Rectangle rec = new Rectangle(longueur, largeur, p1);
		Crayon cray = new Crayon((int) largeurCray, Color.black);
		Script.creer(rec,cray);
		return rec;
	}
	
	
	public Rectangle creer(double longueur, double largeur, Point p1) {
		return new Rectangle(longueur, largeur, p1);
	}

	public boolean executer() {
		Script.creer(this);
		return true;
	}
}
