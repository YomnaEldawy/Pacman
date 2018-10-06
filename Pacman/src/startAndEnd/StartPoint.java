package startAndEnd;

import mazeElements.EmptyCell;

public class StartPoint extends EmptyCell {
	public StartPoint(){
		super();
	}
	public String getElementName(){
		return "start point";
	}
	
	public char getCharRepresentation(){
		return '◯';
	}
}
