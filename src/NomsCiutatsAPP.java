import java.util.*;

public class NomsCiutatsAPP {
	public static void main(String[] arg) {

		// Crear 6 variables String y pedir por consolsa introducir nombres

		String[] ciutat = new String[6];

		for (int i = 0; i < 6; i++) {
			
			System.out.println("Introdueix el nom de la ciutat número "+(i+1)+":");
			
			Scanner sc = new Scanner(System.in);
			ciutat[i] = sc.next();
		}
		
		for (String c:ciutat) {
			System.out.println(c);
		}
	}

}
