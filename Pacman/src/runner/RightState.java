package runner;

import java.awt.Image;

public class RightState extends State {
	Image image;
	@Override
	public void doAction(Runner r) {
		r.moveRight();
		r.setImage(image);
		r.setState(this);
		r.setCharRepresentation('◑');

	}

}
