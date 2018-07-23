package Tableaux;

import java.util.Random;
import java.util.Scanner;

public class methodesTri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * -rentrer 10 valeurs de 1 tableau (si possible en aleatoire random)
		 * -afficher le contenu du tableau
		 * -trier le tableau puis afficher le résultat
		 * (utiliser las 3 methodes de tri:
		 * 1 tri a bulle
		 * 2 tri par selection
		 * 3 tri par insertion) 
		 * 
		 * utiliser le switch
		 */
		
		
		int [] tab = new int[10] ;
		 //int tab [] ={45,95,105,30,23,56,456,789,11,4};
		
		int i=0,K=0, tampon, min, choix ;
		Random rand = new Random();
		Scanner clavier = new Scanner(System.in);
			
			//boucle d'insertion de valeurs 
			for (i=0;i<10;i++ ) {
				//System.out.println("bonjour veuillez saisir la valeur"+(i+1));
				//tab[i]=clavier.nextInt();
				
				 tab[i]=rand.nextInt(100);	//ou tab [i] = (int)(Math.random()*(100-1)+1)
			}
			
			for (int j=0;j<3;j++) {// permet d'afficher les valeurs du tableau
				
				System.out.println(tab[i]+" | ");

			}
			
			
			//boucle de choix de méthode de tri
			 for (int j=0;j<3;j++) {
			 System.out.println("Saisir\n 1 pour le tri à bulle \n 2 pour le tri par selection \n 3 pour le tri par insertion");
			 choix=clavier.nextInt();
			
			 // execute le programme selon le choix de l'utilisateur
			 switch (choix) {
			 case 1 :
				 System.out.println("******TRI A BULLE******");
				 for (i=0;i<10;i++) {	//boucle permettant de compter le nombre de passage
					 for (int n=0;n<9;n++) { //boucle permettant de comparer la valeur d'indice i à celle d'i+1 jusqu'a la fin du tableau
						 if (tab[n]>=tab[n+1]) {
							 tampon= tab[n]; // on conserve la premiere valeur
							 tab[n]=tab[n+1];  // on place la valeur de i+1 dans la cellule d'indice i
							 tab[n+1]=tampon;  // la valeur conserver est finalement placer dans la cellule i+1
						 }
					 }
				 }
				 
			 System.out.println("Les valeurs du tableau trié sont:");
			 for (i=0;i<10;i++ ) {// on utilise une boucle pour tri le tableau
			 System.out.print(tab[i]+" | ");
			 }
			
			 break;// le break permet de sortir du switch lorsque le cas est éxecuté
			
			
			 case 2:
				 System.out.println("******TRI PAR SELECTION******");
				 for (i=0;i<10;i++) {//boucle permettant de trier chaque cellule du tableau
					 min=i;//on conserve l'indice de comparaison de départ 
					
						 for (int J=i+1; J<tab.length; J++) {//boucle permettant de trouver la valeur min afin de conserver sont indice
			
							 if (tab[min]>tab[J]) {//si false min conserve sa valeur précédente
								 min =J;
							 }
			
						 }
						 
						 if(i!=min) { //si min = i, la valeur la plus basse est déja placer dans le tableau
							 tampon=tab[i];
							 tab[i]=tab[min];
							 tab[min]=tampon;
						 }
						 
				 }
				 
				 
			 
				 System.out.println("Les valeurs du tableau trié sont:");
		    
				 for (i=0;i<10;i++ ) {
					 System.out.print(tab[i]+" | ");
			
				 }
				 break;
			
			
			default:
				
			System.out.println("******TRI PAR insertion******");			
			for (i=1;i<tab.length;i++) {// nous commençons par la deuxième valeur du tableau 
						
					tampon=tab[i];
					j=i;
			
		
					while (j>0&&tab[j-1]>tampon)// nous comparons la valeur de tampon avec les valeurs précédentes du tableau jusqu'à ce que le nombre soit suppérieur 
					{
						tab[j]=tab[j-1]; // nous décalons les valeurs vers la droite
						j=j-1;
					}
					tab [j]= tampon; //aprés le décalage des valeur on attribut a tab[j] la valeur de tampon 
			
			}
					System.out.println("Les valeurs du tableau trié sont:");
					for (i=0;i<10;i++ ) {
						System.out.print(tab[i]+" | ");
			
					}
			
			 break;
			 
			 
			 }
				
			}
			
			
			
			
		

		
	clavier.close();	
		
		
		
	
	}

}
