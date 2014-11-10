package moteur;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Observable;

import javax.swing.JPanel;

public class Dessin {
	
	public Chemin getChemin() {
		return chemin;
	}

	public void setChemin(Chemin chemin) {
		this.chemin = chemin;
	}
	private Chemin chemin;
	private Crayon crayon;
	
	public static final Integer IMPLEMENTATION_DESSIN = new Integer(1);
	
	public Dessin(Chemin chemin, Crayon crayon){
		this.chemin = chemin;
		this.crayon = crayon;
		
	}	
	
	public Dessin() {
		this.chemin = new Cercle();
		this.crayon = new Crayon();
	}
	
	public Crayon getCrayon() {
		return crayon;
	}

	public void setCrayon(Crayon crayon) {
		this.crayon = crayon;
	}

	public void paintComponent(Graphics g, JPanel jp){
		 Graphics2D g2d = (Graphics2D)g;         
		    GradientPaint gp = new GradientPaint(0, 0, Color.RED, 30, 30, Color.cyan, true);                
		    g2d.setPaint(gp);
		    g2d.fillRect(0, 0, jp.getWidth(), jp.getHeight()); 
	}


}
