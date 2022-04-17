package act6;

import java.util.Hashtable;

public class MainApp {
	public static void main (String[] args) {
		
		Pelicula peli = new Pelicula();
		System.out.println(peli.getEdadMinima()+" peli");
		
		Sala sala = new Sala(15);
		Asiento asiento = new Asiento("aa");
		
		
		sala.getAsientos()[0][0].setPosicion("XX");
		
		/*for (int i = 0; i < sala.getAsientos().length; i++) {
			for (int j = 0; j < sala.getAsientos()[0].length; j++) {
						System.out.println(sala.getAsientos()[i][j].getPosicion());
			}
		}
*/
		//System.out.println(sala.getAsientos().length);
	}
}
