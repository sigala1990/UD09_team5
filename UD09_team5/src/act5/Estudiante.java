package act5;

public class Estudiante extends Persona {
	
	//public enum Genero{hombre, mujer};
	 private double calificacion;
	 

	
	public Estudiante() {
		super();
		this.calificacion = numeroNota();
		this.esAusente = ausenciaAleatorio();
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


	
	
	//metodo que da una nota entre 0 a 10
	public double numeroNota () {
		//System.out.println((double)Math.round(number * 100d) / 100d);
		double notar= Math.random()*(9)+1;
		//String valorString = String.format("%.2f", notar);
		//double nota = Double.valueOf( valorString);
		return (double) Math.round(notar*100d)/ 100d;
	}
	//Metodo que da una edad aleatoria entre un intervalo
	public int edadAleatorio () {

		int edad1= (int) (Math.random() * (25 - 16) + 16);
		
		return edad1;
	}
	
	//Metodo que da ausencia o presencia en boleano
	public boolean ausenciaAleatorio () {
		//return (int) (Math.random() * (max - min) + min);
		double ausencia= (Math.random());
		if (ausencia>0.5) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
