package runner;

import java.awt.Image;

public class UpState extends State{
	private Image image;
	@Override
	public void doAction(Runner r) {
		// TODO Auto-generated method stub
		r.moveUp();
		r.setImage(image);
		r.setState(this);
		r.setCharRepresentation('◓');
	}

}
