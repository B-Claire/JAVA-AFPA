package multiThread;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ForkJoinPool;

public class Test {

	public static void main(String[] args) {
		 Path chemin = Paths.get("C:\\Users\\59013-14-02");
		    String filtre = "*.mp3"; 
		    //Création de notre tâche principale qui se charge de découper son travail en sous-tâches
		  
		    FolderScanner fs = new FolderScanner(chemin, filtre);
		    
		   
		    
		    //Nous récupérons le nombre de processeurs disponibles
		    int processeurs = Runtime.getRuntime().availableProcessors();
		    //Nous créons notre pool de thread pour nos tâches de fond
		    ForkJoinPool pool = new ForkJoinPool(processeurs);
		    Long start = System.currentTimeMillis();
		    
		    //Nous lançons le traitement de notre tâche principale via le pool
		    pool.invoke(fs);
		    
		    Long end = System.currentTimeMillis();
		    System.out.println("Il y a " + fs.getResultat() + " fichier(s) portant l'extension " + filtre);
		    System.out.println("Temps de traitement : " + (end - start));    

//		    try {
//		      Long start = System.currentTimeMillis();
//		      Long resultat = fs.sequentialScan();
//		      Long end = System.currentTimeMillis();
//		      System.out.println("Il y a " + resultat + " fichier(s) portant l'extension " + filtre);
//		      System.out.println("Temps de traitement : " + (end - start));
//		    } catch (ScanException e) {
//		      e.printStackTrace();
//		    }
//			 
//			    CompteEnBanque cb = new CompteEnBanque();
//			    
//			    
//
//			    Thread t = new Thread(new RunImpl(cb, "Cysboy\n"));
//			    Thread t2 = new Thread(new RunImpl(cb, "Zéro\n"));
//			    t.start();
//			    t2.start();
			
//		TestThread t = new TestThread("A");
//	    TestThread t2 = new TestThread("  B", t);
//	    try {
//	      Thread.sleep(1000);
//	    } catch (InterruptedException e) {
//	      e.printStackTrace();
//	    }
//	    System.out.println("statut du thread " + t.getName() + " = " + t.getState());
//	    System.out.println("statut du thread " + t2.getName() + " = " +t2.getState());                
	  }

}
