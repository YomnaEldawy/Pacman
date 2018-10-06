package walls;

import ghosts.Ghost;


public class Stone extends Wall {
	public Stone(){
		this.setDestroyable(false);
	}
	public String getElementName(){
		return "a stone";
	}
	public char getCharRepresentation(){
		return '█';
	}
	public int getID(){
		return 1;
	}
	public void hitGhost(Ghost g){
		g.setPosition(g.getPreviousPosition());
	}

}

