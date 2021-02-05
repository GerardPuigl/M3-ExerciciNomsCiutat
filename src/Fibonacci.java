import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {

		//ambLambda();

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

		while (numActual <= n) {
			System.out.print(numActual + ",");

			numActual = numAnterior + numAnteriorAnterior;
			numAnteriorAnterior = numAnterior;
			numAnterior = numActual;
		}

	}

	public static void ambLambda() {

		Integer n=0;

		String input = JOptionPane.showInputDialog("Introduiu un número");

		try {
			n = Integer.parseInt(input);
		} catch (Exception e) {
			System.out.println("No heu introduit un número.");
		}

		final Integer nl =n;
		
		Stream.iterate(new int[] { 0, 1 }, t -> new int[] { t[1], t[0] + t[1] })
			.takeWhile(t -> t[0] <= nl)
			.map(t -> t[0])
			.forEach(System.out::println);

	}

}
