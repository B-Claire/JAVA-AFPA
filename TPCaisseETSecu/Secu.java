package TPCaisseETSecu;

import java.util.Scanner;

public class Secu {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		String nom, prenom, dateN, numCommune, sexe, ordreNaiss, codeDep, mois, annee, debSecu, cle;
		Scanner clavier = new Scanner(System.in);

		System.out.println("veuillez saisir le nom");
		nom = clavier.nextLine();

		System.out.println("veuillez saisir le prénom");
		prenom = clavier.nextLine();

		System.out.println("veuillez saisir la date de naissance");
		dateN = clavier.nextLine();

		System.out.println("veuillez saisir le sexe (1 pour les hommes,2 pour les femmes et 3 pour les transgenres en transition)");
		sexe = clavier.nextLine();

		System.out.println("veuillez saisir le département de naissance");
		codeDep = clavier.nextLine();

		System.out.println("veuillez saisir le N° de commune");
		numCommune = clavier.nextLine();

		System.out.println("veuillez saisir votre odre de naissance");
		ordreNaiss = clavier.nextLine();

		mois = dateN.substring(2, 4); // cree une sous chaine de carctère
		annee = dateN.substring(6, 8);
		DebSecu = sexe + annee + mois + codeDep + numCommune + ordreNaiss;
		cle = String.format("%02d", (97 - (Long.valueOf(DebSecu) % 97)));
		
		System.out.println(String.format("%-2s",sexe)+String.format("%-3s",annee)+String.format("%-3s",mois)+
			    String.format("%-3s",String.format("%02d", Integer.parseInt(codeDep)))+String.format("%-4s",String.format("%03d", Integer.parseInt(numCommune)))+
			    String.format("%03d", Integer.parseInt(ordreNaiss))+String.format("%02d",Integer.parseInt(cle)));

		
		//System.out.printf(sexe + annee + mois + codeDep + numCommune + ordreN + cle);

		
		
		//Version INT
		
		/*
		 * String nom, prenom; int dateN,numCommune,sexe,ordreN,codeDep,mois,annee,
		 * DebSecu, cle ; Scanner clavier = new Scanner(System.in);
		 * 
		 * 
		 * 
		 * System.out.println("veuillez saisir le nom"); nom = clavier.nextLine();
		 * 
		 * System.out.println("veuillez saisir le prénom"); prenom = clavier.nextLine();
		 * 
		 * System.out.println("veuillez saisir la date de naissance"); dateN =
		 * clavier.nextInt();
		 * 
		 * System.out.println(
		 * "veuillez saisir le sexe (1 pour les hommes,2 pour les femmes et 3 pour les transgenres en transition)"
		 * ); sexe = clavier.nextInt();
		 * 
		 * System.out.println("veuillez saisir le département de naissance"); codeDep =
		 * clavier.nextInt();
		 * 
		 * System.out.println("veuillez saisir le N° de commune"); numCommune =
		 * clavier.nextInt();
		 * 
		 * System.out.println("veuillez saisir votre odre de naissance"); ordreN =
		 * clavier.nextInt();
		 * 
		 * mois=dateN.substring(2,4); annee=dateN.substring(6,8);
		 * DebSecu=sexe+annee+mois+codeDep+numCommune+ordreN; cle=
		 * int.format("%02d",(97-(Long.valueOf(DebSecu)%97)));
		 * System.out.printf(sexe+annee+mois+codeDep+numCommune+ordreN+cle);
		 */

		

}
