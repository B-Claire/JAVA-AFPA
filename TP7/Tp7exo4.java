package TP7;

import java.util.Scanner;

public class Tp7exo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rep=0;;
		String str=new String ();
		int prix;
		float TTC;
		Scanner clavier = new Scanner(System.in);
	
		while (rep == '0')
		{		
			System.out.println("entrez un prix");
			prix = clavier.nextInt();
			
			TTC= (float)(prix*0.2);
			System.out.println("le prix est:"+TTC);
			
			System.out.println("Voulez-vous continuer (0 pour oui/1pour non)");
			rep=clavier.nextInt();
			while(rep!=0 && rep!=1) {
				System.out.println("ressaisir (0 pour oui/1 pour non)");
				rep=clavier.nextInt();
			}
		}
		
		
		
		
		
		
		
		clavier.close();	
		
	}

}
