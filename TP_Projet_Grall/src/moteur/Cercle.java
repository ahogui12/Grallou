package moteur;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.Box.Filler;

import affichage.PanelGraph;
import interpreteur.Forme;

public class Cercle extends Chemin implements Ferme {
	
	private Ellipse2D.Double cercle;
	
	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		this.cercle = new Ellipse2D.Double();
	}

	@Override
	public Forme creer(Crayon cray) {
		// TODO Auto-generated method stub
		return null;
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
	public void paintComponent(Graphics g, PanelGraph panelGraph, Crayon trace) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remplir(Color col) throws Exception {
		// TODO Auto-generated method stub
		
	}

	



}
