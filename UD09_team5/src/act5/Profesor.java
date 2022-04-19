package act5;

/*
 * @author Veronika Polonchak
 */

import java.util.Random;

public class Profesor extends Persona {

	// atribútos propios
	private String queMateria;
	private final String MATERIAS[] = { "matemáticas", "filosofia", "física" };

	// constructor por defecto
	public Profesor() {
		super();
		this.edad = edadAleatorio();
		this.queMateria = obtenerMateria();
		this.esAusente =  ausenciaAleatorio();
		
	}

	// getters y setters
	public String getQueMateria() {
		return queMateria;
	}

	public void setQueMateria(String queMateria) {
		this.queMateria = queMateria;
	}


	// comprobamos la disponibilidad del profesor
	public boolean ausenciaAleatorio() {

		// el profesor tiene 20% de no encontrarse disponible
		int aleatorio = (int) (Math.random() * 10 + 1);
		if (aleatorio <= 2) {
			return true;
		}
		return false;
	}

	// asignamos la edad del profesor
	public int edadAleatorio() {
		Random rnd = new Random();
		// la edad del profesor ha de ser entre 25 y 65 años
		int edadAleatoria = rnd.nextInt(40) + 25;
		return edadAleatoria;
	}

	// generamos una materia aleatoria que importe el profesor
	public String obtenerMateria() {
		int materiaAleatoria = (int) (Math.random() * 3);
		return MATERIAS[materiaAleatoria];

	}

	@Override
	public String toString() {
		return "Profesor [queMateria=" + queMateria + "]";
	}

}