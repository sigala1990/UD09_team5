package act2;

/*
 * @author Veronika Polonchak
 */

public class MainApp {

	public static void main(String[] args) {

		// definimos los arrays
		Serie misSeries[] = new Serie[5];
		Videojuego misVideojuegos[] = new Videojuego[5];

		// asignamos valores a los arrays
		misSeries[0] = new Serie("Los vikingos", 6, "Drama histórico", "Michael Hirst");
		misSeries[1] = new Serie("El cuento de la criada", 4, "Ficción utópica y distópica", "Michael Hirst");
		misSeries[2] = new Serie("El juego del calamar", 1, "Drama", "Hwang Dong-Hyuk");
		misSeries[3] = new Serie("The Office", 9, "Comedia", "Greg Daniels");
		misSeries[4] = new Serie("Juego de tronos", 8, "Novela de fantasía", "David Benioff y D.B.Weiss");

		misVideojuegos[0] = new Videojuego("Rimworld", 90, "Indie", "Paradox");
		misVideojuegos[1] = new Videojuego("The Long Dark", 55, "Survival", "Paradox");
		misVideojuegos[2] = new Videojuego("bla bla bla", 24, "Indie", "Paradox");
		misVideojuegos[3] = new Videojuego("Rimworld", 235, "Indie", "Paradox");
		misVideojuegos[4] = new Videojuego("WOW", 234, "RPG", "Blizzard");

		// entregamos series y videojuegos
		misSeries[0].entregar();
		misSeries[2].entregar();

		misVideojuegos[1].entregar();
		misVideojuegos[4].entregar();

		// invocamos el método que calcula la cantidad de unidades entregadas pasándole
		// como parámetro arrays
		cantidadesEntregadas(misSeries, misVideojuegos);
		System.out.println("");
		// invocamos el método que muestra la serie con la cantidad máxima de temporadas
		// pasándole como parámetro array de series
		serieMaxTemporadas(misSeries);
		System.out.println("");
		// invocamos el método que muestra el videojuego con la cantidad máxima de horas
		// estimadas pasándole como parámetro array de videojuegos
		videojuegoMaxHorasEstimadas(misVideojuegos);

	}

	public static void cantidadesEntregadas(Serie[] serie, Videojuego[] videojuego) {

		int seriesEntregadas = 0;
		int videojuegosEntregados = 0;

		for (int i = 0; i < 5; i++) {

			if (serie[i].isEntregado()) {
				seriesEntregadas += 1;
			}

			if (videojuego[i].isEntregado()) {
				videojuegosEntregados += 1;
			}
		}

		System.out.println("La cantidad de series entregadas: " + seriesEntregadas);
		System.out.println("La cantidad de videojuegos entregados: " + videojuegosEntregados);

	}

	public static void serieMaxTemporadas(Serie[] serie) {

		int posicionMaxTemporadas = 0;
		int serieMaxTemporadas = 0;

		for (int i = 0; i < serie.length; i++) {

			if (serie[i].getNumeroTemporadas() > serieMaxTemporadas) {
				posicionMaxTemporadas = i;
				// asignamos posicion de serie si sus temporadas son mayores a las temporadas de
				// otras series
				serieMaxTemporadas = serie[i].getNumeroTemporadas();
			}
		}
		System.out.println("La serie con la cantidad máxima de temporadas: ");
		System.out.println(serie[posicionMaxTemporadas].toString());

	}

	public static void videojuegoMaxHorasEstimadas(Videojuego[] videojuego) {

		int posicionMaxTemporadas = 0;
		int videojuegoMaxTemporadas = 0;

		for (int i = 0; i < videojuego.length; i++) {

			if (videojuego[i].getHorasEstimadas() > videojuegoMaxTemporadas) {
				posicionMaxTemporadas = i;
				// asignamos posicion de videojuego si sus horas estimadas son mayores a las
				// horas estimadas de otros videojuegos
				videojuegoMaxTemporadas = videojuego[i].getHorasEstimadas();
			}
		}
		System.out.println("El videojuego con la cantidad máxima de horas estimadas: ");
		System.out.println(videojuego[posicionMaxTemporadas].toString());
	}

}
