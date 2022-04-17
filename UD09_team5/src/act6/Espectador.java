package act6;

public class Espectador {
	private String[] Nombres = {"Antonio", "Pepi", "Flores", "Alberto","Susi", "Adri", "Java", "Html", "Franki", "Espartaca", "Watson", "Ivet", "NicolasCage"};
	
	private String nombre;
	private int edad;
	private double dinero;
	
	public Espectador() {
		this.nombre = nombreRandom();
		this.edad = edadRandom();
		this.dinero = dineroRandom();
	}
	
	public String nombreRandom() {
		int random = numRandom(1, 13);
		return Nombres[random];
	}
	public int edadRandom() {
		int random = numRandom(4, 80); 
		return random;
	}
	public double dineroRandom() {
		return (double) Math.round(numRandom(10, 30) * 100d) / 100d;
	}	
	
	public static int numRandom(int min, int max) { // metodo devuelve num random
		return (int) (Math.random() * (max - min) + min);
	}

	public String[] getNombres() {
		return Nombres;
	}

	public void setNombres(String[] nombres) {
		Nombres = nombres;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	
}
