import java.util.Scanner;

public class ReadLine {
    public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		
		System.out.printf("Introdueix un preu: ");
		int x = scanf.nextInt();
		System.out.println("Preu: " + x);
		System.out.printf("Introdueix un unitats: ");
		int y = scanf.nextInt();
		System.out.printf("%nPreu total: %d%n", x*y);
		scanf.nextLine(); //SALT DE LINEA <-- necesari per fer servir el Scanner en Strings
		
		
		System.out.printf("%nDonar-mi al teu nom: ");
		String z = scanf.nextLine();
		System.out.printf("%nEl teu nom: %s", z);
		
		scanf.close();
	}
}