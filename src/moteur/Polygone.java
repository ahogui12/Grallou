package moteur;

import java.awt.Color;
import java.awt.Graphics;

import Main.Script;
import affichage.PanelGraph;
import interpreteur.Forme;

public abstract class Polygone extends Chemin implements Ferme {

	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public abstract Forme creer(Crayon cray) ;
		
	

	@Override
	public void inserer(Forme fig) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remplir() throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void etiqueter() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public abstract void paintComponent(Graphics g, PanelGraph panelGraph, Crayon trace);

}
