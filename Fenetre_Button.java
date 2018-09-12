package pack_Button;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Fenetre_Button extends JFrame {

	  
	private Panneau1 pan = new Panneau1 ();
private Bouton Bouton = new Bouton ("mon bouton");
private JPanel container = new JPanel();
private JLabel label = new JLabel("Le JLabel");
	

public Fenetre_Button() {

	this.setTitle("Box ");
		this.setSize(300, 120);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
		container.add(pan, BorderLayout.CENTER);
		container.add(bouton, BorderLayout.SOUTH);
		  //Définition d'une police d'écriture
		  Font police = new Font("Tahoma", Font.BOLD, 16);	  
		  //On l'applique au JLabel
	  label.setFont(police);
		  
		  //Changement de la couleur du texte
		  label.setForeground(Color.blue);
		  
		  //On modifie l'alignement du texte grâce aux attributs statiques
		  //de la classe JLabel
		  label.setHorizontalAlignment(JLabel.CENTER);
		container.add(label, BorderLayout.NORTH);

		this.setContentPane(container);
		this.setVisible(true);
		go();

		pan.add(bouton);
		this.setContentPane(pan);
		this.setVisible(true);

		 // CardLayout cl = new CardLayout();
		 JPanel content = new JPanel();
		
	 // Liste des noms de nos conteneurs pour la pile de cartes
		 String[] listContent = { "CARD_1", "CARD_2", "CARD_3" };
		
		 int indice = 0;
		 //On crée trois conteneurs de couleur différente
		 JPanel card1 = new JPanel();
		 card1.setBackground(Color.blue);
		 JPanel card2 = new JPanel();
		 card2.setBackground(Color.red);
		 JPanel card3 = new JPanel();
		 card3.setBackground(Color.green);
		
		 JPanel boutonPane = new JPanel();
		
		JButton bouton = new JButton("Contenu suivant");
		
		 //Définition de l'action du bouton
		 bouton.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent event){
		//Via cette instruction, on passe au prochain conteneur de la pile
	 cl.next(content);
		 }
		 });
		 JButton bouton2 = new JButton("Contenu par indice");
		
		 //Définition de l'action du bouton2
		 bouton2.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent event){
		if(++indice > 2)
		 indice = 0;
		 //Via cette instruction, on passe au conteneur correspondant au nom fourni en
		 paramètre
		 cl.show(content, listContent[indice]);
		 }
		 });
		
		 boutonPane.add(bouton);
		 boutonPane.add(bouton2);
		
		 //On définit le layout
		 content.setLayout(cl);
		 //On ajoute les cartes à la pile avec un nom pour les retrouver
		 content.add(card1, listContent[0]);
		 content.add(card2, listContent[1]);
		 content.add(card3, listContent[2]);
		
		this.getContentPane().add(boutonPane, BorderLayout.NORTH);
		 this.getContentPane().add(content, BorderLayout.CENTER);
		
		this.setVisible(true); */

		/*
		 * this.setTitle("boutton"); this.setSize(800, 300);
		 * 
		 * this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 * this.setLocationRelativeTo(null);
		 * 
		 * //Ajout du bouton à notre content pane pan.add(bouton);
		 * this.setContentPane(pan); this.setVisible(true);
		 * 
		 * //On définit le layout à utiliser sur le content pane this.setLayout(new
		 * BorderLayout());
		 */

		// le BorderLayout. pour placer les composants de façon simple par rapport à une
		// position cardinale du conteneur.
		// On ajoute le bouton au content pane de la JFrame

		/*
		 * //Au centre this.getContentPane().add(new JButton("CENTER"),
		 * BorderLayout.CENTER); //Au nord this.getContentPane().add(new
		 * JButton("NORTH"), BorderLayout.NORTH); //Au sud this.getContentPane().add(new
		 * JButton("SOUTH"), BorderLayout.SOUTH); //À l'ouest
		 * this.getContentPane().add(new JButton("WEST"), BorderLayout.WEST); //À l'est
		 * this.getContentPane().add(new JButton("EAST"), BorderLayout.EAST);
		 */

		/*
		 * //Trois lignes sur deux colonnes this.setLayout(new GridLayout(3, 2)); //On
		 * ajoute le bouton au content pane de la JFrame this.getContentPane().add(new
		 * JButton("1")); this.getContentPane().add(new JButton("2"));
		 * this.getContentPane().add(new JButton("3")); this.getContentPane().add(new
		 * JButton("4")); this.getContentPane().add(new JButton("5"));
		 * this.setVisible(true);
		 */

		/*
		 * this.setTitle("Box Layout"); this.setSize(300, 120);
		 * this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 * this.setLocationRelativeTo(null);
		 * 
		 * JPanel b1 = new JPanel(); // On définit le layout en lui indiquant qu'il
		 * travaillera en ligne b1.setLayout(new BoxLayout(b1, BoxLayout.LINE_AXIS));
		 * b1.add(new JButton("Bouton 1"));
		 * 
		 * JPanel b2 = new JPanel(); // Idem pour cette ligne b2.setLayout(new
		 * BoxLayout(b2, BoxLayout.LINE_AXIS)); b2.add(new JButton("Bouton 2"));
		 * b2.add(new JButton("Bouton 3"));
		 * 
		 * JPanel b3 = new JPanel(); // Idem pour cette ligne b3.setLayout(new
		 * BoxLayout(b3, BoxLayout.LINE_AXIS)); b3.add(new JButton("Bouton 4"));
		 * b3.add(new JButton("Bouton 5")); b3.add(new JButton("Bouton 6"));
		 * 
		 * JPanel b4 = new JPanel(); // On positionne maintenant ces trois lignes en
		 * colonne b4.setLayout(new BoxLayout(b4, BoxLayout.PAGE_AXIS)); b4.add(b1);
		 * b4.add(b2); b4.add(b3);
		 * 
		 * this.getContentPane().add(b4); this.setVisible(true);
		 */

}