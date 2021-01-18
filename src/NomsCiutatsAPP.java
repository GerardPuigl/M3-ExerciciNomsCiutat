import java.util.*;

public class NomsCiutatsAPP {
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		// Crear 6 variables String i demanar per consola introduir el nom de les
		// ciutats

		System.out.println("Introdueix el nom de 6 ciutats:");

		String ciutat1 = sc.next();
		String ciutat2 = sc.next();
		String ciutat3 = sc.next();
		String ciutat4 = sc.next();
		String ciutat5 = sc.next();
		String ciutat6 = sc.next();

		// Convertir a Array

		String[] arrayCiutats = new String[6];

		arrayCiutats[0] = ciutat1;
		arrayCiutats[1] = ciutat2;
		arrayCiutats[2] = ciutat3;
		arrayCiutats[3] = ciutat4;
		arrayCiutats[4] = ciutat5;
		arrayCiutats[5] = ciutat6;

		Arrays.sort(arrayCiutats);

		// Canviar les 'a' per '4'

		String[] arrayCiutatsModificades = new String[6];

		for (int i = 0; i < arrayCiutats.length; i++) {
			arrayCiutatsModificades[i] = arrayCiutats[i].replace('a', '4');
		}

		// Ordenar Array
		Arrays.sort(arrayCiutatsModificades);

		System.out.println(Arrays.toString(arrayCiutats));
		System.out.println(Arrays.toString(arrayCiutatsModificades));

		// Creeu un nou array per cada una de les ciutats que tenim.

		char[] arrayCiutat1 = new char[arrayCiutats[0].length()];
		char[] arrayCiutat2 = new char[arrayCiutats[1].length()];
		char[] arrayCiutat3 = new char[arrayCiutats[2].length()];
		char[] arrayCiutat4 = new char[arrayCiutats[3].length()];
		char[] arrayCiutat5 = new char[arrayCiutats[4].length()];
		char[] arrayCiutat6 = new char[arrayCiutats[5].length()];

		// Ompliu els nous arrays lletra per lletra.

		arrayCiutat1 = arrayCiutats[0].toCharArray();
		arrayCiutat2 = arrayCiutats[1].toCharArray();
		arrayCiutat3 = arrayCiutats[2].toCharArray();
		arrayCiutat4 = arrayCiutats[3].toCharArray();
		arrayCiutat5 = arrayCiutats[4].toCharArray();
		arrayCiutat6 = arrayCiutats[5].toCharArray();

		// Mostreu per consola els nous arrays amb els noms invertits

		for (int i = arrayCiutat1.length - 1; i >= 0; i--) {
			System.out.print(arrayCiutat1[i]);
		}
		System.out.println("");

		for (int i = arrayCiutat2.length - 1; i >= 0; i--) {
			System.out.print(arrayCiutat2[i]);
		}
		System.out.println("");

		for (int i = arrayCiutat3.length - 1; i >= 0; i--) {
			System.out.print(arrayCiutat3[i]);
		}
		System.out.println("");

		for (int i = arrayCiutat4.length - 1; i >= 0; i--) {
			System.out.print(arrayCiutat4[i]);
		}
		System.out.println("");

		for (int i = arrayCiutat5.length - 1; i >= 0; i--) {
			System.out.print(arrayCiutat5[i]);
		}
		System.out.println("");
		
		for (int i = arrayCiutat6.length - 1; i >= 0; i--) {
			System.out.print(arrayCiutat6[i]);
		}
		System.out.println("");

	}

}
