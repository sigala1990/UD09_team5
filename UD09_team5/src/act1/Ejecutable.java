package act1;

import java.util.List;
import java.util.ArrayList;

public class Ejecutable {

	
	
	// Atributos
	
	private Lavadora lavadora;
	private Televisor televisor;
	private List<Electrodomestico> electrodomesticos;
	
	// Constructor1
	public Ejecutable() {
		this.lavadora = r();
		this.televisor = f();
		this.electrodomesticos = crearArray10Electrodomesticos();
	}
	
	// Constructor2
	public Ejecutable( Lavadora lavadora, Televisor televisor) {
		this.lavadora = lavadora;
		this.televisor = televisor;
	}

	public Lavadora r() {
		
		Lavadora lavadora1=new Lavadora();
		
		return lavadora1;
	}
	
	public Televisor f() {
		
		Televisor televisor1=new Televisor();
		
		return televisor1;
	}
	
	//metodo que crea labadoras, crea televisores y llena el array electrodomesticos
	public ArrayList<Electrodomestico> crearArray10Electrodomesticos() {
		
		ArrayList<Electrodomestico> electrodomesticos1=new ArrayList<Electrodomestico>();
		
		for (int i = 0; i < 5;i++) {
			Lavadora lavadora = new Lavadora();
			electrodomesticos1.add(lavadora);
		}
		
		for (int i = 0; i < 5;i++) {
			Televisor televisor = new Televisor();
			electrodomesticos1.add(televisor);
		}
		
		return electrodomesticos1;
	}
	
	//metodo recorreArray 
	/*
	 * mostra 1 linia de lavadoras
	 * mostra 1 linia de teles
	 * mostra en 1 linia la suma electrodomesticos
	 */
	public void recorreArray() {
		int suma=0;
		String lava="";
		String tele="";
		
		for (int i = 0; i < electrodomesticos.size();i++) {//recorre la lista
			
			if(electrodomesticos.get(i).tipoClase().equals("Lavadora") ){
				
				lava += "lavadora"+(i+1)+" "+electrodomesticos.get(i).precioFinal()+"€ como precio final"+"\n";
			}
			
			if(electrodomesticos.get(i).tipoClase().equals("Televisor") ){
				
				tele += "televisor"+(i+1)+" "+electrodomesticos.get(i).precioFinal()+"€ como precio final"+"\n";
			}
			
			suma += electrodomesticos.get(i).precioFinal();
		}
		System.out.println(lava);
		System.out.println(tele);
		System.out.print("Suma Total "+suma);
		
	}

	// Getters & Setters
	public Lavadora getLavadora() {
		return lavadora;
	}

	public void setLavadora(Lavadora lavadora) {
		this.lavadora = lavadora;
	}

	public Televisor getTelevisor() {
		return televisor;
	}

	public void setTelevisor(Televisor televisor) {
		this.televisor = televisor;
	}

	public List<Electrodomestico> getElectrodomesticos() {
		return electrodomesticos;
	}

	public void setElectrodomesticos(List<Electrodomestico> electrodomesticos) {
		this.electrodomesticos = electrodomesticos;
	}

	
	@Override
	public String toString() {
		return "Ejecutable [lavadora=" + lavadora + ", televisor=" + televisor + "]";
	}
	
}
