package TP7;


import java.util.Scanner;


public class Tp7Exo5MotsDesordre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//programme permettant d'afficher les lettres d'un mot dans le desordre
		
		//exercice 5 tp7
		String mot = new String();
		String tMot[]= {"ACCESSOIRE","ACCUEIL","ACCUMULATEUR","ACQUISITION","BALANCES",
					"BALAYAGE","BALISAGE","BOITIERS","BOMBARDEMENTS","BOMBES",
					"BONBONS","CALCULATEURS","CARACTERISTIQUE","CHARGEMENT","CINEMATIQUE",
					"COMMERCIAL","COMMERCIAUX","COMMUNAUTE","DEFAILLANCE","DEFILEMENTS",
					"DEFRAGMENTE","DEGROUPAGE","ECHANTILLONNE","ECONOMISEUR","FENETRAGES",
					"FILIGRANES","FONCTIONNEL","FORMATAGE","GAZELLE","GASTRONOMIE"};
		
		mot = tMot[(int)(Math.random() * ((30 -1)+1))];
		int longueur = mot.length();

		String motrestant = mot;//conserve le mot choisi aléatoirement
		while (longueur > 0)//boucle permettant d'afficher les lettres au fur et à mesure
		{
		int numlettre = (int)(Math.random() * ((longueur -1) + 1));//ou longueur-- equivalent à longueur=longueur-1

		char caract = motrestant.charAt(numlettre);

		System.out.print(caract);
		 motrestant=motrestant.replaceFirst(String.valueOf(caract),"");// motrestant=motrestant.replaceFirst(""+caract,"");			
		longueur = motrestant.length();
		}


		boolean resultat=false;
		
		int tentative = 25;
		Scanner sc = new Scanner(System.in);

		while (tentative !=0 && resultat == false)
		{
			System.out.println("\n entrez une proposition : ");
			
		      String motsaisie=sc.nextLine();
		      motsaisie=motsaisie.toUpperCase(); //on ramene toutes les lettres en majuscule.
		      System.out.println("vous avez saisi " + motsaisie);
		      
		    if (mot.equals(motsaisie)) //L'opérateur == teste l'égalité entre deux varible de même type, pour des instance de la classe string, on utilise equals.
		    {	    	
		 	
			     System.out.println("Vous avez trouvé le bon mot. Réessayez");
			     resultat = true;	
			     
		    } else {

		    	System.out.println("Vous n'avez pas trouvé le mot ");
			    tentative-- ;   
		    	
		    }
		  
		}
		
		System.out.println("le mot exacte est : " + mot);

		
		
		
		
		
		
		
		
	}

}
