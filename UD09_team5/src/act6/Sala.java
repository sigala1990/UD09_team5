package act6;

import java.util.ArrayList;
import java.util.List;

public class Sala {

	private String[] PeliculaTitulo = { "Spiderman", "Uncharchet", "marvel", "orcos", "señor de los mendrillos" };

	private Asiento[][] asientos;// String[][] porque sera una matriz con 2 dimensiones
	private double precioEntrada;
	private String peliTitulo;
	private Pelicula pelicula;
	private List<Espectador> espectadores; // contendra una cantidad de espectadores

	public Sala(double precioEntrada) {
		this.asientos = rellenarPosicionAsiento(crearAsientos());
		this.espectadores = crearListaEspectador();
		this.pelicula = crearPeliculaRandom();
		this.precioEntrada = precioEntrada;
		this.peliTitulo = tituloRandom();
		this.asientos = sentarEspectador(asientos);
	}

	public Asiento[][] crearAsientos() {
		Asiento[][] listaAsientos = new Asiento[9][9];
		return listaAsientos;
	}

	public Asiento[][] sentarEspectador(Asiento[][] asientos) {
		boolean repetimos = false;
		int numAsientoAsignado;

		for (int i = 0; i < espectadores.size(); i++) {// los clientes hacen cola, y vamos mirando 1 a 1 que todo este en orden


			if (clientePuedeEntrar(espectadores.get(i))) {// controlamos si puede entrar
				
				do{
					int contadorButaca = 0;
					numAsientoAsignado = numRandom(1, 81); // num butaca asignado
					repetimos = false;
					
					for (int j = 0; j < asientos.length; j++) {
						for (int j2 = 0; j2 < asientos[0].length; j2++) {
							contadorButaca++;
							if (contadorButaca == numAsientoAsignado) {// encontramos el asiento
								if (!asientos[j][j2].isOcupado()) {// miramos si NO esta ocupado
									asientos[j][j2].setOcupado(true);// indicamos que el asiento esta ocupado
									asientos[j][j2].setEspectador(espectadores.get(i));
									asientos[j][j2].setPosicion("XX");
									
								} else {
									repetimos = true;//silla ocupada
								}
							}
						}
					}
				}while(repetimos);
			
			}

		}
		for (int i = 0; i < asientos.length; i++) {
			for (int j = 0; j < asientos[0].length; j++) {
	//System.out.println("-----------------");
				System.out.print(asientos[i][j].getPosicion() + " ");
				if (j == 8) {
					System.out.println("\n");
				}
			}
		}
		return asientos;
	}

	public Asiento[][] rellenarPosicionAsiento(Asiento[][] asientos) {
		int height = asientos.length;// altura array
		int width = asientos[0].length;// anchura array
		String keyValue = "";
		String[] alpha = { "A", "B", "C", "D", "E", "F", "G", "H", "I" };
		String[] numeric = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				keyValue = "";
				keyValue = alpha[i] + numeric[j];
				asientos[i][j] = new Asiento(keyValue);
			//	System.out.print(asientos[i][j].getPosicion() + " ");
				if (j == 8) {
					//System.out.println("\n");
				}
			}
		}
		return asientos;
	}

	public boolean clientePuedeEntrar(Espectador espectador) {
		if (comprobarDineroEspectador(espectador) && comprobarEdadEspectador(espectador)) {
			return true;
		}
		return false;
	}

	public boolean comprobarDineroEspectador(Espectador espectador) {
		if (espectador.getDinero() > precioEntrada) {// si puede entrar
			return true;
		}
		return false;
	}

	public boolean comprobarEdadEspectador(Espectador espectador) {
		if (espectador.getEdad() > pelicula.getEdadMinima()) {// si puede entrar
			return true;
		}
		return false;
	}

	public List<Espectador> crearListaEspectador() {// crea una cantidad de espectadores como
													// asientos haya
		List<Espectador> espectadores = new ArrayList<Espectador>();
		int height = asientos.length;// altura array
		int width = asientos[0].length;// anchura array
		int totalasientos = (height + 1) * (width + 1);
		for (int i = 0; i < totalasientos; i++) {
			Espectador espectador = new Espectador();
			espectadores.add(espectador);
		}
		return espectadores;

	}

	public String tituloRandom() {
		int random = numRandom(1, 5);
		return PeliculaTitulo[random];
	}

	public static int numRandom(int min, int max) { // metodo devuelve num random
		return (int) (Math.random() * (max - min) + min);
	}

	public Pelicula crearPeliculaRandom() {
		Pelicula peli = new Pelicula();
		return peli;
	}

	public int sizeAsiento() {
		return asientos.length;
	}

	public String[] getPeliTitulo() {
		return PeliculaTitulo;
	}

	public void setPeliTitulo(String[] peliTitulo) {
		PeliculaTitulo = peliTitulo;
	}

	public Asiento[][] getAsientos() {
		return asientos;
	}

	public void setAsientos(Asiento[][] asientos) {
		this.asientos = asientos;
	}

	public double getPrecioEntrada() {
		return precioEntrada;
	}

	public void setPrecioEntrada(double precioEntrada) {
		this.precioEntrada = precioEntrada;
	}

	public String getPeliculaTitulo() {
		return peliTitulo;
	}

	public void setPeliTitulo(String peliTitulo) {
		this.peliTitulo = peliTitulo;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}

	public List<Espectador> getEspectadores() {
		return espectadores;
	}

	public void setEspectadores(List<Espectador> espectadores) {
		this.espectadores = espectadores;
	}

}
