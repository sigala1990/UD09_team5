package act5;

public abstract class Persona {

	
	protected final String Genero[] = {"hombre", "mujer"};
	
	
	protected String nombre;
	protected int edad;
	protected String sexo;
	protected boolean esAusente;
	
	public Persona() {
		this.nombre = sacarNombre(arrayMujerNombre(), arrayHombreNombre());
		this.edad = edadAleatorio ();
		this.sexo = sexoAleatorio(arrayMujerNombre(),arrayHombreNombre());
	}
	
	
	//metodo si hombre o mujer en funcion del nombre
	public String sexoAleatorio (String[] nombreMujer, String[] nombreHombre) {

		for (int i = 0; i < nombreHombre.length; i++) {
			if(nombre == nombreMujer[i]) {
				return Genero[1];
			}
			if(nombre == nombreHombre[i]) {
				return Genero[0];
			}
		}
		return null;	
	}
	
	// Array de hombres
	public String[] arrayHombreNombre() {
		String[] nomHombre = {"Toni", "Ivan", "Marc", "Pedro"};
		return nomHombre;
	}
	
	//Array de mujeres
	public String[] arrayMujerNombre() {
		String[] nomMujer = {"Eva", "Ana", "Sonia", "Marta"};
		return nomMujer ;
	}
	
	// Metodo para sacar nombre
	public String sacarNombre (String[] nombreMujer, String[] nombreHombre){
				
		int x= (int) (Math.random()*(4-0)+0);

		int y= (int) (Math.random() * (4 - 1) + 1);
		if(x >2) {
			return nombreHombre[y];
			
		}else{
			//System.out.println(x);
				return nombreMujer[y];
		}
	}
	
	//Metodo abstracto para implementar en profesor y estudiante
	public abstract boolean ausenciaAleatorio ();

	//Metodo abstracto para implementar en profesor y estudiante
	public abstract int edadAleatorio ();
	
	
	// Getters & Setters
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


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public boolean isEsAusente() {
		return esAusente;
	}

	public void setEsAusente(boolean esAusente) {
		this.esAusente = esAusente;
	}


	public String[] getGenero() {
		return Genero;
	}	
	
}
