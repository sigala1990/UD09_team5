package act4;

/*
 * @author Veronika Polonchak
 */

public class Raices {
	// atributos
	double a;
	double b;
	double c;

	// constructor con todos los atributos
	public Raices(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	// calcular discriminante
	public double getDiscriminante() {
		double discriminante = Math.pow(b, 2) - (4 * a * c);
		return discriminante;
	}

	// calcular si el discriminante tiene dos soluciones
	public boolean tieneRaices() {
		if (getDiscriminante() > 0) {
			System.out.println("El discriminante tiene dos soluciones");
			return true;
		} else {
			return false;
		}
	}

	// calcular si discriminante tiene una solución
	public boolean tieneRaiz() {
		if (getDiscriminante() == 0) {
			return true;
		} else {
			return false;
		}
	}

	// calcular raíces
	public void obtenerRaices() {
		double raiz1 = (b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
		double raiz2 = (b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
		if (getDiscriminante() > 0) {
			System.out.println(raiz1);
			System.out.println(raiz2);
		}
	}

	// mostrar el caso de una única raiz
	public void obtenerRaiz() {
		obtenerRaices();//conflict
		c = a;//conflict
		/*if (getDiscriminante() == 0) {
			System.out.println("Es una única raiz");
		}*/
	}

	// evaluar cada caso (1 solución, 2 soluciones, 0 soluciones)
	public void calcular() {
		if (getDiscriminante() > 0) {
			obtenerRaices();
		} else if (getDiscriminante() == 0) {
			obtenerRaiz();
		} else {
			System.out.println("La raiz no tiene soluciones");
		}
	}

}
