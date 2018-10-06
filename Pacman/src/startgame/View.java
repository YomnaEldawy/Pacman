package startgame;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gameBoard.IBoard;
import runner.Runner;
public class View extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnstart, btnexit, btneasy, btnnormal, btnhard;
	private JPanel gamepanel, scorepanel, startpanel, levelpanel, playpanel, endpanel;
	private IBoard Board;
	private Runner runner;

	private CardLayout card = new CardLayout();
	private ImageIcon image;
	private Image background, backgroundlevel, win, lose;
	private boolean booleanwin;

	public View() {
		image = new ImageIcon("C:\\Users\\PCC\\Downloads\\Documents\\background.png");
		background = image.getImage();
		image = new ImageIcon("C:\\Users\\PCC\\Downloads\\Documents\\background.png");
		backgroundlevel = image.getImage();
		image = new ImageIcon("C:\\Users\\PCC\\Downloads\\Documents\\background.png");
		win = image.getImage();
		image = new ImageIcon("C:\\Users\\PCC\\Downloads\\Documents\\background.png");
		lose = image.getImage();

		/**
		 * start panel
		 */

		
		startpanel = new JPanel() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				int iWidth2 = background.getWidth(this)/2;
				int iHeight2 = background.getHeight(this)/2;
				if (background != null) {
					int x = this.getParent().getWidth()/2 - iWidth2;
					int y = this.getParent().getHeight()/2 - iHeight2;
					g.drawImage(background, x, y, null);
				}
			}
		};

		startpanel.setBackground(Color.GREEN);
		startpanel.setLayout(null);

		btnstart = new JButton("Start Game");
		btnstart.setIcon(new ImageIcon(
				"C:\\Users\\PCC\\Downloads\\Documents\\game-interface-button-start-on-wooden-vector-clip-art_csp33330016.jpg"));
		btnstart.setBounds(600, 244, 204, 87);
		startpanel.add(btnstart);

		btnexit = new JButton("Exit");
		btnexit.setIcon(new ImageIcon(
				"C:\\Users\\PCC\\Downloads\\Documents\\game-interface-button-start-on-wooden-vector-clip-art_csp33330016.jpg"));
		btnexit.setBounds(600, 342, 204, 73);
		startpanel.add(btnexit);

		/**
		 * level panel
		 */

	
		levelpanel = new JPanel() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				int iWidth21 = backgroundlevel.getWidth(this) / 2;
				int iHeight21 = backgroundlevel.getHeight(this) / 2;
				if (backgroundlevel != null) {
					int x = this.getParent().getWidth() / 2 - iWidth21;
					int y = this.getParent().getHeight() / 2 - iHeight21;
					g.drawImage(backgroundlevel, x, y, null);
				}
			}
		};
		levelpanel.setBackground(Color.YELLOW);
		levelpanel.setLayout(null);

		btneasy = new JButton("Easy");
		btneasy.setBounds(600, 185, 141, 53);
		btneasy.setBackground(Color.pink);
		levelpanel.add(btneasy);

		btnnormal = new JButton("Normal");
		btnnormal.setBounds(600, 264, 141, 53);
		btnnormal.setBackground(Color.PINK);
		levelpanel.add(btnnormal);

		btnhard = new JButton("Hard");
		btnhard.setBounds(600, 345, 141, 53);
		btnhard.setBackground(Color.PINK);
		levelpanel.add(btnhard);

		/**
		 * play panel
		 */

		playpanel = new JPanel() {
			/**
				 * 
				 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics graphics) {
				Graphics2D g = (Graphics2D) graphics;
				super.paintComponent(g);
				for (int i = 0; i < Board.getHeight(); i++) {
					for (int j = 0; j < Board.getWidth(); j++) {
						if (i == runner.getPosition().getY() && j == runner.getPosition().getX()) {
							g.drawImage(runner.getImage(), i * 100, j * 100, null);
						}else{
							g.drawImage(Board.getItem(i, j).getimage(), i * 100, j * 100, null);
						}
					}
					
				}
				
			}
		};
		playpanel.setBackground(Color.white);
		playpanel.setLayout(new FlowLayout());

		/**
		 * score panel
		 */

		scorepanel = new JPanel();
		scorepanel.setBackground(Color.RED);
		scorepanel.setLayout(new FlowLayout());

		gamepanel = new JPanel();
		gamepanel.setLayout(new BorderLayout());
		gamepanel.setBackground(Color.orange);
		gamepanel.add(playpanel, BorderLayout.CENTER);
		gamepanel.add(scorepanel, BorderLayout.NORTH);

		/**
		 * end panel
		 */

		
		endpanel = new JPanel() {

			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				int iWidth3 = win.getWidth(this) / 2;
				int iHeight3 = win.getHeight(this) / 2;
				int iWidth31 = lose.getWidth(this) / 2;
				int iHeight31 = lose.getHeight(this) / 2;
				
				if (win != null || lose != null) {
					if (booleanwin) {
						int x = this.getParent().getWidth() / 2 - iWidth3;
						int y = this.getParent().getHeight() / 2 - iHeight3;
						g.drawImage(win, x, y, null);
					} else {
						int x = this.getParent().getWidth() / 2 - iWidth31;
						int y = this.getParent().getHeight() / 2 - iHeight31;
						g.drawImage(lose, x, y, null);
					}
				}
			}
		};

		endpanel.setBackground(Color.GREEN);
		endpanel.setLayout(null);

		btnstart = new JButton("play again");
		btnstart.setIcon(new ImageIcon(
				"C:\\Users\\PCC\\Downloads\\Documents\\game-interface-button-start-on-wooden-vector-clip-art_csp33330016.jpg"));
		btnstart.setBounds(600, 244, 204, 87);
		endpanel.add(btnstart);

		btnexit = new JButton("Exit");
		btnexit.setIcon(new ImageIcon(
				"C:\\Users\\PCC\\Downloads\\Documents\\game-interface-button-start-on-wooden-vector-clip-art_csp33330016.jpg"));
		btnexit.setBounds(600, 342, 204, 73);
		endpanel.add(btnexit);

		
		this.getContentPane().setLayout(card);
		this.getContentPane().add(gamepanel, "cardgamepanel");
		this.getContentPane().add(levelpanel, "cardlevelpanel");
		this.getContentPane().add(startpanel, "cardstartpanel");
		this.getContentPane().add(endpanel, "cardendpanel");	
		
		card.show(this.getContentPane(), "cardstartpanel");

	}

	public void setBooleanwin(boolean booleanwin) {
		this.booleanwin = booleanwin;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public JButton getBtnstart() {
		return btnstart;
	}

	public JButton getBtnexit() {
		return btnexit;
	}

	public JButton getBtneasy() {
		return btneasy;
	}

	public JButton getBtnnormal() {
		return btnnormal;
	}

	public JButton getBtnhard() {
		return btnhard;
	}

	public JPanel getScorepanel() {
		return scorepanel;
	}

	public JPanel getStartpanel() {
		return startpanel;
	}

	public JPanel getLevelpanel() {
		return levelpanel;
	}

	public JPanel getPlaypanel() {
		return playpanel;
	}

	public void Setboard(IBoard Board) {
		this.Board = Board;
	}

	public void setRunner(Runner runner) {
		this.runner = runner;
	}

	public CardLayout getCard() {
		return card;
	}

}