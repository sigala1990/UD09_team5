package act5;

public class Aula {
	
	public enum TipoClase{
		matematicas,
		filosofia,
		fisica
	}
	
	private int id;
	private int cantidadAlumnos;
	private boolean profesorDisponible; // ?
	private TipoClase tipoClase;
	private Profesor profesor;
	private Estudiante estudiante;
	private Estudiante estudiante2;
	private Estudiante estudiante3;
	private boolean seRealizaClase;
	
	
	public Aula(int id, int cantidadAlumnos, boolean profesorDisponible, TipoClase tipoClase, Profesor profesor, Estudiante estudiante,Estudiante estudiante2,Estudiante estudiante3) {
		super();
		this.id = id;
		this.cantidadAlumnos = cantidadAlumnos;
		this.profesorDisponible = profesorDisponible;
		this.tipoClase = tipoClase;
		this.profesor = profesor;
		this.estudiante = estudiante;
		this.estudiante2 = estudiante2;
		this.estudiante3 = estudiante3;
		this.seRealizaClase = hacemosClase();
	}
	
	/*CONDICIONES
	 *  Necesita que el profe este disponible
	 *  Que la materia del profe sea la misma que la aula
	 *  Que haya mas del 50% de alumnos
	 *  Si se puede dar clase 
	 *  	mostrar alumnos 
	 *  	mostrar alumnas
	 *  	mostrar alumnos aprobados
	 *  	mostrar alumnas aprobadas
	 */
	public boolean hacemosClase()  {
		if(!profesorCoincidaMateria(tipoClase, profesor) || !profesorDisponible(profesor) || !asistenciaMitadClase(estudiante1, estudiante2, estudiante3)) {
			return false;
		}
		return true;
	}
	
	public boolean profesorCoincidaMateria(TipoClase tipoClase, Profesor profesor) {
		if(tipoClase.equals(profesor)) { //tipo de profe
			return true; //coinciden en la asignatura
		}
		return false;
	}
	
	public boolean profesorDisponible(Profesor profesor) {
		if(profesor) {//profe disponible
			return true;
		}
		return false;
	}
	public boolean asistenciaMitadClase(Estudiante estudiante1,Estudiante estudiante2,Estudiante estudiante3, int cantidadAlumnos ) {
		int size = 3;
		int controlAsistencia = 0;
		if(estudiante1) {//asiste a clase ?
			 controlAsistencia++;
		}
		if(estudiante1) {//asiste a clase ?
			 controlAsistencia++;
		}
		if(estudiante1) {//asiste a clase ?
			 controlAsistencia++;
		}
		
		if((cantidadAlumnos/100 *50 >controlAsistencia)) {
			return true;
		}
		return false;
		
	}
}