package pack_Button;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.sdz.mode1.Horloge;

public class Fenetre_B extends JFrame implements ActionListener {
	  private Panneau1 pan = new Panneau1();
	  private JButton bouton = new JButton("Car 1");
	  private JButton bouton2 = new JButton("Voiture 2");
	  private JPanel container = new JPanel();
	  private JLabel label = new JLabel("LAB MI");
	  private Horloge horloge;
	  private int compteur = 0;
	  private boolean animated = true;
	  private boolean backX, backY;
	  private int x, y;
	  
	  public Fenetre_B(){
		  
	    this.setTitle("Animation");
	    this.setSize(300, 300);
	    //On initialise l'horloge
	    this.horloge = new Horloge();
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);

	    container.setBackground(Color.white);
	    container.setLayout(new BorderLayout());
	    container.add(pan, BorderLayout.CENTER);
	    
	    //***********************************************//

	    //Première classe écoutant mon premier bouton 
	    bouton.addActionListener(this);
	    //Deuxième classe écoutant mon premier bouton
	    bouton.addActionListener(new Bouton3Listener());
	    
	    bouton2.addActionListener(this);
//***************************************************//
	    JPanel south = new JPanel();
	    south.add(bouton);
	    south.add(bouton2);
	    container.add(south, BorderLayout.SOUTH);

	    //********************************************//
	    Font police = new Font("TimesNewRoman", Font.BOLD, 16);
	    label.setFont(police);
	    label.setForeground(Color.black);
	    label.setHorizontalAlignment(JLabel.CENTER);
	    container.add(label, BorderLayout.NORTH);
	    

	    //******************************************//
	    this.setContentPane(container);
	    this.setVisible(true);
	    go();
	  }

	  private void go(){
		    for(int i = -50; i < pan.getWidth(); i++){
		      int x = pan.getPosX(), y = pan.getPosY();
		      x++;
		      y++;
		      pan.setPosX(x);
		      pan.setPosY(y);
		      pan.repaint();  
		      try {
		        Thread.sleep(10);
		      } catch (InterruptedException e) {
		        e.printStackTrace();
		      }
		    }
		  }

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		 if(arg0.getSource() == bouton)
			    label.setText("Vous avez cliqué sur le bouton 1");

			  if(arg0.getSource() == bouton2)
			    label.setText("Vous avez cliqué sur le bouton 2");
			}
	
	
	//*************************************//
	 //Classe écoutant notre premier bouton
	  class BoutonListener implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	    public void actionPerformed(ActionEvent arg0) {
	      label.setText("Vous avez cliqué sur le bouton 1");        
	    }
	  }
	      
	  //Classe écoutant notre second bouton
	  class Bouton2Listener implements ActionListener{
	    //Redéfinition de la méthode actionPerformed()
	    public void actionPerformed(ActionEvent e) {
	    	animated = true;
	        bouton.setEnabled(false);
	        bouton2.setEnabled(true);
	        go();
	      label.setText("Vous avez cliqué sur le bouton 2");    
	    }
	  }      
	  
	  // Classe écoutant notre troisieme bouton
	  class Bouton3Listener implements ActionListener{
		    //Redéfinition de la méthode actionPerformed()
		    public void actionPerformed(ActionEvent e) {
		    	 animated = false;     
		         bouton.setEnabled(true);
		         bouton2.setEnabled(false);
		      System.out.println("Ma classe interne numéro 3 écoute bien !");          
		    }
		  }
	  
	}       


