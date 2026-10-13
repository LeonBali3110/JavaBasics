import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		//Demanen les dades amb String
		System.out.println("Enter radius: ");
		String textR = scanf.nextLine();
		System.out.println("Enter units: ");
		String units = scanf.nextLine();
		
		
		//Convertim les dades a nombres i declarem pi
		double r = Double.parseDouble(textR);
		double pi = Math.PI;
		
		//Calculem el resultat
		double r2 = Math.pow(r, 2);
		double result = pi * r2;
		
		System.out.println("Area = " + result + " " + units + "^2");
		
		scanf.close();
	}
}