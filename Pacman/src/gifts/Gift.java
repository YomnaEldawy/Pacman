package gifts;

import runner.Runner;
import mazeElements.AllElements;

public class Gift extends AllElements {
	public void hit(Runner r){
		r.addGift();
		r.setPreviousWasWater(false);
	}
	public Gift(){
		this.setDestroyable(false);
	}
}
