package act5;

public class MainApp {

	public static void main(String[] args) {
	
		/*Estudiante estudiante = new Estudiante();
		
		Profesor profesor = new Profesor();
		System.out.println(profesor);
		
		System.out.println(profesor.getNombre() + " " + profesor.getEdad() + " " + profesor.getQueMateria());
		System.out.println(estudiante.getNombre() + " " + estudiante.getEdad() + " " + estudiante.getEdad());
		System.out.println(profesor.isEsAusente()); //boolean se visualiza a trav�s de is(nombre m�todo)
		*/
		//instancializamos la clase Aula pas�ndole por par�metros objetos de las clases-hijas
		Aula aula = new Aula(101,10, "f�sica");
		
	
		//aula.mostrarAsistenciaAlumnos();
		System.out.println();
		
		
		
		
		
		//////////////CORRECIONES////////////////
		//getCalificacion retorna siempre 0
		/*
		 * 	public Estudiante() {
			super();
			this.calificacion = 0;
			}
			
			
			
			
		// el metodo numeroNota() devuelve String cuando debe devolver Double	
		
		//metodo que da una nota entre 0 a 10
		public String numeroNota () { 
			double notar= Math.random()*(9)+1;
			return String.format("%.2f", notar);
	}
			
		 */
	}

}