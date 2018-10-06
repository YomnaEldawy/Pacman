package water;

import mazeElements.AllElements;
import runner.Runner;

public class Water extends AllElements{
	public void hit(Runner r){
		if(!r.wasPreviousWater() && r.getRafts() > 0){
			r.setRafts(r.getRafts() - 1);
			r.setPreviousWasWater(true);
		}else if (r.getRafts() <= 0 && !r.wasPreviousWater()){
			r.setLives(r.getLives()- 1.0);
			r.setPosition(r.getPreviousPosition());
			r.setPreviousWasWater(false);
		}
		
	}
	public String getElementName() {
		return "water";
	}

	public char getCharRepresentation() {
		return '❄';
	}

}
