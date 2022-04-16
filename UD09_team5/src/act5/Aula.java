package act5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Aula {

	/*
	 * public enum TipoClase{ matematicas, filosofia, fisica }
	 */
	private final String MATERIAS[] = { "matemáticas", "filosofia", "física" };
	////////
	private int id;
	private int cantidadAlumnos;
	private String tipoClase;
	private Profesor profesor;
	private List<Estudiante> estudiantes;
	//private boolean seRealizaClase;

	public Aula(int id, int cantidadAlumnos, String materiaClase) {
		super();
		this.id = id;
		this.cantidadAlumnos = cantidadAlumnos;
		this.tipoClase = materiaClase;
		this.profesor = crearProfesor();
		this.estudiantes = crearArrayEstudiantes();
		//this.seRealizaClase = hacemosClase();
		mensajeFinal();
	}


	/*
	 * CONDICIONES Necesita que el profe este disponible Que la materia del profe
	 * sea la misma que la aula Que haya mas del 50% de alumnos Si se puede dar
	 * clase mostrar alumnos mostrar alumnas mostrar alumnos aprobados mostrar
	 * alumnas aprobadas
	 */
	public List<Estudiante> crearArrayEstudiantes(){
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		for (int i = 0; i < cantidadAlumnos;i++) {
			Estudiante estudiante = new Estudiante();
			estudiantes.add(estudiante);
		}
		return estudiantes;
	}

	public Profesor crearProfesor() {
		Profesor profesor = new Profesor();
		return profesor;
	}

	public boolean hacemosClase() {
		boolean hacemosClase = true;
		String text = "No se puede hacer clase por: \n\n";
		if (!profesorCoincidaMateria()) {
			text += "El profesor de "+ profesor.getQueMateria() +" no coincide con la materia "+tipoClase+"\n";
			hacemosClase = false;
		}
		if (profesor.isEsAusente()) {
			text += "El profesor no esta disponible\n";
			hacemosClase = false;
		}
		if (asistenciaMitadClase()) {
			String alumnosfaltantes = "";
			for (int i = 0; i < estudiantes.size(); i++) {
				if(estudiantes.get(i).isEsAusente()) {
					alumnosfaltantes +=  estudiantes.get(i).getNombre()+", ";
				}
			}
			text += "De "+cantidadAlumnos+ " alumnos, la mitad de alumnos no estan, son: "+alumnosfaltantes;
			hacemosClase = false;
		}
		if (!hacemosClase) {
			System.out.println(text); // mensaje de que no se hace clase
		}
		return hacemosClase;
	}

	public void mensajeFinal() {
		if (hacemosClase()) {
			System.out.println("Grupo notas chicos\n");
			for (int i = 0; i < estudiantes.size(); i++) {
				if (estudiantes.get(i).isEsAusente() && estudiantes.get(i).getSexo().equals("hombre")) {
					System.out.println(estudiantes.get(i).nombre + " saco una nota de " + estudiantes.get(i).getCalificacion());
				}
			}
			System.out.println("\nGrupo notas chicas\n");
			for (int i = 0; i < estudiantes.size(); i++) {
				if (estudiantes.get(i).isEsAusente() && estudiantes.get(i).getSexo().equals("mujer")) {
					System.out.println(estudiantes.get(i).nombre + " saco una nota de " + estudiantes.get(i).getCalificacion());
				}
			}
		}
	}

	public boolean profesorCoincidaMateria() {
		if (tipoClase.equals(profesor.getQueMateria())) {
			return true; // coinciden en la asignatura
		}
		return false;
	}

	public boolean profesorDisponible(Profesor profesor) {
		if (profesor.isEsAusente()) {// ausente = true --> es que no vino
			return true;
		}
		return false;// si que vino
	}

	public boolean asistenciaMitadClase() {
		int controlAsistencia = 0;
		int mitadAlumnos = cantidadAlumnos;
		for (int i = 0; i < this.estudiantes.size(); i++) {
			if (this.estudiantes.get(i).isEsAusente()) {// asiste a clase ?
				controlAsistencia++;
			}
		}
		if ((mitadAlumnos / 2) <= controlAsistencia) {
			return true;
		}
		return false;

	}
	public void mostrarAsistenciaAlumnos() {
		for (int i = 0; i < estudiantes.size(); i++) {
			System.out.println(estudiantes.get(i).isEsAusente()); 
		}
	}

	@Override
	public String toString() {
		return "Aula [MATERIAS=" + Arrays.toString(MATERIAS) + ", id=" + id + ", cantidadAlumnos=" + cantidadAlumnos
				+ ", tipoClase=" + tipoClase + ", profesor=" + profesor + ", estudiantes=" + estudiantes+"]";
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCantidadAlumnos() {
		return cantidadAlumnos;
	}

	public void setCantidadAlumnos(int cantidadAlumnos) {
		this.cantidadAlumnos = cantidadAlumnos;
	}

	public String getTipoClase() {
		return tipoClase;
	}

	public void setTipoClase(String tipoClase) {
		this.tipoClase = tipoClase;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}



	public String[] getMATERIAS() {
		return MATERIAS;
	}
}