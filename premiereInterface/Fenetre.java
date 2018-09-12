package premiereInterface;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

//cour https://openclassrooms.com/fr/courses/26832-apprenez-a-programmer-en-java/23108-notre-premiere-fenetre
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {// herite de la classe Jframe , classe contenant la methode
	
	public Fenetre(){
	    this.setTitle("GridBagLayout");
	    this.setSize(300, 160);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);

	    //On crée nos différents conteneurs de couleur différente
	    JPanel cell1 = new JPanel();
	    cell1.setBackground(Color.YELLOW);
	    cell1.setPreferredSize(new Dimension(60, 40));		
	    JPanel cell2 = new JPanel();
	    cell2.setBackground(Color.red);
	    cell2.setPreferredSize(new Dimension(60, 40));
	    JPanel cell3 = new JPanel();
	    cell3.setBackground(Color.green);
	    cell3.setPreferredSize(new Dimension(60, 40));
	    JPanel cell4 = new JPanel();
	    cell4.setBackground(Color.black);
	    cell4.setPreferredSize(new Dimension(60, 40));
	    JPanel cell5 = new JPanel();
	    cell5.setBackground(Color.cyan);
	    cell5.setPreferredSize(new Dimension(60, 40));
	    JPanel cell6 = new JPanel();
	    cell6.setBackground(Color.BLUE);
	    cell6.setPreferredSize(new Dimension(60, 40));
	    JPanel cell7 = new JPanel();
	    cell7.setBackground(Color.orange);
	    cell7.setPreferredSize(new Dimension(60, 40));
	    JPanel cell8 = new JPanel();
	    cell8.setBackground(Color.DARK_GRAY);
	    cell8.setPreferredSize(new Dimension(60, 40));
			
	    //Le conteneur principal
	    JPanel content = new JPanel();
	    content.setPreferredSize(new Dimension(300, 120));
	    content.setBackground(Color.WHITE);
	    //On définit le layout manager
	    content.setLayout(new GridBagLayout());
			
	    //L'objet servant à positionner les composants
	    GridBagConstraints gbc = new GridBagConstraints();
			
	    //On positionne la case de départ du composant
	    gbc.gridx = 0;
	    gbc.gridy = 0;
	    //La taille en hauteur et en largeur
	    gbc.gridheight = 1;
	    gbc.gridwidth = 1;
	    content.add(cell1, gbc);
	    //---------------------------------------------
	    gbc.gridx = 1;
	    content.add(cell2, gbc);
	    //---------------------------------------------
	    gbc.gridx = 2;		
	    content.add(cell3, gbc);		
	    //---------------------------------------------
	    //Cette instruction informe le layout que c'est une fin de ligne
	    gbc.gridwidth = GridBagConstraints.REMAINDER;
	    gbc.gridx = 3;	
	    content.add(cell4, gbc);
	    //---------------------------------------------
	    gbc.gridx = 0;
	    gbc.gridy = 1;
	    gbc.gridwidth = 1;
	    gbc.gridheight = 2;
	    //Celle-ci indique que la cellule se réplique de façon verticale
	    gbc.fill = GridBagConstraints.VERTICAL;
	    content.add(cell5, gbc);
	    //---------------------------------------------
	    gbc.gridx = 1;
	    gbc.gridheight = 1;
	    //Celle-ci indique que la cellule se réplique de façon horizontale
	    gbc.fill = GridBagConstraints.HORIZONTAL;
	    gbc.gridwidth = GridBagConstraints.REMAINDER;
	    content.add(cell6, gbc);
	    //---------------------------------------------
	    gbc.gridx = 1;
	    gbc.gridy = 2;
	    gbc.gridwidth = 2;
	    content.add(cell7, gbc);
	    //---------------------------------------------
	    gbc.gridx = 3;
	    gbc.gridwidth = GridBagConstraints.REMAINDER;
	    content.add(cell8, gbc);
	    //---------------------------------------------
	    //On ajoute le conteneur
	    this.setContentPane(content);
	    this.setVisible(true);		
	  }
	
	
	
	
	
	
	
//	private Panneau1 pan = new Panneau1();
//
//	public Fenetre() {// constructeur
//
//		// On prévient notre JFrame que notre JPanel sera son content pane
//		this.setContentPane(pan);
//
//		// *****//
//
//		this.setVisible(true);// Rendre visible la fenetre
//
//		this.setTitle("Fenetre TEST ");// Définit un titre pour notre fenêtre
//
//		this.setSize(500, 700);// Définit sa taille : 500 pixels de large et 700 pixels de haut
//
//		this.setLocationRelativeTo(null); // Nous demandons maintenant à notre objet de se positionner au centre
//
//		// fenetre.setLocation(90, 20); // Les coordonnées, exprimées en pixels,origine
//		// est représentée par le coin
//		// supérieur gauche (x = largeur , y = hauteur)
//
//
//		// Empêcher/autoriser le redimensionnement de la fenêtre
//		//fenetre.setResizable(true);
//		// fenetre.setResizable(false);
//
//		// garder fenetre au premier plan
//		// fenetre.setAlwaysOnTop(true);
//
//		// Termine le processus lorsqu'on clique sur la croix rouge
//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//		go();
//
//	}
//
//	private void go() {
//		// for (int i = -50; i < pan.getWidth(); i++) { //boucle finie
//
//		// int x = this.pan.getPosX(), y = this.pan.getPosY();
//		// x++;
//		// y++;
//		// pan.setPosX(x);
//		// pan.setPosY(y);
//		
//
//		// Si nos coordonnées arrivent au bord de notre composant
//		// On réinitialise
//		// if(x == pan.getWidth() || y == pan.getHeight()){
//		// pan.setPosX(-50);
//		// pan.setPosY(-50);
//
//		for (;;) { // boucle infinie
//			// Les coordonnées de départ du rond
//			int x = pan.getPosX(), y = pan.getPosY();
//			
//			// Le booléen pour savoir si l'on recule ou non sur l'axe x
//			boolean backX = false;
//			
//			// Le booléen pour savoir si l'on recule ou non sur l'axe y
//			boolean backY = false;
//
//			// boucle while
//
//			while (true) {
//				// Si la coordonnée x est inférieure à 1, on avance
//				if (x < 1)
//					backX = false;
//
//				// Si la coordonnée x est supérieure à la taille du Panneau moins la taille du
//				// rond, on recule
//				if (x > pan.getWidth() - 50)
//					backX = true;
//
//				// Idem pour l'axe y
//				if (y < 1)
//					backY = false;
//				if (y > pan.getHeight() - 50)
//					backY = true;
//
//				// Si on avance, on incrémente la coordonnée
//				// backX est un booléen, donc !backX revient à écrire
//				// if (backX == false)
//				if (!backX)
//					pan.setPosX(++x);
//
//				// Sinon, on décrémente
//				else
//					pan.setPosX(--x);
//
//				// Idem pour l'axe Y
//				if (!backY)
//					pan.setPosY(++y);
//				else
//					pan.setPosY(--y);
//				
//				 pan.repaint(); // demande à votre composant, ici un JPanel, de se redessiner.
//
//				try {
//					// Thread est en fait un objet qui permet de créer un nouveau processus dans un
//					// programme ou de gérer le processus principal.
//
//					Thread.sleep(3); // moyen de suspendre le code exprimé en millième de secondes (1000=1sec)
//
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//
//			}
//		}
//	}



}

