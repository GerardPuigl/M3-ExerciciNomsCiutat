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

		String[] ciutat = new String[6];

		ciutat[0]=ciutat1;
		ciutat[1]=ciutat2;
		ciutat[2]=ciutat3;
		ciutat[3]=ciutat4;
		ciutat[4]=ciutat5;
		ciutat[5]=ciutat6;
		
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
