package test;

public class Exam2 {
	private static boolean nestPasUnNombrePremier(int i) {

		if (i < 2) {
			return true;
		}

		boolean result = false;

		for (int j = 2; j < i; j++) {
			if (i % j == 0) {
				result = true;
			}
		}

		return result;
	}
	static String getCaracterePLusOccurent(String s) {
		
		int max = 0;
		
		int indexCarat = 0;
		
		for (int i = 0; i < s.length(); i++) {
			
			int j = 0;
			
			int IndexMax = 0;
			
			while (j < s.length() && s.charAt(i) != ' ') {
				
				if (s.charAt(i) == s.charAt(j)) {
					
					IndexMax++;
					
				}
				
				j++;
				
			}
			
			if (max < IndexMax) {
				
				max = IndexMax;
				
				indexCarat = i;
				
			}
			
		}
		
		return s.charAt(indexCarat) + "";
		
	}
	
	static String getStringCommun(String str1, String str2) {
		
		String result = "";
		
		for (int i = 0; i < str1.length(); i++) {
			
			int j = 0;
			
			while (j < str2.length()) {
				
				if (str1.charAt(i) == str2.charAt(j))
					
				{
					
					result = result + str1.charAt(i);
					
					break;
					
				}
				
				j++;
				
			}
			
		}
		
		return result;
		
	}
	
	public static void main(String args[]) {
		System.out.println(nestPasUnNombrePremier(17));
		
		
		String str = "aexamen facile";
		System.out.println("la lettre plus occurente:"+getCaracterePLusOccurent(str));
		//afficherOccurenceLettres("Java");
		
		String s = "magnifique";
		
		String s1 = "salut";
		
		System.out.println(getStringCommun(s, s1));
	}
//deuxieme methode
	/*public static void afficherOccurenceLettres(String mot) {
		if (mot == null || mot.length() == 0) {
			System.out.println("attention mot vide");
			return;
		}
		Map<Character, Integer> occuMap = new HashMap<>();
		mot = mot.toLowerCase();
		for (int i = 0; i < mot.length(); i++) {
			Character charAt = mot.charAt(i);
			// Conversion vers objet
			Character maCle = Character.valueOf(charAt);

			// recuperer l occurence de la cle
			Integer occuDeMaCle = occuMap.get(maCle);
			if (occuDeMaCle == null) {
				occuDeMaCle = 0;
			}
			occuDeMaCle++;
			// inserer la cle avec sa nouvelle occurence
			occuMap.put(maCle, occuDeMaCle);
		}
		// autre afçon de parcourir la map
		Iterator<Character> iterator = occuMap.keySet().iterator();

		while (iterator.hasNext()) {
			Character monCaractere = iterator.next();
			System.out.println(monCaractere + " est present " + occuMap.get(monCaractere));

		}
		Character monCaractereMax = null;
		Integer monOccurenceMax = 0;
		iterator = occuMap.keySet().iterator();
		while (iterator.hasNext()) {
			Character monCaractere = iterator.next();
			if (occuMap.get(monCaractere) > monOccurenceMax) {
				monCaractereMax = Character.valueOf(monCaractere);
				monOccurenceMax = occuMap.get(monCaractere);
				// monCaractereMax=monCaractere;
			}

		}
		System.out.println("La lettre la plus présente est : " + monCaractereMax);
	}*/

	
	
	

}
