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
		
		// Ordenar Array
		
		Collections.sort(arrayCiutats);

		System.out.println(arrayCiutats);
	
		//Cambiar las 'a' por '4'

		ArrayList<String> arrayCiutatsModificada = new ArrayList();
		
		for (String s:arrayCiutats) {
			s=s.replace('a', '4');
			arrayCiutatsModificada.add(s);
		}

		//Ordeonar en Ciudades en diferentes Array e imprimir en orden inverso sus letras
		
		ArrayList<ArrayList<Character>> lletresCiutats = new ArrayList();
		
		int numeroCiutat=0;
		for (String c:arrayCiutats) {
			lletresCiutats.add(new ArrayList<Character>());
		
			for (int i = 0; i < c.length(); i++) {
				lletresCiutats.get(numeroCiutat).add(c.charAt(i));
			}
			numeroCiutat++;
		}

		numeroCiutat=0;
		for (String c:arrayCiutats) {
			
			for (int j = c.length()-1; j >= 0 ; j--) {
				System.out.print(lletresCiutats.get(numeroCiutat).get(j));		
			}
			numeroCiutat++;
			System.out.println("");
		
		}

	}

}