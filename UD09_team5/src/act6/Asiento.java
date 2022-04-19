package act6;

public class Asiento {

	//atributos
	private boolean ocupado;
	private String posicion;
	private Espectador espectador;
	
	public Asiento(String posicion){
		this.posicion = posicion;
		this.ocupado = false;
		
	}


	public boolean isOcupado() {
		return ocupado;
	}


	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}


	public String getPosicion() {
		return posicion;
	}


	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}


	public Espectador getEspectador() {
		return espectador;
	}


	public void setEspectador(Espectador espectador) {
		this.espectador = espectador;
	}
	
	
	
}
