package killers;

import runner.Runner;

public class BigBomb extends Bomb {
	public void hit(Runner r) {
		if(!isAlreadyHit()){
			markAsHit();
			r.setLives(r.getLives() - 1);
		}
	}
	public String getElementName(){
		return "a big bomb";
	}
	public char getCharRepresentation(){
		return '☠';
	}
}
