package startAndEnd;

import mazeElements.EmptyCell;
import runner.Runner;

public class EndPoint extends EmptyCell {
	public EndPoint() {
		super();
	}

	public void hit(Runner r) {
		r.markAsWinner();
	}

	public String getElementName() {
		return "end point";
	}

	public char getCharRepresentation() {
		return '⚐';
	}
}
