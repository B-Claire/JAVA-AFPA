package DM;
import java.util.Scanner;

public class dmpresta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean Vcouple;
		Vcouple=false;
		int Venfants=1;
		int Vsomme= 450;

		System.out.println("Bonjour, nous allons calculer le montant de vos aides. Etes vous en couple ? (true pour oui, false pour non)");
		Scanner saisie = new Scanner (System.in);
		if (saisie.nextLine()=="oui")
		{Vcouple = true;}


		if (Vcouple=true) {

			Vsomme=(Vsomme+(200+150));}

		else {
			Vsomme=(Vsomme+(100+50));
		}
		System.out.println("Combien avez vous d’enfants?");
		Scanner enf =new Scanner (System.in);
		Venfants=enf.nextInt();

		if (Venfants != 0); 

		{

			switch (Venfants) {

			case 1:

				if (Vcouple= false) {
					Vsomme=(Vsomme+120);}

				else {Vsomme=(Vsomme+100);}
				break;	

			case 2:

				if (Vcouple= false) {
					Vsomme=(Vsomme+150);}
				else {Vsomme=(Vsomme+120);}
				break;

			case 3:

				if (Vcouple= false) {
					Vsomme=(Vsomme+180);}
				else {Vsomme=(Vsomme+140);}
				break;

			case 4:

				if (Vcouple= false) {
					Vsomme=(Vsomme+210);}
				else {Vsomme=(Vsomme+160);}
				break;

			default : 

				if (Vcouple= false) {
					Vsomme=(Vsomme+210+50*(Venfants-4));}
				else {Vsomme=(Vsomme+160+40*(Venfants-4));}
				break;

			}
		}

		System.out.println("La somme totale de vos aides est de " +Vsomme);

		saisie.close();
		enf.close();

	}

}
