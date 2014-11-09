package affichage;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import moteur.Dessin;
import moteur.Geometrie;
import moteur.Point;
import moteur.Rectangle;

public class Affichage extends JFrame {

	public Affichage(ArrayList<Dessin> dess) {
		super("Langage Swag");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		PanelGraph panel = new PanelGraph(dess);
		//Etiquette E = new Etiquette("coucou");
		//panel.add(new Etiquette("coucou"));
		//E.setLocation(100, 100);
		this.setContentPane(panel);
		this.setVisible(true);
		this.setSize(1000, 1000);

	}


	public static void main(String[] args) {
		Geometrie rec = new Rectangle(10, 5, new Point(3, 5));
		rec.dessiner();
		//Affichage aff = new Affichage(rec);

	}

}
