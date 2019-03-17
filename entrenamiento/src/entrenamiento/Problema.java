package entrenamiento;

public class Problema implements Comparable<Problema> {
	int id;
	int tiempo;
	int aprendizaje;
	
	public Problema(int id, int tiempo, int aprendizaje) {
		this.id = id;
		this.tiempo = tiempo;
		this.aprendizaje = aprendizaje;
	}

	@Override
	public int compareTo(Problema p) {
		int tiempo = this.tiempo - p.tiempo;
		if (tiempo != 0) {
			return tiempo;
		}
		int aprendizaje = this.aprendizaje - p.aprendizaje;
		if (aprendizaje != 0) {
			return aprendizaje;
		}
		int id = this.id - p.id;
		if (id != 0) {
			return id;
		}
		return 0;
	}

	@Override
	public String toString() {
		return Integer.toString(id) + "\n";
	}	
}