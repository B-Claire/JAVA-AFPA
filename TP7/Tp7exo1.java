package TP7;

import java.util.Scanner;

public class Tp7exo1 {

	private static Scanner clavier;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char reponse ='o';
		int r=0;
		int i=1;
		int somme=0;
		clavier = new Scanner(System.in);
		
		while (i<6){
		r = (int) (Math.random()*100);
		
		somme=somme+r;//somme+=r
			System.out.println("Le "+i+"e nombre aleatoire est " + r);
			i++;
			
		}
		
		System.out.println("la somme des nombres aléatoires est "+somme);
		
clavier.close();	

	}

}
