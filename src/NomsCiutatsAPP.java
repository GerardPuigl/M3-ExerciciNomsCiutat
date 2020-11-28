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
		
	
		//Cambiar las 'a' por '4'
		ArrayList<String> arrayCiutatsModificada = new ArrayList();
		
		for (String s:arrayCiutats) {
			s=s.replace('a', '4');
			arrayCiutatsModificada.add(s);
		}

		// Ordenar Array
		Collections.sort(arrayCiutatsModificada);
		
		System.out.println(arrayCiutatsModificada);
		
	}

}
