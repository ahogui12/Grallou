package moteur;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Shape;

import affichage.PanelGraph;
import interpreteur.Forme;

public interface Geometrie extends Forme {

	void paintComponent(Graphics g, PanelGraph panelGraph, Crayon trace);

	void dessiner();
	
	public Shape getShape()	;	
	

}
