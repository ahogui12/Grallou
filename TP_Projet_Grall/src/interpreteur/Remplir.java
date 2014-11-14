package interpreteur;

import java.awt.Color;

/**
 * Objet Remplir
 * @author Alex
 *
 */
public class Remplir implements Fonctions {

	private Forme shape;
	private Color col;
	
	public Remplir(Forme sh, Color col) {
		this.shape = sh;
		this.col = col;
	}
	
	public Forme getShape() {
		return shape;
	}

	@Override
	public void interpreter() throws Exception {
		this.getShape().remplir(col);
	}

}
