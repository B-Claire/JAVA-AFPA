package code;

import java.awt.BorderLayout;
import java.awt.Color;
import java.io.IOException;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	private Container Conteneur = new Container();; // declaration de l objet qui stocke parametres
	private JButton bouton = new JButton();
	private JPanel Conteneur2 = new JPanel();

	public Fenetre() throws IOException {
		// Creation fenetres
		this.setTitle("Flying Shark CB");
		this.setSize(900, 900);
		this.setLocationRelativeTo(null);// mettre au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		/******************************************************/

		Conteneur.setBackground(Color.BLACK);

		/**************** CREATION BOUTONS *********************/
		// le BorderLayout. pour placer les composants de facon simple par rapport a une
		// position cardinale du conteneur.
		// ajout bouton au content pane de la JFrame

		// On définit le layout à utiliser sur le content pane
		this.setLayout(new BorderLayout());

		// composants a placer
		this.setContentPane(Conteneur);
		Container L1 = new Container();
		L1.setLayout(new BoxLayout(L1, BoxLayout.LINE_AXIS));
		L1.add(new JButton("<=")); // mettre image fleches
		L1.add(new JButton("        "));
		L1.add(new JButton("=>"));

		Container C1 = new Container();
		C1.setLayout(new BoxLayout(C1, BoxLayout.X_AXIS));
		C1.add(new JButton("haut"));

		Container C2 = new Container();
		C2.setLayout(new BoxLayout(C2, BoxLayout.X_AXIS));
		C2.add(new JButton("bas "));

		Container E1 = new Container();
		E1.setLayout(new BoxLayout(E1, BoxLayout.PAGE_AXIS));
		E1.add(C1);
		E1.add(L1);
		E1.add(C2);

		
		
		Conteneur.setLayout(new BorderLayout());// le conteneur contenant l'ensemble
	    Conteneur.add(new Jeu(), BorderLayout.CENTER); //1er decoupage pour afficher la partie jeu au centre
		this.getContentPane().add(E1, BorderLayout.SOUTH);// 2eme decoupage qui place les boutons en bas

		this.setVisible(true);

	}

}
