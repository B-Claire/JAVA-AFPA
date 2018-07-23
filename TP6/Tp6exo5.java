package TP6;

import java.util.Scanner;

public class Tp6exo5 {
	//Calculette
	public static void main(String[] args) {
		int nbre1;
		int nbre2;
		char opérateur;
		
		Scanner clavier= new Scanner(System.in);

		System.out.println("Entrez un nombre");
		nbre1=clavier.nextInt();
		
		System.out.println("Entrez un opérateur");
		opérateur= clavier.next().charAt(0);
		
		System.out.println("Entrez un 2e nombre");
		nbre2=clavier.nextInt();

		switch (opérateur) {
		case '+':
				System.out.println(nbre1+nbre2);
		break;	
		
			case '-':
				System.out.println(nbre1-nbre2);
			break;
		
				case '*':
					System.out.println(nbre1*nbre2);
				break;
		
					case '/':
						System.out.println(nbre1/nbre2);
					break;

	default:
		break;
	}
	

	clavier.close();	
		
	}

}
