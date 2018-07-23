package Tableaux;

import java.util.Scanner;

public class TabNumSecu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String nom, prenom ;
//		int dateNaiss, numCommune, sexe, ordreNaiss,annee ,codeDep, cle,DebSecu;
		String dateN;
		int tSecu[]= new int[7]; 
	
		int i=1; 
		
		Scanner sc = new Scanner(System.in);

		
		for (i=0; i<6; i++) {
			switch (i) {
			case  0:
			System.out.println("entrer le genre");
			tSecu[i]=sc.nextInt();
			case  1:
				System.out.println("entrer la date de naissance");
				dateN=sc.nextLine();
				tSecu[i]=Integer.parseInt(dateN.substring(6,8));
			case  2:
				tSecu[i]=Integer.parseInt(dateN.substring(4,6));
				System.out.println("le mois saisie est :"+tSecu[i]);
			case  3:
				System.out.println("entrer le code département");
				tSecu[i]=sc.nextInt();
			case  4:
				System.out.println("entrer le code commune");
				tSecu[i]=sc.nextInt();
			case  5:
				System.out.println("entrer l'ordre de naissance");
				tSecu[i]=sc.nextInt();
			default ://formule permettant d'obtenir la cle du num secu
				DebSecu=Sexe+annee+mois+CodeDep+NumCommune+OrdreNaiss;
				tSecu[i]=cle=String.format("%02d",(97-(Long.valueOf(DebSecu)%97)));
				
					
			}
		}
		
// faire un autre for et 
		
		/*faire l'affichage // System.out.println(String.format("%-2s",sexe)+String.format("%-3s",annee)+String.format("%-3s",mois)+
	    String.format("%-3s",String.format("%02d", Integer.parseInt(codeDep)))+String.format("%-4s",String.format("%03d", Integer.parseInt(numCommune)))+
	    String.format("%03d", Integer.parseInt(ordreNaiss))+String.format("%02d",Integer.parseInt(cle)));*/
		    
	     
		 
		

		  
		sc.close();
		 

		
		
		
		
	}

}
