package act5;

public class Estudiante extends Persona {
	
	public enum Genero{hombre, mujer};
	 private double calificacion;

	
	public Estudiante() {
		super();
		this.calificacion = 0;
	}
	
	
	public Estudiante(String nombre, int edad,double calificacion) {
		super(nombre, edad/*, sexo */);
		this.calificacion = calificacion;
		this.nombre=nombre;
	}




	public double getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
	
	
	@Override
	public String toString() {
		return "Estudiante [calificacion=" + calificacion + "]";
	}


	
	
	//metode ens dona un nombre aleatori de nota --> int (0-9)
	public String numeroNota () {
		
		double notar= Math.random()*(9)+1;
		return String.format("%.2f", notar);

	}
	//Metodo que da una edad aleatoria entre un intervalo
	public int edadAleatorio () {

		int edad1= (int) (Math.random() * (25 - 16) + 1);
		
		return edad1;
	}
	
	//Metodo que da ausencia o presencia en boleano
	public boolean ausenciaAleatorio () {
		
		int ausencia= (int) (Math.random());
		if (ausencia>0.5) {
			return true;
		}else {
			return false;
		}
	}
	
}
