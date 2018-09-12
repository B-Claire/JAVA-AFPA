package cdi.claire;

import org.jsoup.Jsoup;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 
    	  String htmlText = "<h1>Hello World!</h1>";
          System.out.println( Jsoup.parse(htmlText).text() );
    }
}
