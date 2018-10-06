package gifts;

import runner.Runner;

public class Live extends Gift {
	public void hit(Runner r) {
		super.hit(r);
		markAsHit();
		r.setLives(r.getLives() + 1);
	}

	public String getElementName() {
		return "a live";
	}

	public char getCharRepresentation() {
		return '♥';
	}
}
