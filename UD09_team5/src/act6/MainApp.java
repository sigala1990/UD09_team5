package act6;

import java.util.Hashtable;

public class MainApp {
	public static void main (String[] args) {
		
		Pelicula peli = new Pelicula();
		//System.out.println(peli.getEdadMinima()+" peli");
		
		Sala sala = new Sala(15);
	//	Asiento asiento = new Asiento("aa");
		
		System.out.println(sala.getAsientos()[0][0].getEspectador().getNombre()); //nombre del espectador sentado en la posicion 0 0 de la arraybidimensional
		System.out.println(sala.getAsientos()[0][0].isOcupado());//indica si el asiento 0 0 esta ocupado
		

	}
}
