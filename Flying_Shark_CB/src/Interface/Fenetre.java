package Interface;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame {
	private JPanel Panneau = new JPanel(); // declaration de l objet qui stocke parametres
	private JButton bouton = new JButton();

	public Fenetre() {
		// Creation fenetre
		this.setTitle("Flying Shark CB");
		this.setSize(900, 900);
		this.setLocationRelativeTo(null);// mettre au centre
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);

		/******************************************************/

		Panneau.setBackground(Color.BLACK);
		
		this.getContentPane().add(new JButton("=>"), BorderLayout.EAST);
		this.getContentPane().add(new JButton("=>"), BorderLayout.WEST);
		this.getContentPane().add(new JButton("=>"), BorderLayout.NORTH);
		this.getContentPane().add(new JButton("=>"), BorderLayout.SOUTH);
		
	/*	Panneau.setLayout(new BoxLayout(Panneau, BoxLayout.LINE_AXIS));
		Panneau.add(new JButton("=>")); // mettre image fleches
		Panneau.add(new JButton("<="));

		Panneau.setLayout(new BoxLayout(Panneau, BoxLayout.PAGE_AXIS));
		Panneau.add(new JButton("haut"));
		Panneau.add(new JButton("bas"));*/

		this.setContentPane(Panneau);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fenetre fen = new Fenetre();

		// faire card layout?
	}

}
