package pack_Button;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Bouton extends JButton  implements MouseListener{
	private String name;
	private Image img;

	public Bouton(String str) {
		super(str);
		this.name = str;
		try {
			// img = ImageIO.read(new
			// File("C:\\Users\\59013-14-02\\Desktop\\workspace\\Button\\396528.png"));
			img = ImageIO.read(new File("arabesco_facebook_cover.jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Gr�ce � cette instruction, notre objet va s'�couter
		// D�s qu'un �v�nement de la souris sera intercept�, il en sera averti
		this.addMouseListener(this);

	}
	// arabesco_facebook_cover.jpg

	 public void paintComponent(Graphics g){
		    Graphics2D g2d = (Graphics2D)g;
		    GradientPaint gp = new GradientPaint(0, 0, Color.blue, 0, 20, Color.cyan, true);
		    g2d.setPaint(gp);
		    g2d.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
		    g2d.setColor(Color.white);
		    g2d.drawString(this.name, this.getWidth() / 2 - (this.getWidth() / 2 /4), (this.getHeight() / 2) + 5);
		  }

	// M�thode appel�e lors du clic de souris
	public void mouseClicked(MouseEvent event) {
		//Nous changeons le fond de notre image pour le vert lorsque nous quittons le bouton, avec le fichier fondBouton.png
	    try {
	      img = ImageIO.read(new File("396528.png"));
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}

	// M�thode appel�e lors du survol de la souris
	public void mouseEntered(MouseEvent event) {
		  //Nous changeons le fond de notre image pour le jaune lors du survol, avec le fichier fondBoutonHover.png
	    try {
	      img = ImageIO.read(new File("bouton-rouge.jpg"));
	    } catch (IOException e) {
	      e.printStackTrace();
	    }
	}

	// M�thode appel�e lorsque la souris sort de la zone du bouton
	public void mouseExited(MouseEvent event) {
		  try {
		      img = ImageIO.read(new File("images.jpg"));
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	}

	// M�thode appel�e lorsque l'on presse le bouton gauche de la souris
	public void mousePressed(MouseEvent event) {
		try {
		      img = ImageIO.read(new File("images(1).jpg"));
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
	}

	// M�thode appel�e lorsque l'on rel�che le clic de souris
	public void mouseReleased(MouseEvent event) {
		try {
		      img = ImageIO.read(new File("images2.jpg"));
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		
		  //Nous changeons le fond de notre image pour le orange lorsque nous rel�chons le clic avec le fichier fondBoutonHover.png si la souris est toujours sur le bouton
		  if((event.getY() > 0 && event.getY() < this.getHeight()) && (event.getX() > 0 && event.getX() < this.getWidth())){
		    try {
		      img = ImageIO.read(new File("fond_bouton_orange.png"));
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		  }
		  //Si on se trouve � l'ext�rieur, on dessine le fond par d�faut
		  else{
		    try {
		      img = ImageIO.read(new File("fondboutonbleu.jpg"));
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		  }      
		
		
		
		
	}

	/*
	 * public void paintComponent (Graphics g) { Graphics2D g2d = (Graphics2D)g;
	 * GradientPaint gp = new GradientPaint (0,10, Color.red, 0,20, Color.ORANGE,
	 * true);// prends que deux param�tres de couleurs g2d.setPaint(gp);
	 * g2d.fillRect(0, 0, this.getWidth(), this.getHeight());
	 * g2d.setColor(Color.black); g2d.drawString(this.name, this.getWidth() / 2 -
	 * (this.getWidth()/ 2 /4), (this.getHeight() / 2) + 5);
	 * 
	 * 
	 * }
	 */
}