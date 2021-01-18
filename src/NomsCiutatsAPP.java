import java.util.*;

public class NomsCiutatsAPP {
	public static void main(String[] arg) {

		Scanner sc = new Scanner(System.in);

		// Crear 6 variables String y pedir por consolsa introducir nombres ciudades
		
		System.out.println("Introdueix el nom de 6 ciutats:");

		String ciutat1 = sc.next();
		String ciutat2 = sc.next();
		String ciutat3 = sc.next();
		String ciutat4 = sc.next();
		String ciutat5 = sc.next();
		String ciutat6 = sc.next();

		// Convertir a Arraylist

		String[] arrayCiutats = new String[6];

		arrayCiutats[0] = ciutat1;
		arrayCiutats[1] = ciutat2;
		arrayCiutats[2] = ciutat3;
		arrayCiutats[3] = ciutat4;
		arrayCiutats[4] = ciutat5;
		arrayCiutats[5] = ciutat6;

		Arrays.sort(arrayCiutats);

		System.out.println(Arrays.toString(arrayCiutats));

	}

}
