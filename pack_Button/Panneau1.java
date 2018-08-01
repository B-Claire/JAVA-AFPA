package pack_Button;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau1 extends JPanel {

	private int posX = 0;
	private int posY = 0;


	public void paintComponent (Graphics g) {

		// Cette phrase sera visible a chaque fois que la méthode sera invoquée
		System.out.println("Je suis exécutée !");


		//On choisit une couleur de fond pour le rectangle
		g.setColor(Color.black);
		//On le dessine de sorte qu'il occupe toute la surface
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		//On redéfinit une couleur pour le rond
		g.setColor(Color.blue);
		//On le dessine aux coordonnées souhaitées
		g.fillOval(posX, posY, 50, 50);

	}

	public int getPosX () {
		return posX;
	}

	public void setPosX (int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY (int posY) {
		this.posY = posY;
	}


}
