package interpreteur;

public class Etiqueter implements Fonctions {

	private Forme shape;
	
	/**
	 * @param shape
	 */
	public Etiqueter(Forme shape) {	
		this.shape = shape;
	}
	
	public Forme getShape() {
		return shape;
	}
	
	@Override
	public void interpreter() {
		shape.etiqueter();

	}

}