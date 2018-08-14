package code;

import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

public class Jeu extends JPanel  {
	
	public Jeu (Graphics g ) throws IOException  {
		
		this.setBackground(Color.cyan);
		
		Avion Avion1=new Avion();
		
		super.paintComponent(g);
	//	g.drawImage(Avion1.getimage(), 0, 0, null);
	}
	
	
	
	public void gameloop () {
		
		while(true)//le 1 est pour indiquer que c'est une boucle infinie
		{
			//update()
			
			//draw()
		}
	}

	public void GameOver() {
		/*
		 * Graphics g = this.getGraphics();
		 * 
		 * g.setColor(Color.black); g.fillRect(0, 0, BOARD_WIDTH, BOARD_HEIGHT);
		 * 
		 * g.setColor(new Color(0, 32, 48)); g.fillRect(50, BOARD_WIDTH / 2 - 30,
		 * BOARD_WIDTH - 100, 50); g.setColor(Color.white); g.drawRect(50, BOARD_WIDTH /
		 * 2 - 30, BOARD_WIDTH - 100, 50);
		 * 
		 * Font small = new Font("Helvetica", Font.BOLD, 14); FontMetrics metr =
		 * this.getFontMetrics(small);
		 * 
		 * g.setColor(Color.white); g.setFont(small); g.drawString(message, (BOARD_WIDTH
		 * - metr.stringWidth(message)) / 2, BOARD_WIDTH / 2);
		 */
	}
}
