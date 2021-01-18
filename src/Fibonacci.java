import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		
		/* Escriviu un programa que donat un numero N retorni la seqüència de Fibonacci
		 * fins al numero N.La seqüència de Fibonacci és la sèrie de nombres: 0, 1, 1,
		 * 2, 3, 5, 8, 13, 21, 34, ... El número següent es troba sumant els dos números
		 * anteriors. */

		int n = 0;
		int numActual = 0;
		int numAnterior = 0;
		int numAnteriorAnterior = 1;

		String input = JOptionPane.showInputDialog("Introduiu un número");

		try {
			n = Integer.parseInt(input);
		} catch (Exception e) {
			System.out.println("No heu introduit un número.");
		}

		while (numActual < n) {
			System.out.print(numActual + ",");

			numActual = numAnterior + numAnteriorAnterior;
			numAnteriorAnterior = numAnterior;
			numAnterior = numActual;
		}

	}

}
