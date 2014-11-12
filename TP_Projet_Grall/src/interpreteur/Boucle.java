package interpreteur;

public class Boucle implements Operateur {

	private Operateur boucleMoins1;
	private Operateur instruction;
	
	public Boucle (int i, Operateur instruction) {
		if (i >=0) {
			boucleMoins1 = new Boucle(i-1, instruction);
			instruction.executer();
		}
	}
	@Override
	public boolean executer() {
		// TODO Auto-generated method stub
		return false;
	}

}
