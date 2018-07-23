package Tableaux;

import java.util.Scanner;

public class Lecon4et5ExoMINMAX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
	// Exercice 1 lecon 4-5 algo : saisir 10 nombres reels compris entre 0 et 20 puis afficher le + petit, le + grand, la somme et la moyenne de ces nombres.
		
		float[] tNote= new float [10];
		float vMax=0, vMin=20, somme=0;
		boolean saisie=false;		
		Scanner sc = new Scanner(System.in);
		
		for (int i=0; i<tNote.length; i++) 
		{
			do
			{
				System.out.println("Saisir la note numéro "+(i+1));
				tNote[i]=sc.nextFloat();

				while ((tNote[i]<0 || tNote[i]>20) && !saisie)
				{System.out.println("Erreur saisie, resaisir la note numéro "+(i+1));
				tNote[i]=sc.nextFloat();
				if (tNote[i]>=0 && tNote[i]<=20) 
					{
					saisie=true;
					
					}
				}
				
				somme+=tNote[i];
				saisie=false;
				if (tNote[i]>vMax) {vMax=tNote[i];}
				if (tNote[i]<vMin) {vMin=tNote[i];}
				
			}while (saisie);
			
		}
		System.out.println("Le plus petit nombre de ce tableau est: "+vMin);	
		System.out.println("Le plus grand nombre de ce tableau est: "+vMax);	
		System.out.println("La somme des nombres de ce tableau est: "+somme);	
		System.out.println("La moyenne des nombres de ce tableau est: "+(somme/(tNote.length)));
		sc.close();
		
		
		

	}

}
