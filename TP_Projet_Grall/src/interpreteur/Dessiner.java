package interpreteur;


/**
 * Objet Dessiner
 * @author Alex
 *
 */
public class Dessiner implements Fonctions {

	private Forme shape;
	
	public Dessiner(Forme sh) {
		this.shape = sh;
	}
	
	
	public Forme getShape() {
		return shape;
	}


	@Override
	public void interpreter() {
		this.getShape().dessiner();

	}

}
