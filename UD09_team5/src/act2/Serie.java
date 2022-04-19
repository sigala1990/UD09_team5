package act2;

/*
 * @author Veronika Polonchak
 */

public class Serie implements Entregable {

	//
	final boolean ENTREGADO_CONST = false; 
	// atributos
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	// constructor por defecto
	public Serie() {

		this.titulo = "";
		this.numeroTemporadas = 3;
		this.entregado = ENTREGADO_CONST;
		this.genero = "";
		this.creador = "";

	}

	// constructor con el título y el creador, el resto por defecto
	public Serie(String titulo, String creador) {

		this.titulo = titulo;
		this.creador = creador;
		this.genero = "";
		this.numeroTemporadas = 3;
		this.entregado = ENTREGADO_CONST;
	}

	// constructor con todos los atributos como parámetros, exepto de entregado
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {

		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
		this.entregado = ENTREGADO_CONST;
	}

	// getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	// métodos de la interfaz implementada
	@Override
	public void entregar() {

		this.entregado = true;
	}

	@Override
	public void devoler() {

		this.entregado = false;

	}

	@Override
	public boolean isEntregado() {

		return entregado;
	}



	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", es entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

}
