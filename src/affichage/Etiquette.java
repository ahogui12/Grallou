package affichage;

import java.awt.Color;

import javax.swing.JLabel;

import moteur.Point;

public class Etiquette extends JLabel {
	
	private PanelGraph panel;
		
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Etiquette(PanelGraph panel, String text){
		//super(text);
		this.panel = panel;
		this.setBackground(Color.PINK);
		this.setText(text);
		this.panel.add(this);
		
		this.setLocation(0, 0);
	}

}
