package act5;

import java.util.Random;

public class Profesor extends Persona {
	
	//ATRIBUTOS PROPIOS
	private String queMateria;
	private final String MATERIAS[] = {"matemáticas", "filosofia", "física"};
	
	
	//CONSTRUCTORES
	public Profesor() {
		super();
	}

	public Profesor(String queMateria) {
		super();
		this.queMateria = queMateria;
	}
	
	public Profesor(String nombre, int edad, char sexo, String queMateria) {
		super(nombre, edad, sexo);
		this.queMateria = queMateria;
	}

	
	//GETTERS Y SETTERS
	public String getQueMateria() {
		return queMateria;
	}

	public void setQueMateria(String queMateria) {
		this.queMateria = queMateria;
	}
	
	
	//MÉTODOS PROPIOS
	//comprobamos si el profe es ausente
	public boolean esAusente() {
		boolean ausente = false;
		//20% de probabilidad de estar ausente
		int aleatorio = (int) (Math.random() * 10 + 1);
		if(aleatorio <= 2) {
			ausente = true;
		}
		return ausente;
	}
	
	
	//asignamos la edad del profesor entre márgenes razonables
	public int declaraEdad() {
		Random rnd = new Random();
		//la edad de profesor puede ser entre 25 y 65 años.
		int edadAleatoria = rnd.nextInt(40)+25;	
		return edadAleatoria;
	}
		
	
	//asignamos una materia random que imparte el profe
	public void obtenerMateria() {
		int materiaAleatoria = (int) (Math.random() * 3);
		this.queMateria = MATERIAS[materiaAleatoria];
		
	}	
	
	
}