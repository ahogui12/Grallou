package Main;

import java.awt.Color;
import java.util.ArrayList;

import affichage.Affichage;
import affichage.Etiquette;
import interpreteur.Booleen;
import interpreteur.Creation;
import interpreteur.Dessiner;
import interpreteur.Etiqueter;
import interpreteur.Fonctions;
import interpreteur.Forme;
import interpreteur.If;
import interpreteur.Inserer;
import interpreteur.Remplir;
import interpreteur.Sequence;
import interpreteur.Superieur;
import moteur.Cercle;
import moteur.Crayon;
import moteur.Dessin;
import moteur.Point;
import moteur.Rectangle;

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
		
		Affichage aff = new Affichage(dess);
		
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
	
	public static void inserer(Forme fig1, Forme fig2) {
		seq.add(new Inserer(fig1,fig2));
	}

	public static void main(String[] args) throws Exception {

				Point p1 = Point.Point(500,100); //Création du point p1
				Point p3 = Point.Point(650,300); // Création du point p3
				
				Rectangle rec = Rectangle.Rectangle(500,500,p1,10); //Initialisation du rectangle
				dessiner(rec);	//procédure visant à dessiner le rectangle en paramètre				
				remplir(rec, Vert); //Remplissage du rectangle par la couleur verte
				
				Point p2 = Point.Point(20, 60);
				Rectangle rec2 = Rectangle.Rectangle(200, 300, p2);				
				inserer(rec, rec2); // On insère le second rectangle dans le premier
				
				Rectangle rec3 = new Rectangle();
				If fi = new If(new Superieur(5, 0), rec3.creer(100, 10, p1));
				lancer(); 		
				
	}

	
	
}