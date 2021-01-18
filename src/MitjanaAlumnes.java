import java.util.*;

import javax.swing.JOptionPane;

public class MitjanaAlumnes {

	public static void main(String[] arg) {

		/*
		 * En aquest exercici crearàs un array bidimensional on introduiràs 3 notes per
		 * a 5 alumnes. Es calcularà la nota mitjana de cada alumna i
		 * s'indicarà si han suspès o no. Crea un array bidimensional capaç de guardar 3
		 * notes de 5 alumnes. Omple l’array amb un bucle demanant els valors per
		 * pantalla (nota entre 0 i 10), has d’identificar per pantalla quan és una
		 * agrupació d’un alumne nou . Recorre l'array, fes la Mitjana aritmètica de les
		 * 3 notes i indica si l'alumne ha aprovat o suspès
		 */

		boolean done = false;
		int sum;

		int[][] notesAlumnes = new int[5][3];

		// introduir les notes amb uns JOptionpane
		for (int i = 0; i < notesAlumnes.length; i++) {
			System.out.println("Alumne " + (i + 1));
			for (int k = 0; k < notesAlumnes[i].length; k++) {
				System.out.println("nota " + (k + 1));
				do {
					done = false;
					try {
						notesAlumnes[i][k] = Integer.parseInt(JOptionPane
								.showInputDialog("Introdueix la nota del Alumne " + (i + 1) + " nota " + (k + 1)));

					} catch (Exception e) {
						System.out.println("Error: Heu d'introduir un número");
					}

					if (notesAlumnes[i][k] < 0 || notesAlumnes[i][k] > 10) {
						System.out.println("Error: heu d'introduir un número entre 0 i 10");
					} else {
						done = true;
					}
				} while (!done);
			}
		}

		// calcula la mitjana i imprimeix si ha aprovat o suspès.
		for (int i = 0; i < notesAlumnes.length; i++) {
			sum = 0;
			for (int k = 0; k < notesAlumnes[i].length; k++) {
				sum = sum + notesAlumnes[i][k];
			}
			if ((sum / notesAlumnes[i].length) >= 5) {
				System.out.println("Alumne " + (i + 1) + " ha aprovat.");
			} else {
				System.out.println("Alumne " + (i + 1) + " ha suspès.");
			}

		}

	}

}
