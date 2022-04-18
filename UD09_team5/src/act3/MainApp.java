package act3;

/*
 * @author Veronika Polonchak
 */

public class MainApp {

	public static void main(String[] args) {
		
		//Creamos los objetos de la clase Libro
		Libro libro1 = new Libro("9788423430512", "La rebeli�n de Atlas", "Ann Rand", 1232);
		Libro libro2 = new Libro("9788420674292", "El lobo estepario", "Hermann Hesse", 288);

		//Mostramos los resultados por consola
		System.out.println(libro1);
		System.out.println(libro2);
		
		//Invocamos el m�todo que compara la cantidad de las p�ginas
		compararNumeroPaginas(libro1, libro2);

	}

	public static void compararNumeroPaginas(Libro libro1, Libro libro2) {
		
		//hacemos uso de los getters para comparar el n�mero de p�ginas
		if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
			System.out.println("'" + libro1.getTitulo() + "' tiene m�s p�ginas que '" + libro2.getTitulo() + "'");
		} else if (libro2.getNumeroPaginas() > libro1.getNumeroPaginas()) {
			System.out.println("'" + libro2.getTitulo() + "' tiene m�s p�ginas que '" + libro1.getTitulo() + "'");
		} else {
			System.out.println("Los libros tienen la misma cantidad de p�ginas");

		}
	}
	
	/*
	 * -------------CORRECCION ADRI QUERALT
	 * 
	 * ----------EL enunciado pide que al momento de mostrar por print una clase tenga un formato en concreto
	 * /*	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas
				+ "]";
	}*/
	
	 

}
