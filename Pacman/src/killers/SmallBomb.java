package killers;

import runner.Runner;

public class SmallBomb extends Bomb {

	public void hit(Runner r) {
		if(!isAlreadyHit()){
			markAsHit();	
			r.setLives(r.getLives() - 0.5);
		}
		r.setPreviousWasWater(false);
	}
	public String getElementName(){
		return "a small bomb";
	}
	public char getCharRepresentation(){
		return '✘';
	}
}
