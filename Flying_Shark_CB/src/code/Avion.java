package code;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class Avion  implements Commun{
	
	int taille, vie;
	int position , minPosition ,maxPosition;
	ImageIcon image;
	
	Avion () throws IOException{//constructeur
		
		vie =5;
		minPosition = 350;
		maxPosition = 850;
		
		
		
		BufferedImage myPicture = ImageIO.read(new File("Avion1.jpg"));
		image = new ImageIcon(myPicture);
		
		
		}
	public ImageIcon getimage () {
		return image;
	}
	public void turnLeft() {
		if (position> minPosition || position > maxPosition) {
			
			
		} else {
			
				
			
			position --;
			
		}
	}

	public void turnRight() {
if (position> minPosition || position > maxPosition) {
			
			
		} else {
			
				
			
			position ++;
			
		}
		
	}
	
	/* public void setDestroyed(boolean destroyed) {
	        
         this.destroyed = destroyed;
     }

     public boolean isDestroyed() {
     
         return destroyed;
     }*/
	
	
	
}
