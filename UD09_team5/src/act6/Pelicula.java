package act6;

public class Pelicula {
	private String[] PeliDirector = {"Antonio Banderas", "Pepi Calzaslargas", "Flores De la Prada",  "Ferran Adria", "Bruce WIllis"};
	private String[] PeliTitulo = {"Spiderman", "Uncharchet", "marvel", "orcos", "señor de los mendrillos"};
	private int[] Edad = {6,12,18};
	
	//var
	private String titulo;
	private int duracion;
	private int edadMinima;
	private String director;
	
	//constructor
	public Pelicula() {
		this.titulo = tituloRandom();
		this.duracion = duracionRandom();
		this.edadMinima = edadRandom();
		this.director = directorRandom();
	}
	
	
	public String directorRandom() {
		int random = numRandom(1,5);
		return PeliDirector[random];
	}
	
	public int duracionRandom() {
		int random = numRandom(60,180);
		return random;
	}
	
	public int edadRandom() {
		int random = numRandom(0,3);
		return Edad[random];
	}
	
	public String tituloRandom() {
		int random = numRandom(1,5);
		return PeliTitulo[random];
	}
	
	public static int numRandom(int min, int max) { // metodo devuelve num random
		return (int) (Math.random() * (max - min) + min);
	}

	//getters setters
	public int[] getEdad() {
		return Edad;
	}


	public void setEdad(int[] edad) {
		Edad = edad;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public int getEdadMinima() {
		return edadMinima;
	}


	public void setEdadMinima(int edadMinima) {
		this.edadMinima = edadMinima;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}
	
}
