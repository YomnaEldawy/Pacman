package mazeElements;
import ghosts.Ghost;

import java.awt.Image;

import runner.Runner;

public abstract class AllElements {
	boolean alreadyHit;
	protected boolean destroyable;
	protected Image image =null;
	int ID = -1;
	public AllElements() {
		alreadyHit = false;
	}

	public boolean isAlreadyHit() {
		return alreadyHit;
	}
	
	public void markAsHit() {
		alreadyHit = true;
	}

	public void hit(Runner r) {
		r.setPreviousWasWater(false);
	}
	
	public void hitGhost(Ghost g){
	}

	public String getElementName() {
		return null;
	}

	public char getCharRepresentation() {
		return '0';
	}

	public boolean isDestroyable() {
		return destroyable;
	}

	public void setDestroyable(boolean d) {
		this.destroyable = d;
	}
	public int getID(){
		return ID;
	}
	public Image getimage() {
		// TODO Auto-generated method stub
		return image;
	}

	
	public void setimage(Image image) {
		// TODO Auto-generated method stub
		this.image=image;
	}

}
