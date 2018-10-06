package runner;

import java.awt.Image;

public class DownState extends State {
	Image image;
	@Override
	public void doAction(Runner r) {
		r.moveDown();
		r.setImage(image);
		r.setState(this);
		r.setCharRepresentation('◒');

	}

}
