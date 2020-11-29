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
		ArrayList<ArrayList<Character>> lletresCiutats = new ArrayList();
		
		int numeroCiutat=0;
		
		for (String c:arrayCiutats) {
			
			lletresCiutats.add(new ArrayList<Character>());
			
			for (int i = 0; i < c.length(); i++) {
				lletresCiutats.get(0).add(c.charAt(i));
			}
			numeroCiutat++;
		
		}


		numeroCiutat=0;
		for (String c:arrayCiutats) {

			System.out.println(c.length());
			
			for (int j = c.length(); j > 0 ; j--) {
				System.out.print(lletresCiutats.get(numeroCiutat).get(j-1));
								
			}
			numeroCiutat++;
			System.out.println("");
		
		}

	}

}
