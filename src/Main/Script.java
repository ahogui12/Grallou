package Main;

import java.awt.Color;
import java.util.ArrayList;

import affichage.Affichage;
import affichage.Etiquette;
import interpreteur.Creation;
import interpreteur.Dessiner;
import interpreteur.Etiqueter;
import interpreteur.Forme;
import interpreteur.Remplir;
import interpreteur.Sequence;
import moteur.Cercle;
import moteur.CourbeDeBezier;
import moteur.Crayon;
import moteur.Dessin;
import moteur.Point;
import moteur.Rectangle;
import moteur.Trait;

public class Script {

	private static Sequence seq = new Sequence();
	private static ArrayList<Dessin> dess = new ArrayList<>();
	private static ArrayList<Etiquette> etiquettes = new ArrayList<>();
	private static Color Rouge = Color.red;
	private static Color Noir = Color.black;
	private static Color Blanc = Color.white;
	private static Color Vert = Color.green;
	private static Color Bleu = Color.blue;
	private static Color Jaune = Color.yellow;
	private static Color Orange  = Color.orange;

	public static void dessiner(Forme sh) {
		seq.add(new Dessiner(sh));
	}

	public static void remplir(Forme sh, Color col) {
		seq.add(new Remplir(sh,col));
	}

	public static void creer(Forme sh) {
		seq.add(new Creation(sh));
	}

	public static void creer(Forme sh, Crayon cray) {
		seq.add(new Creation(sh,cray));

	}	
	public static void etiqueter(Forme sh) {
		seq.add(new Etiqueter(sh));
	}

	public static void lancer() throws Exception {
		seq.interpreter();		

		Affichage aff = new Affichage(dess,etiquettes);

	}
	public static ArrayList<Dessin> getDess() {
		return dess;
	}
	
	public static void setDess(ArrayList<Dessin> dess) {
		Script.dess = dess;
	}

	public static ArrayList<Etiquette> getEtiquettes(){
		return etiquettes;
	}
	
	public static void setEtiquettes(ArrayList<Etiquette> etiquettes){
		Script.etiquettes = etiquettes;
	}
	public static void main(String[] args) throws Exception {

		Point p1 = Creation.Point(500,200);
		Point p3 = Creation.Point(100,100);
		
		/*Rectangle rec = Creation.Rectangle(100,50,p1,10);
		//dessiner(rec);
		remplir(rec, Vert);
		//etiqueter(rec);*/
		Point p2 = Creation.Point(20, 60);
		/*Rectangle rec2 = Creation.Rectangle(200, 300, p2);
		Cercle cercle = Creation.Cercle(p1, 100, 10);
		dessiner(cercle);
		remplir(cercle, Rouge);
		//etiqueter(cercle);
		dessiner(rec2);
		remplir(rec2, Jaune);
		//etiqueter(rec2);*/
		Point p4 = Creation.Point(600,600);
		/*Trait trait = Creation.Trait(p2,p4, 10);
		dessiner(trait);
		etiqueter(trait);*/
		CourbeDeBezier courbe = Creation.CourbeDeBezier(p2,p1,p3,p4,50);
		dessiner(courbe);
		

		//Etiquette E = new Etiquette("coucou");

		lancer(); 		

	}



}
