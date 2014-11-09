package affichage;

import interpreteur.Forme;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JPanel;

import moteur.Dessin;
import moteur.Geometrie;

public class PanelGraph extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Dessin> dess;
	
	public PanelGraph(ArrayList<Dessin> dess2) {
		this.dess = dess2;
	}
	public void paintComponent(Graphics g){
		for (int i = 0; i < dess.size(); i++) {
			
			dess.get(i).getChemin().paintComponent(g, this, dess.get(i).getCrayon()); 
		}
	   
	  } 
}
