package act4;

import javax.swing.JOptionPane;

public class MainApp {

	public static void main(String[] args) {

		// obtenemos y parseamos a int los valores pedidos al usuario
		String aInput = JOptionPane.showInputDialog("Introduce el valor de 'a': ");
		double aParseado = Double.parseDouble(aInput);

		String bInput = JOptionPane.showInputDialog("Introduce el valor de 'b': ");
		double bParseado = Double.parseDouble(bInput);

		String cInput = JOptionPane.showInputDialog("Introduce el valor de 'c': ");
		double cParseado = Double.parseDouble(cInput);

		// creamos el objeto de la clase Raices pasándole como parámetros valores de entrada
		Raices raices = new Raices(aParseado, bParseado, cParseado);

		// invocamos el método que comprueba las posibles soluciones
		raices.calcular();
		
		
	}

}
