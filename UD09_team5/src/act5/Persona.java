package act5;

public abstract class Persona {

	
	protected String nombre;
	protected int edad;
	protected String sexo;
	
	
	
	public Persona() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.sexo = "";
	}
	
	public Persona(String nombre, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	
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


	//public abstract boolean plus (double sueldoPlus);
	
	
}