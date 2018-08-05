package Interface;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panneau extends JPanel{
	
	
	
	public void dessinerComposants(Graphics g){                
	    Font font = new Font("TimesNewRoman", Font.BOLD, 18);
	    g.setFont(font);
	    g.setColor(Color.white);          
	    g.drawString("Bienvenus dans le Jeu Flying!", 10, 20);                
	  }               

	
	
	
}
