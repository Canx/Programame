package entrenamiento;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/* BUG: falla con el caso:
1
7
1 10 11
2 9 11
3 22 55
4 22 33
5 1 1
6 2 2
7 2 2
*/
public class Entrenamiento {
	
	public static void main(String args[]) {
		// Para cada caso de prueba
		Scanner scanner = new Scanner(System.in);
		
		int casos = scanner.nextInt();
		
		for(int i=0; i< casos; i++) {
			Entrenamiento.resolver(scanner);
		}
		scanner.close();
	}

	private static void resolver(Scanner scanner) {
		int problemas = scanner.nextInt();
		Problema p;
		
		List<Problema> pares = new ArrayList<Problema>();
		List<Problema> impares = new ArrayList<Problema>();
		
		for(int i = 0; i< problemas; i++) {
			p = new Problema(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
			if ((p.tiempo % 2) == 0) {
				pares.add(p);
			}
			else {
				impares.add(p);
			}
		}

		Collections.sort(pares);
		Collections.sort(impares);
		List<Problema> orden = new ArrayList<Problema>(pares);
		orden.addAll(impares);
		
		System.out.println(orden);
	}
}
