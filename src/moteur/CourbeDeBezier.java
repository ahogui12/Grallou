package moteur;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.CubicCurve2D;

import affichage.PanelGraph;
import interpreteur.Forme;

public class CourbeDeBezier extends Chemin {
	
	private CubicCurve2D courbe;

	@Override
	public void dessiner() {
		// TODO Auto-generated method stub
		this.courbe = new CubicCurve2D.Double();
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
	public void remplir(){
		// TODO Auto-generated method stub
		//throw new Exception("Impossible de remplir un trait !");
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
