package gifts;

import runner.Runner;

public class Raft extends Gift{
	public void hit(Runner r){
		super.hit(r);
		r.setRafts(r.getRafts() + 1);
	}
	public String getElementName() {
		return "a raft";
	}

	public char getCharRepresentation() {
		return '◉';
	}
}
