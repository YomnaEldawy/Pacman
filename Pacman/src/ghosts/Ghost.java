package ghosts;

import gameBoard.Board;

import java.awt.Point;
import java.util.Random;

import runner.Runner;

public class Ghost extends Thread {
	private Point position = new Point(0, 0);
	private Point previousPosition = new Point(0,0);
	private Runner r;
	private Board b;

	public void run() {
		Random rand = new Random();
		while (r.isAlive()) {
			int n = rand.nextInt(4);
			switch (n) {
			case 0:
				if (position.getY() > 0)
					moveUp();
				break;
			case 1:
				if (position.getY() < b.getHeight() - 1)
					moveDown();
				break;
			case 2:
				if (position.getX() < b.getWidth())
				moveRight();
				break;
			case 3:
				if (position.getX() > 0)
				moveLeft();
				break;
			default:
				break;
			}
			b.getItem((int) position.getY(), (int) position.getX()).hitGhost(
					this);
			if (r.getPosition() == position) {
				r.setLives(0);
			}
			System.out.println("A ghost is at (" + position.getX() +" , " + position.getY() + ")");
			System.out.println("R is at "+r.getPosition());
			try {
				Thread.sleep(6000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	public void moveUp() {
		setPreviousPosition(position);
		if (position.getY() > 0)
			setPosition(new Point((int) position.getX(),
					(int) (position.getY() - 1.0)));
	}

	public void moveDown() {
		setPreviousPosition(position);
		if(position.getY() < b.getHeight())
		setPosition(new Point((int) position.getX(),
				(int) (position.getY() + 1.0)));
	}

	public void moveRight() {
		setPreviousPosition(position);
		if(position.getX() < b.getWidth())
		setPosition(new Point((int) (position.getX() + 1.0),
				(int) position.getY()));

	}

	public void moveLeft() {
		setPreviousPosition(position);
		if (position.getX() > 0)
			setPosition(new Point((int) (position.getX() - 1.0),
					(int) position.getY()));

	}

	public Point getPreviousPosition() {
		return previousPosition;
	}

	public void setPreviousPosition(Point previousPosition) {
		this.previousPosition = previousPosition;
	}

	public Point getPosition() {
		return position;
	}

	public void setPosition(Point position) {
		this.position = position;
	}

	public Runner getRunner() {
		return r;
	}

	public void setRunner(Runner r) {
		this.r = r;
	}

	public void setBoard(Board b) {
		this.b = b;
	}

}
