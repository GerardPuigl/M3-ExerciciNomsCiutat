import java.util.*;

public class NomsCiutatsAPP {
	public static void main(String[] arg) {

		// Crear 6 variables String y pedir por consolsa introducir nombres

		String[] ciutat = new String[6];
		System.out.println("Introdueix el nom de 6 ciutats:");

		for (int i = 0; i < 6; i++) {
			Scanner sc = new Scanner(System.in);
			ciutat[i] = sc.next();
		}

		// Convertir a Arraylist

		ArrayList<String> arrayCiutats = new ArrayList();

		for (String s : ciutat) {
			arrayCiutats.add(s);
		}
		
		// Ordenar Array
		
		Collections.sort(arrayCiutats);

		System.out.println(arrayCiutats);

	}

}
