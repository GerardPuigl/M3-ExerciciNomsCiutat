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
		
		for (String c:ciutat) {
			System.out.println(c);
		}
		
		/* Por si el ejercicio se debía hacer sin usar Array de variables.
		
		String ciutat1;
		String ciutat2;
		String ciutat3;
		String ciutat4;
		String ciutat5;
		String ciutat6;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdueix el nom de 6 ciutats:");
		
		ciutat1 = sc.nextLine();
		ciutat2 = sc.nextLine();
		ciutat3 = sc.nextLine();
		ciutat4 = sc.nextLine();
		ciutat5 = sc.nextLine();
		ciutat6 = sc.nextLine();
		
		System.out.println(ciutat1);
		System.out.println(ciutat2);
		System.out.println(ciutat3);
		System.out.println(ciutat4);
		System.out.println(ciutat5);
		System.out.println(ciutat6);
		*/
		
	}

}
