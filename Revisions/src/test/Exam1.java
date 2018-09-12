package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exam1 {

	public static void main(String[] args) {
		Exam1 exam1 = new Exam1();
		boolean retourMethode1 = exam1.estUnNombrePremier(17);
		System.out.println(retourMethode1);
		
		Exam1.afficherOccurenceLettres("java");
		
		String motTestPalindrome = "mon nom";
		System.out.println(motTestPalindrome+ " est un palindrome "
				+exam1.estUnPalindrome(motTestPalindrome));

		System.out.println(motTestPalindrome+ " est un palindrome "
				+exam1.estUnPalindromeAvecStringBuilder(motTestPalindrome));
	}
	
	public boolean estUnNombrePremier(int p) {
		if(p==0 || p==1) {
			return false;
		}
		boolean result = true;
		for(int i = 2; i<p && result; i++) {
			result = !(p%i == 0);
		}
		return result;
	}
	
	public static void afficherOccurenceLettres(String mot) {
		if(mot == null || mot.length() == 0) {
			System.out.println("attention mot vide");
			return;
		}
		Map<Character,Integer> occuMap = new HashMap<>();
		mot = mot.toLowerCase();
		for(int i=0; i<mot.length(); i++) {
			Character charAt = mot.charAt(i);
			// Conversion vers objet
			Character maCle = Character.valueOf(charAt);
			
			// recuperer l occurence de la cle
			Integer occuDeMaCle = occuMap.get(maCle);
			if(occuDeMaCle == null) {
				occuDeMaCle = 0;
			}
			occuDeMaCle++;
			// inserer la cle avec sa nouvelle occurence
			occuMap.put(maCle, occuDeMaCle);
		}
		Iterator<Character> iterator = occuMap.keySet().iterator();
		while(iterator.hasNext()) {
			Character monCaractere = iterator.next();
			System.out.println(monCaractere+" est present "+occuMap.get(monCaractere));
		}
	}

	public boolean estUnPalindrome(String mot) {
		mot = mot.replaceAll(" ", "");
		if(mot == null || mot.length() == 0) {
			return false;
		}
		String motInverse = "";
		for(int i = mot.length()-1; i >= 0 ; i--) {
			// equivalent de motInverse = motInverse + mot.charAt(i);
			motInverse += mot.charAt(i);
		}
		return motInverse.equals(mot);
	}
	
	public boolean estUnPalindromeAvecStringBuilder(String mot) {
		mot = mot.replaceAll(" ", "");
		if(mot == null || mot.length() == 0) {
			return false;
		}
		StringBuilder motInverse = new StringBuilder();
		for(int i = mot.length()-1; i >= 0 ; i--) {
			// equivalent de motInverse = motInverse + mot.charAt(i);
			motInverse.append(mot.charAt(i));
		}
		return motInverse.toString().equals(mot);
	}
	
}
