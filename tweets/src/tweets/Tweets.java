package tweets;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Tweets {
	
	public static Map<String,Integer> tweetbaseMap = new HashMap<String, Integer>();;
	
	public static void procesar(String tweet, int umbral) {		
		int puntuacion = 0;
		for( String palabra : tweet.split(" ")) {
			Integer subtotal = tweetbaseMap.get(palabra);
			subtotal = (subtotal == null)? 0: subtotal;
			puntuacion += subtotal;
		}
		
		//System.out.println("Puntuacion: " + puntuacion);
		System.out.println(puntuacion >= umbral? "SI": "NO");
	}
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Leemos el tweet base 
		String tweetbase = scanner.nextLine().toUpperCase();
		tweetbase = tweetbase.substring(0, Math.min(tweetbase.length(), 2000));
		
		// Añadimos las palabras a un hash		
		for( String palabra : tweetbase.split(" ")) {
			Integer contador = tweetbaseMap.get(palabra);
			contador = (contador == null)? 0: contador;
			tweetbaseMap.put(palabra, contador + 1);
		}
				
		for (Map.Entry<String, Integer> entry : tweetbaseMap.entrySet()) {
			String key = entry.getKey();
			Object value = entry.getValue();
			//System.out.println(key + ":" + value);
		}
		
		// Leemos el umbral
		int umbral = Integer.parseInt(scanner.nextLine());
		
		// Número de tweets a analizar
		int numTweets = Integer.parseInt(scanner.nextLine());
		
		// Leemos los tweets y los procesamos
		for(int i = 0; i< numTweets; i++) {
			String tweet = scanner.nextLine().toUpperCase();
			tweet = tweet.substring(0, Math.min(tweet.length(), 2000));
			
			//System.out.println("Procesando " + tweet);
			Tweets.procesar(tweet, umbral);
		}
	}

}
