package moteur;

import interpreteur.Forme;

import java.awt.*;
import java.awt.geom.Rectangle2D;

import javax.swing.*;
import javax.swing.border.StrokeBorder;

import Main.Script;
import affichage.PanelGraph;

public class Rectangle extends Polygone {
	private double longueur;
	private double largeur;
	private Point p1;
	private boolean dessiner;
	private boolean remplir;
	private Color remplissage;
	/**
	 * @param longueur
	 * @param largeur
	 * @param p1
	 * @param p2
	 */
	public Rectangle(double longueur, double largeur, Point p1) {
		this.longueur = longueur;
		this.largeur = largeur;
		this.p1 = p1;
		
	}
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
	
	
	

}
