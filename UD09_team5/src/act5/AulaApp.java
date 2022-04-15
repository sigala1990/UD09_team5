package act5;

public class AulaApp {

	public static void main(String[] args) {
	
		Estudiante estudiante = new Estudiante();
		
		Profesor profesor = new Profesor();
		
		//instancializamos la clase Aula pasándole por parámetros objetos de las clases-hijas
		Aula aula = new Aula(estudiante, profesor);
		
		System.out.println(aula);		
	}

}