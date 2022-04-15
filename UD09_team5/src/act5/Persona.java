package act5;

import act5.Persona.Genero;

public abstract class Persona {

	public enum Genero{hombre, mujer};
	protected String nombre;
	protected int edad;
	protected Genero sexo;
	
	
	
	public Persona() {
		//super();
		this.nombre = sacarNombre(arrayMujerNombre(), arrayHombreNombre());
		this.edad = edadAleatorio ();
		this.sexo = sexoAleatorio(arrayMujerNombre(),arrayHombreNombre());
	}
	
	public Persona(String nombre, int edad/*, Object sexo*/) {
		//super();
		this.nombre = nombre;
		this.edad = edad;
		//this.sexo =sexo ;
	}
	
	//metodo si hombre o mujer en funcion del nombre
	public Genero sexoAleatorio (String[] nombreMujer, String[] nombreHombre) {

		for (int i = 0; i < nombreHombre.length; i++) {
			if(nombre == nombreMujer[i]) {
				return Genero.mujer;
			}
			if(nombre == nombreHombre[i]) {
				return Genero.hombre;
			}
		}
		return null;	
	}
	
	public String[] arrayHombreNombre() {
		String[] nomHombre = {"Toni", "Ivan", "Marc", "Pedro"};
		return nomHombre;
	
		
	}
	public String[] arrayMujerNombre() {
		String[] nomMujer = {"Eva", "Ana", "Sonia", "Marta"};
		return nomMujer ;
	}
	
	// Metodo para sacar nombre
	public String sacarNombre (String[] nombreMujer, String[] nombreHombre){
				
		int x= (int) Math.random()*(4-0)+0;

		int y= (int) (Math.random() * (4 - 1) + 1);
		if(x >2) {
			return nombreHombre[y];
			
		}else{
				return nombreMujer[y];
		}
	}
	
	//Metodo abstracto para implementar en profesor y estudiante
	public abstract boolean ausenciaAleatorio ();

	//Metodo abstracto para implementar en profesor y estudiante
	public abstract int edadAleatorio ();
	
	
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


	public Genero getSexo() {
		return sexo;
	}


	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}



	
	
}
