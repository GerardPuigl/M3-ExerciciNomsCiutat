import java.util.*;

public class NomsCiutatsAPP {
	public static void main(String[] arg) {

		// Crear 6 variables String y pedir por consolsa introducir nombres ciudades

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

		// Ordenar ArrayList
		
		Collections.sort(arrayCiutats);

		System.out.println(arrayCiutats);
	
		//Ordeonar en Ciudades en diferentes ArrayList e imprimir en orden inverso sus letras
		
		ArrayList<Character> lletresCiutats = new ArrayList<Character>();
		
		for (String c:arrayCiutats) {
			
			for (int i = 0; i < c.length(); i++) {
				lletresCiutats.add(c.charAt(i));
			}
		
			for (int j = c.length()-1; j >= 0 ; j--) { 			//Imprime sin comas
				System.out.print(lletresCiutats.get(j));		
			}
			System.out.println("");
			
			Collections.reverse(lletresCiutats);				//Imprime comas y braquets

			System.out.println(lletresCiutats);
			lletresCiutats.clear();
		}

	}

}
