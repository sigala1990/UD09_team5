package act5;

public class MainApp {

	public static void main(String[] args) {
	
		Estudiante estudiante = new Estudiante();
		
		Profesor profesor = new Profesor();
		System.out.println(profesor);
		
		System.out.println(profesor.getNombre() + " " + profesor.getEdad() + " " + profesor.getQueMateria());
		System.out.println(estudiante.getNombre() + " " + estudiante.getEdad() + " " + estudiante.getEdad());
		System.out.println(profesor.isEsAusente()); //boolean se visualiza a través de is(nombre método)
		
		//instancializamos la clase Aula pasándole por parámetros objetos de las clases-hijas
		//Aula aula = new Aula(estudiante, profesor);
		
		//System.out.println(aula);		
	}

}