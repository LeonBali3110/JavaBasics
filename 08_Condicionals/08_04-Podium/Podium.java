import java.util.Scanner;

public class Podium {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Demanen les dades
		System.out.println("Enter the score of the first athlete:");
		int a1 = scanner.nextInt();
		System.out.println("Enter the score of the second athlete:");
		int a2 = scanner.nextInt();
		System.out.println("Enter the score of the third athlete:");
		int a3 = scanner.nextInt();
		scanner.nextLine();
		System.out.printf("Enter \"asc\" or \"desc\":%n");
		String ord = scanner.nextLine();
		
		//Converim a lower case per legir sense importa com a insertat el text el usuari
		ord = ord.toLowerCase();
		
		//Declarem las variables que farem usar per ordenar el podium
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		
		//Asignem els nombres a les seves positions
		// Aquì la posicio 1
		if (a1 > a2 && a1 > a3){
		p1 = a1;
		}else if (a2 > a3) {
			p1 = a2;
		}else {
			p1 = a3;
		}
		
		if ((a1 > a2 && a1 > a3 && a2 > a3) || (a3 > a2 && a3 > a1 && a2 > a1)){
		p2 = a2;
		}else if ((a2 > a1 && a2 > a3 && a1 > a3) || (a3 > a2 && a3 > a1 && a1 > a2)) {
			p2 = a1;
		}else {
			p2 = a3;
		}
		
		if (a1 < a2 && a1 < a3){
		p3 = a1;
		}else if (a2 < a3) {
			p3 = a2;
		}else {
			p3 = a3;
		}
		
		//Aquí coloquem els nombres el ordre que el usuari voll
		if (ord.equals("asc")) {
			System.out.printf("Podium: %d %d %d", p3, p2, p1);
		}else if (ord.equals("desc")) {
			System.out.printf("Podium: %d %d %d", p1, p2, p3);
		}
		
		scanner.close();
	}
}