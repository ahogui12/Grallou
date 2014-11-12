package affichage;

import interpreteur.Forme;

import java.awt.Color;

import javax.swing.JLabel;

import moteur.Crayon;
import moteur.Point;

public class Etiquette extends JLabel {
	
	private Point position;
			
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Etiquette(String text, Point position){
		//super(text);
		this.position = position;
		this.setBackground(Color.PINK);
		this.setText(text);		
	}
	
	public Point getPosition(){
		return position;
	}
}