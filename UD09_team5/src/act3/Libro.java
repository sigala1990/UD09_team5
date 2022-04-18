package act3;

/*
 * @author Veronika Polonchak
 */

public class Libro {

	// atributos
	String ISBN;
	String titulo;
	String autor;
	int numeroPaginas;

	// constructor por defecto
	public Libro() {
		super();
		this.ISBN = "";
		this.titulo = "";
		this.autor = "";
		this.numeroPaginas = 0;

	}

	// constructor con todos los atributos como parámetros
	public Libro(String iSBN, String titulo, String autor, int numeroPaginas) {
		super();
		this.ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	// getters y setters
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	@Override
	public String toString() {
		return "Libro [ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas
				+ "]";
	}

}
