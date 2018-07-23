package Tableaux;

import java.util.Scanner;

public class Lecon4et5ExoTEMP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Exercice 2 lecon 4-5 algo : Saisir des températures dans un tableau et les classer par ordre croissant.
		
		float transfert;
		float tTemp[]= new float[3];// de 0 à 10, comporte donc 11 cellules 
		int i=0;
		String vRep=("oui");
		int max;
		Scanner sc = new Scanner(System.in);
		
		while (vRep.equalsIgnoreCase("oui")&& i<tTemp.length)// condition pour ne pas saisir en dehord de la taille du tableau
		{
			System.out.println("Entrez la température");
			tTemp[i]=sc.nextFloat();
			i+=1;
		    if(i==tTemp.length) {
		    	break;//permet de sortir de la boucle en cours
		    }
			System.out.println("Voulez-vous entrer une autre température? 'oui'/'non'");
			sc.nextLine();
			vRep=sc.nextLine();
			while (!vRep.equalsIgnoreCase("oui") && !vRep.equalsIgnoreCase("non"))
			{
				System.out.println("Erreur. Saisir 'oui'/'non'");
				vRep=sc.nextLine();
			}
			
		}	
		max=i-1;// on retire l'incrémentation de l'itération suivante afin d'obtenir l'indice de la derniere valeur.
		
		//if (vRep.equalsIgnoreCase("non")) inutile car vrep est = non en sortant de la boucle 
			//{
		
		//Affichage du contenu du tableau
		for (int j=0; j<max; j++) {
			for (i=0; i<max; i++)// il faut une variable max qui permet de comparer jusqu'à la derniere valeur saisie et non la taille du tableau
				{	if (tTemp[i]>tTemp[i+1])
					{	transfert=tTemp[i];
						tTemp[i]=tTemp[i+1];
						tTemp[i+1]=transfert;
					}
				}
			
		}
			//}
		System.out.println("Les valeurs du tableau triées sont :"); 
			for (i=0; i<=max; i++) //une boucle pour afficher le résultat
				System.out.print(tTemp[i]+"\t"); 
			{	
			}
		sc.close();
	}

}
