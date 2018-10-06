package walls;


public class Tree extends Wall {
	public Tree(){
		this.setDestroyable(true);
	}
	public String getElementName(){
		return "a tree";
	}
	public char getCharRepresentation(){
		return '▓';
	}
}

