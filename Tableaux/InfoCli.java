package Tableaux;

import java.util.Scanner;

public class InfoCli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exercice 1
				int tab[]= {4,6,7,8,9,4}, somme;
				somme=0;
						
				for(int i=0; i<6; i++) {
					somme=somme+tab[i];
		     	}
				
				System.out.println("La somme des valeurs du tableau est :" + somme);
				
			// exercice 2 http://koor.fr/Java/Tutorial/java_system_out_printf.wp#anchor-4
				
				
				String tClient[][]= new String[100][9];
				String vrep;
				Scanner sc = new Scanner(System.in);
				
								
				
				tClient[0][0]="NUMERO CLIENT";
				tClient[0][1]="NOM";
				tClient[0][2]="PRENOM";
				tClient[0][3]="DATE DE NAISSANCE";
				tClient[0][4]="ADRESSE";
				tClient[0][5]="CODE POSTAL";
				tClient[0][6]="VILLE";
				tClient[0][7]="MAIL";
				tClient[0][8]="TELEPHONE";
				int max=1;
				vrep="oui";
		        int i=1;
				while(vrep.equalsIgnoreCase("oui")) {
					for(int j=0; j<9; j++) {
							System.out.println("saisir le/la/l' "+tClient[0][j]+" du client");
							tClient[i][j]=sc.nextLine();
						
					}
					
					
					System.out.println("voulez vous continuer (oui/non)");
					vrep=sc.nextLine();
					while(!vrep.equalsIgnoreCase("oui") && !vrep.equalsIgnoreCase("non") ) {
						System.out.println("voulez vous continuer (oui/non)");
						vrep=sc.nextLine();
					}
					
					
					if(vrep.equalsIgnoreCase("oui")) {
						i++;
						max=i;
					}else {
						System.out.println("fin");
						break;
					}
					
					
				}
				
				
				
				
				
				for( i=0; i<max+1; i++) {
					for(int j=0; j<9; j++) {
						System.out.printf("%40s" ,tClient[i][j]+" || ");
					}
					System.out.println("\n");
				}
				
				
					
				
		

		
		
		
		
		
	}

}
