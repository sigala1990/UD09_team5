package act1;

public abstract class Electrodomestico {

	//constantes
	final int constPrecioBase=100;
	final int constPeso=5;
	final Color constColor=Color.blanco;
	final ConsumoEnergetico constConsumoEnergetico=ConsumoEnergetico.F;
	
	public enum Color { blanco, negro, rojo, azul, gris};
	public enum ConsumoEnergetico { A, B, C, D, E, F};
	
	// Atributos
	protected ConsumoEnergetico consumoEnergetico;
	protected Color color;
	protected int precioBase;
	protected int peso;
	



	// Constructor1
	public Electrodomestico() {
		this.precioBase = constPrecioBase;
		this.peso=constPeso;
		this.color=constColor;
		this.consumoEnergetico=constConsumoEnergetico;
	}
	
	// Constructor2
	public Electrodomestico(int precioBase, int peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color=constColor;
		this.consumoEnergetico=constConsumoEnergetico;
	}

	// Constructor3
	public Electrodomestico(int precioBase, int peso, Color constColor, ConsumoEnergetico constConsumoEnergetico) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = constColor;
		this.consumoEnergetico = constConsumoEnergetico;
	}
	
	// Getters & Setters
	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public ConsumoEnergetico getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	// Metodo para sacar consumo energetico
	public ConsumoEnergetico sacarConsumoEnergetico() {

		int x = (int) (Math.random() * (7 - 1) + 1);
	
		switch (x) {
		case 1:
			return ConsumoEnergetico.A;
		case 2:
			return ConsumoEnergetico.B;
		case 3:
			return ConsumoEnergetico.C;
		case 4:
			return ConsumoEnergetico.D;
		case 5:
			return ConsumoEnergetico.E;
		case 6:
			return ConsumoEnergetico.F;
		}
		return null;
	}

	// Metodo para sacar el color
	public Color sacarColor() {

		int x = (int) (Math.random() * (6 - 1) + 1);

		switch (x) {
		case 1:
			return Color.blanco;
		case 2:
			return Color.negro;
		case 3:
			return Color.rojo;
		case 4:
			return Color.azul;
		case 5:
			return Color.gris;
		}
		return null;

	}
	

	// Metodo abstracto para implementar en lavadora y televisor
	public abstract int precioFinal ();
	public abstract String tipoClase();

	
	@Override
	public String toString() {
		return "Electrodomestico [consumoEnergetico=" + consumoEnergetico + ", color=" + color + ", precioBase="
				+ precioBase + ", peso=" + peso + ", constPrecioBase=" + constPrecioBase + ", constPeso=" + constPeso
				+ ", constColor=" + constColor + ", constConsumoEnergetico=" + constConsumoEnergetico + "]";
	}

	


		




}
