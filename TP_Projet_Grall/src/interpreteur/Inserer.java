package interpreteur;

public class Inserer implements Fonctions {

	private Forme fig1;
	private Forme fig2;
	
	
	/**
	 * @param fig1
	 * @param fig2
	 */
	public Inserer(Forme fig1, Forme fig2) {
		super();
		this.fig1 = fig1;
		this.fig2 = fig2;
	}


	public Forme getFig1() {
		return fig1;
	}


	public Forme getFig2() {
		return fig2;
	}


	@Override
	public void interpreter() throws Exception {
		fig1.inserer(fig2);

	}

}
