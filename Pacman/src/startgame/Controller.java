package startgame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import gameBoard.IBoard;
import gameBoard.LevelFactory;
import runner.Runner;
public class Controller implements ActionListener, ChangeListener,KeyListener {

	
	private View view;
	private IBoard Board;
	private Runner runner;
	
	public Controller(){
		view=new View();	
   view.getBtneasy().addActionListener(this);
   view.getBtnhard().addActionListener(this);
   view.getBtnnormal().addActionListener(this);
   view.getBtnstart().addActionListener(this);
   view.getBtnexit().addActionListener(this);
			
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String buttonPressed = e.getActionCommand();
		if(buttonPressed.equals("Start Game")||buttonPressed.equals("Exit")){
			if(buttonPressed.equals("Start Game")){
			view.getCard().show(view.getContentPane(),"cardlevelpanel");		
			}else{
				System.exit(0);
			}
			
		}else if(buttonPressed.equals("Hard")||buttonPressed.equals("Normal")||buttonPressed.equals("Easy")){
			if(buttonPressed.equals("Easy")){
				Board=new LevelFactory().create("easy");
			}else if(buttonPressed.equals("Normal")){
				Board=new LevelFactory().create("medium");
			}else{
				Board=new LevelFactory().create("hard");
			}
			
			view.getCard().show(view.getContentPane(),"cardgamepanel");	
			
			runner=new Runner();
			runner.setPosition(Board.getStartPoint());
			Board.setRunner(runner);
			view.Setboard(Board);
			view.setRunner(runner);
			view.repaint();
			}	
			
		}
		



	@Override
	public void stateChanged(ChangeEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public View getView() {
		// TODO Auto-generated method stub
		return this.view;
	}

}