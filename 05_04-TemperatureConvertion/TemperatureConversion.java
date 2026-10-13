import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		//Demanen les dades amb String
		System.out.println("Enter temperature in Celsius: ");
		String textC = scanf.nextLine();
		
		
		//Convertim les dades a nombres
		double C = Double.parseDouble(textC);
		
		//Calculem el resultat
		double F = C * ((float)9 / 5) + 32;
		
		System.out.printf("Fahrenheits = %.2f", F);
		
		scanf.close();
	}
}