package TPCaisseETSecu;

import java.util.Scanner;

public class Caisse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int prix=1, paiement=0,montant=0,Reste, Nb10E, Nb5E;
	char rep='t';
	do {
		System.out.println("saisir un prix");
		Scanner saisie = new Scanner(System.in);
		prix= saisie.nextInt();
		
		montant=montant+prix; 
		
		System.out.println("Voulez vous entrer un autre prix ? c pour continuer et t pour terminer");
		Scanner clavier=new Scanner (System.in);
		rep= clavier.nextLine().charAt(0);
		
	}
		
	
	 while (rep!='t');
	{
		 System.out.println("saisir un prix");
			Scanner sc = new Scanner(System.in);
			prix= sc.nextInt();
			
	 }
	
	System.out.println("le montant total est"+montant); 

	System.out.println("Saisir le paiement");
	Scanner sp = new Scanner(System.in);
	paiement= sp.nextInt();
	
	Reste = paiement-montant;

	Nb10E = 0;
	
	while (Reste >= 10 ) {
	 Nb10E = Nb10E + 1;
	 Reste = Reste-10;
	}
	 Nb5E = 0;
	 if (Reste >= 5) {
		 Nb5E= 1;
		  Reste = Reste-5;
	 }
	

	System.out.println("Rendu de la monnaie"); 
	System.out.println("10 E"+ Nb10E);
	System.out.println("Billets de 5 E"+Nb5E); 
	System.out.println("Pièces de 1 E"+Reste);

	
	sp.close();
		
		
	
		
	
		
		
		
		
		
		
		
		
	}

}
