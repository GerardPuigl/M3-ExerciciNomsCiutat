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

		System.out.println(ciutat1);
		System.out.println(ciutat2);
		System.out.println(ciutat3);
		System.out.println(ciutat4);
		System.out.println(ciutat5);
		System.out.println(ciutat6);

	}

}
