package Fonctions;

import java.util.Scanner;

public class Ecrirefonctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nbrCopies=0;
		double total=0;
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Bonjour, Veuillez entrer le nombre de copies effectuées."); 
		nbrCopies = clavier.nextInt();
		
		if (nbrCopies<=10) {
			total=nbrCopies*0.10; 
			
			
		}else if (nbrCopies<=30)
		{
		total =1+(nbrCopies*0.09);	
		
		}
		
		else {total=1.90+(nbrCopies*0.08);	
		}
		
		System.out.println("Facture Imprimerie ALGO, Vous avez effectué "+nbrCopies+"cela fera"+total);

		
		
		
	}

}
