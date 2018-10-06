package gifts;
import runner.Runner;

public class Bullet extends Gift {
	public void hit(Runner r){
		super.hit(r);
		if(!isAlreadyHit()){
			markAsHit();
			r.setBullets(r.getBullets() + 1);
		}
	}
	public String getElementName(){
		return "a bullet";
	}
	public char getCharRepresentation(){
		return '➤';
	}
}
