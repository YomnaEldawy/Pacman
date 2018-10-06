package ghosts;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Random;

import runner.Runner;
import gameBoard.Board;

public class GhostsOnBoard {

	Board b;
	Runner r;
	int ghostsNumber;
	ArrayList<Ghost> ghostsList;
	public GhostsOnBoard(int ghostsNumber, Board b){
		this.b = b;
		this.r = b.getRunner();
		this.ghostsNumber = ghostsNumber;
		createGhosts();
	}
	public void createGhosts(){
		for (int i = 0; i < ghostsNumber; i++) {
			Ghost g = new Ghost();
			g.setBoard(b);
			g.setRunner(r);
			Random rand = new Random();
			int x = rand.nextInt(b.getWidth());
			int y = rand.nextInt(b.getHeight());
			g.setPosition(new Point(x,y));
			g.start();
		}
	}
}
