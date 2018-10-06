package mazeElements;

public class EmptyCell extends AllElements {
	public EmptyCell(){
		this.setDestroyable(false);
	}
	public String getElementName(){
		return "an empty cell";
	}
	
	public char getCharRepresentation(){
		return '-';
	}
	
}
