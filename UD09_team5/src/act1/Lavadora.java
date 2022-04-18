package act1;

public class Lavadora extends Electrodomestico {
	
	// Atributos
	private double carga;
	
	// Constante
	double ConstanteCarga=5;

	// Constructor1
	public Lavadora() {
		super();
		this.carga = ConstanteCarga;
	}
	
	// Constructor2
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = ConstanteCarga;
	}
	
	// Constructor3
	public Lavadora(int precioBase, int peso, double carga, Color color, ConsumoEnergetico consumoEnergetico) {
		super(precioBase, peso, color, consumoEnergetico);
		this.carga = carga;
	}
	
	//Getters & Setters
	public double getCarga() {
		return carga;
	}

	public void setCarga(double carga) {
		this.carga = carga;
	}
	
	// Metodo para sacar el precio final de la lavadora
	public int precioFinal() {
		
		// Condicion del padre
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
		// Condición del padre
		if(peso<=19 && peso> 0) {
			b+=10;
		}
		if(peso>=20 && peso<=49) {
			b+=50;
		}
		if(peso>=50 && peso<=79) {
			b+=80;
		}
		if(peso>=80) {
			b+=100;
		}
		//Si la carga es superior a 30 kg el precio augmentara 50 € 
		if(carga>30) {
			b+=50;
		}
		
		return b;
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "]";
	}
	
	public String tipoClase() {
		return "Lavadora";
	}

}
