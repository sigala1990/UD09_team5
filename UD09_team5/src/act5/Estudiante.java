package act5;

public class Estudiante extends Persona {
	
	 private double calificacion;

	
	public Estudiante() {
		super();
		this.calificacion = 0;
	}
	
	
	public Estudiante(double calificacion, String nombre, int edad, String sexo) {
		super(nombre, edad, sexo);
		this.calificacion = calificacion;
	}


	public double getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	
	
}