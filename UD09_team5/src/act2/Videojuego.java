package act2;

/*
 * @author Veronika Polonchak
 */

public class Videojuego implements Entregable {

	// atributos
	private String titulo;
	private int horasEstimadas;
	private boolean entregado;
	private String genero;
	private String companya;

	// constructor por defecto
	public Videojuego() {

		this.titulo = "";
		this.horasEstimadas = 10;
		this.entregado = false;
		this.genero = "";
		this.companya = "";

	}

	// constructor con titulo y horasEstimadas, el resto por defecto
	public Videojuego(String titulo, int horasEstimadas) {

		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
		this.genero = "";
		this.companya = "";
	}

	// constructor con todos los atributos exepto entregado
	public Videojuego(String titulo, int horasEstimadas, String genero, String companya) {

		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.companya = companya;
		this.entregado = false;
	}

	// getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompanya() {
		return companya;
	}

	public void setCompanya(String companya) {
		this.companya = companya;
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
	public void compareTo(Object a) {

		if (a instanceof Serie) {
			System.out.println(((Serie) a).getNumeroTemporadas());
		}
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", es entregado=" + entregado
				+ ", genero=" + genero + ", companya=" + companya + "]";
	}

}
