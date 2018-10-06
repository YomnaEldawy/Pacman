package runner;

import java.awt.Image;

public class LeftState  extends State {
	Image image;
	@Override
	public void doAction(Runner r) {
		r.moveLeft();
		r.setImage(image);
		r.setState(this);
		r.setCharRepresentation('◐');

	}

}
