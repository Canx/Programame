package globos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Globos {
	public static void main(String args[]) {
		// Para cada caso de prueba
		Scanner scanner = new Scanner(System.in);
		
		int casos = scanner.nextInt();
		
		for(int i=0; i< casos; i++) {
			Globos.resolver(scanner);
		}
		scanner.close();
	}

	private static void resolver(Scanner scanner) {
		// Leemos el número de globos
		int globos = scanner.nextInt();
		int minimo = Integer.MAX_VALUE;
		int siguiente;
		
		List<Integer> listaGlobos = new ArrayList<Integer>();
		for(int i = 0; i < globos; i++) {
			  siguiente = scanner.nextInt();
			  listaGlobos.add(siguiente);
			  minimo = Math.min(minimo, siguiente);
		}
		
		int helio = 0;
		for(int globo : listaGlobos) {
			helio += (globo - minimo);
		}
		System.out.println(helio);
	}
}
