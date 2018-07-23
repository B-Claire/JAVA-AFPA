package TP7;

import java.util.Scanner;

public class Tp7exo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// table de multiplication
		char reponse = 'O';
		int nbr;
		int i = 1; // compteur
		Scanner sc = new Scanner(System.in);
		
		System.out.println("entrer un nombre entre 1 et 10");
		nbr = sc.nextInt();
				
		while(nbr<1 || nbr>10) {
			System.out.println("resaisir un nombre entre 1et 10");
			nbr = sc.nextInt();
		}
		System.out.println("la table de multiplication de:"+nbr);
		for (i=1; i<=10; i++) {
			System.out.println(nbr+"*"+i+"="+nbr*i);
		}
			
		i=1;
		while(i<=10) {
				System.out.println(nbr+"*"+i+"="+nbr*i);
				i++;//i+=1    i=i+1     /!\ i++ ne peut pas être utilisé pour incrémenter plus que 1
		}
			
			
			
					
		sc.close();
		
		
	}
}
