package Main;

import java.awt.Color;
import java.util.ArrayList;

import affichage.Affichage;
import interpreteur.Creation;
import interpreteur.Dessiner;
import interpreteur.Etiqueter;
import interpreteur.Forme;
import interpreteur.Remplir;
import interpreteur.Sequence;
import moteur.Cercle;
import moteur.Crayon;
import moteur.Dessin;
import moteur.Point;
import moteur.Rectangle;

public class Script {
	
	private static Sequence seq = new Sequence();
	private static ArrayList<Dessin> dess = new ArrayList<>();
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

	public static void main(String[] args) throws Exception {

				Point p1 = Creation.Point(500,100);
				Rectangle rec = Creation.Rectangle(100,50,p1,10);
				dessiner(rec);
				remplir(rec, Vert);
				Point p2 = Creation.Point(20, 60);
				Rectangle rec2 = Creation.Rectangle(200, 300, p2);
				dessiner(rec2);
				remplir(rec2, Rouge);
				lancer(); 		
				
	}

	
	
}
