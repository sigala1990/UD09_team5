package act1;

public class Televisor extends Electrodomestico {
	
	// Atributos
	private int resolucion;
	private boolean sintonizador;
	
	
	// Constructor1
	public Televisor() {
		super();
		this.resolucion = 20;
		this.sintonizador = false;
	}
	
	// Constructor2
	public Televisor(int precioBase, int peso) {
		super(precioBase, peso);
		this.precioBase = precioBase;
		this.peso = peso;
		this.resolucion = 20;
		this.sintonizador = false;
	}

	// Constructor3
	public Televisor(int precioBase, int peso, int resolucion, boolean sintonizador, Color color, ConsumoEnergetico consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.resolucion = resolucion;
		this.sintonizador = sintonizador;
	}

	// Getters & Setters
	public int getResolucion() {
		return resolucion;
	}


	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}


	public boolean isSintonizador() {
		return sintonizador;
	}


	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}
	
	// Metodo para sacar una resoliucion aleatoria
	public int sacarResolucion() {

		int x = (int) (Math.random() * (5 - 1) + 1);
		int c=0;
		switch (x) {
		case 1:
			c=24;
			break;
		case 2:
			c=32;
			break;
		case 3:
			c=46;
			break;
		case 4:
			c=55;
			break;
		}
		return c;
	}
	
	// Metodo para ver si tiene sintonizador o no
	public boolean sacarSintonizador() {

		double x = Math.random();
		
		if(x>0.5) {
			return sintonizador=true;
		}else {
			return sintonizador=false;
		}
		
	}
	
	// metodo para sacar el precio final
	public int precioFinal() {

		int b=precioBase;
		switch (consumoEnergetico) {
		case A:
			b+=100;
			break;
		case B:
			b+=80;
			break;
		case C:
			b+=60;
			break;
		case D:
			b+=50;
			break;
		case E:
			b+=30;
			break;
		case F:
			b+=10;
			break;
		}
		
		if(resolucion>40) {
			b*=1.3;
		}
		
		if(sintonizador==true) {
			b+=50;
		}
		
		return b;
	}
	
	
	public String tipoClase() {
		return "Televisor";
	}

	@Override
	public String toString() {
		return "Televisor [resolucion=" + resolucion + ", sintonizador=" + sintonizador + "]";
	}
	
	

}
