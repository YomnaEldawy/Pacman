package tryPacMan;

import java.util.Date;
import runner.State;
import java.util.Scanner;

import runner.*;
import gameBoard.Board;
import gameBoard.LevelFactory;

public class TryBoard {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		LevelFactory lf = new LevelFactory();
		Board b = lf.create("easy");
		Runner r = new Runner();
		r.setPosition(b.getStartPoint());
		b.setRunner(r);
		b.printBoard();
		String query;
		Date st = new Date();
		Date end = new Date();
		long time = end.getTime() - st.getTime();
		System.out.println("time passed:" + time);

		while (r.isAlive() && !r.isWinner()) {
			System.out.println("enter direction");
			query = input.nextLine();
			switch (query) {
			case "down":
				if (r.getPosition().getY() < b.getHeight() - 1){
					State rs = new DownState();
					rs.doAction(r);
				}
				break;
			case "up":
				if (r.getPosition().getY() > 0){
					State us = new UpState();
					us.doAction(r);
				}
				break;
			case "left":
				if (r.getPosition().getX() > 0){
					State ls = new LeftState();
					ls.doAction(r);
				}
				break;
			case "right":
				if (r.getPosition().getX() < b.getWidth() - 1){
					State rs = new RightState();
					rs.doAction(r);
				}
				break;
			case "shoot":
				r.shoot(b);
				break;
			default:
				break;
			}
			b.getItem((int) r.getPosition().getY(),
					(int) r.getPosition().getX()).hit(r);
			if (!r.wasPreviousWater())
				b.destroy((int) r.getPosition().getY(), (int) r.getPosition()
						.getX());
			time = end.getTime() - st.getTime();

			double score = r.getTotalGifts()*1000000 / (time+1);
			r.setScore(score);
			b.printBoard();
			end = new Date();
			System.out.println("time passed:" + time / 60000 + "m,"
					+ (time / 10000) % 60 + "s");
		}
		if (r.isAlive()) {
			System.out.println("You win");
		} else {
			System.out.println("You ran out of lives :(");
		}
		input.close();

	}

	public static void printBoard(Board b, Runner r) {
		for (int i = 0; i < b.getHeight(); i++) {
			for (int j = 0; j < b.getWidth(); j++) {
				if (i == r.getPosition().getY() && j == r.getPosition().getX()) {
					System.out.print(r.getCharRepresentation() + "   ");
				} else {
					System.out.print(b.getItem(i, j).getCharRepresentation()
							+ "  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Bullets: " + r.getBullets());
		System.out.println("Score: " + r.getScore());
		System.out.println("Lives: " + r.getLives());
		System.out.println("Score: "+ r.getScore());

	}
}
