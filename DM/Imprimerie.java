package DM;

import java.text.DecimalFormat;
import java.util.Scanner;


public class Imprimerie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nbrCopies=0;
		double total=0;
		float prix1=0.10f,prix2=0.09f, prix3=0.08f;
		Scanner clavier = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Bonjour, Veuillez entrer le nombre de copies effectuées."); 
		nbrCopies = clavier.nextInt();
		
		if (nbrCopies<=10) {
			total=nbrCopies*0.10; 
			
			
		}else if (nbrCopies<=30)
		{
		total =(prix1*10)+(nbrCopies-10)*0.09;	
		
		}
		
		else {total=(prix1*10)+(prix2*20)+(nbrCopies-30)*prix3;	
		}
		
		System.out.println("Facture Imprimerie ALGO, Vous avez effectué "+nbrCopies+" copies cela fera "+(df.format(total))+"€");
		
		
		
		clavier.close();
	
		
		
		
		
		
		
		
		
		
		

	}

}
