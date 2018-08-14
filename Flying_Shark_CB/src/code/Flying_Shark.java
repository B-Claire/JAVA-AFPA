package code;

import java.awt.Color;
import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JFrame;

public class Flying_Shark extends JFrame implements Commun {
	
	public Flying_Shark() {
		
	}
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {//essayer de faire qq chose
			Jeu Flying_Shark = new Jeu ();
			Fenetre fen = new Fenetre();
		} catch (IOException e) { //faire affichage erreur et les appels faits
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
    }

	

}
