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
		
		
	}

}
