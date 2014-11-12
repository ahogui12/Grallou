package interpreteur;

import java.util.ArrayList;
import java.util.List;

public class SequenceScript implements Operateur{
	
	List<Operateur> ls;
	
	
		private SequenceScript() {
			this.ls = new ArrayList<Operateur>();
		}
	
		public SequenceScript creerSequence() {
			return new SequenceScript();
		}
	public boolean add(Operateur o) {
		return this.ls.add(o);
	}

	@Override
	public boolean executer() {
		for (int i = 0; i < this.ls.size(); i++) {
			this.ls.get(i).executer();
		}
		return true;
	}

	
}
