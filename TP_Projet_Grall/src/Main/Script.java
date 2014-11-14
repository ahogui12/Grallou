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

/**
 * Classe principale contenant le main du programme
 * Toutes les fonctions dans le langage créés sont utilisables ici 
 * @author Alex
 *
 */
public class Script {
	
	/**
	 * Sequence contenant l'ensemble des instructions passées en entrée, avant interprétation
	 */
	private static Sequence seq = new Sequence();
	/**
	 * Liste définissant les dessins 
	 */
	private static ArrayList<Dessin> dess = new ArrayList<>();
	/**
	 * Séquence d'étiquettes
	 */
	private static ArrayList<Etiquette> etiquettes = new ArrayList<>();

	/**
	 * Définition des couleurs dans la classe Script, afin de s'abstraire de la particule Color.
	 */
	private static Color Rouge = Color.red;
	private static Color Noir = Color.black;
	private static Color Blanc = Color.white;
	private static Color Vert = Color.green;
	private static Color Bleu = Color.blue;
	private static Color Jaune = Color.yellow;
	private static Color Orange  = Color.orange;
	
	
	/**
	 * Méthode dessiner du langage
	 * @param sh est la forme en question
	 */
	public static void dessiner(Forme sh) {
		seq.add(new Dessiner(sh));
	}
	
	/**
	 * Méthode de remplissage du langage
	 * @param sh
	 * @param col couleur de remplissage
	 */
	public static void remplir(Forme sh, Color col) {
		seq.add(new Remplir(sh,col));
	}
	
	/**
	 * Méthode de création, n'est utilisée que pour créer l'objet Creation
	 * @param sh forme à créer
	 */
	public static void creer(Forme sh) {
		seq.add(new Creation(sh));
	}
	
	/**
	 *  Méthode de création, n'est utilisée que pour créer l'objet Creation
	 * @param sh forme à créer
	 * @param cray crayon utilisé
	 */
	public static void creer(Forme sh, Crayon cray) {
		seq.add(new Creation(sh,cray));
		
	}	
	/**
	 * Création d'étiquette
	 * @param sh
	 */
	public static void etiqueter(Forme sh) {
		seq.add(new Etiqueter(sh));
	}
	
	/**
	 * Interprétation de la séquence, nécessaire  à l'exécution, 
	 * @throws Exception
	 */
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