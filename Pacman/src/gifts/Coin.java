package gifts;

import runner.Runner;

public class Coin extends Gift {
	public void hit(Runner r) {
		super.hit(r);
		markAsHit();
		r.setCoins(r.getCoins() + 1);
	}

	public String getElementName() {
		return "a coin";
	}

	public char getCharRepresentation() {
		return '$';
	}
}
