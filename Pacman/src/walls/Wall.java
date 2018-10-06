package walls;

import mazeElements.AllElements;
import runner.Runner;
public class Wall extends AllElements{

	public void hit(Runner r) {
		r.setPosition(r.getPreviousPosition());
	}
}
