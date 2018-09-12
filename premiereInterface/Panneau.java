//package premiereInterface;
//
//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Graphics;
//import java.awt.Image;
//import java.io.File;
//import java.io.IOException;
//
//import javax.imageio.ImageIO;
//import javax.swing.JPanel;
//
//public class Panneau extends JPanel {
//
//	//public void paintComponent(Graphics g) { // methode que l'objet apelle pour se dessiner sur la fenetre
//		// pas besoin de redefinir un constructeur car cette methode est appelee automatiquement !
//
//		// Cette phrase sera visible a chaque fois que la méthode sera invoquée
//		//System.out.println("Je suis exécutée !");
//
//		// Trace un rond plein en commençant a dessiner sur l'axe x à 20 pixels et sur
//		// l'axe y à 20 pixels, et fais en sorte qu'il occupe 75 pixels de large et 75 pixels de haut.
//		//g.fillOval(20, 20, 75, 75);
//		
//		
//		/*  int x1 = this.getWidth()/4;
//		  int y1 = this.getHeight()/10;                      
//		    g.fillOval(x1, y1, this.getWidth()/5, this.getHeight()/6);*/
//		    
//		    
//   //Vous pouvez aussi modifier la couleur (la modification s'appliquera egalement pour les autres methodes) 
//		    //et la police d'écriture. 
//		    
//		 /*   Font font = new Font("Courier", Font.BOLD, 20);
//		    g.setFont(font);
//		    g.setColor(Color.red);
//		    
//		    //méthode permettant d'écrire du texte
//		    g.drawString("Tiens ! Le Site du Zéro !", 10, 20);   
//		    */
//		    
//		  /* try {
//		        Image img = ImageIO.read(new File("kyô.jpg"));
//		        //g.drawImage(img, 0, 0, this);
//		        //Pour dimensionner une image de fond
//		        g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
//		      } catch (IOException e) {
//		        e.printStackTrace();}
//*/
//		    
//		  /*  
//		   // fond 2D avec degrade oblique
//		    Graphics2D g2d = (Graphics2D)g;         
//		    GradientPaint gp = new GradientPaint(0, 0, Color.RED, 10, 10,Color.magenta, true);     
//		    GradientPaint gp2 = new GradientPaint(20, 0, Color.magenta, 40, 0, Color.orange, true);
//		    GradientPaint gp3 = new GradientPaint(40, 0, Color.orange, 60, 0, Color.yellow, true);
//		    GradientPaint gp4 = new GradientPaint(60, 0, Color.green, 80, 0, Color.yellow, true);
//		    GradientPaint gp5 = new GradientPaint(80, 0, Color.yellow, 100, 0, Color.orange, true);
//		    GradientPaint gp6 = new GradientPaint(100, 0, Color.orange, 120, 0, Color.red, true);
//
//		    
//		    g2d.setPaint(gp);
//		    g2d.fillRect(0, 0, this.getWidth(), this.getHeight());   */
//		    
//	}
//
//}
