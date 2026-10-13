import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		//Demanen les dades amb String
		System.out.println("Enter side A: ");
		String textA = scanf.nextLine();
		System.out.println("Enter side B: ");
		String textB = scanf.nextLine();
		System.out.println("Enter units: ");
		String units = scanf.nextLine();
		
		
		//Convertim les dades a nombres
		double a = Double.parseDouble(textA);
		double b = Double.parseDouble(textB);
		
		//Calculem el resultat
		double result = a * b;
		
		System.out.println("Area = " + result + " " + units + "^2");
		
		scanf.close();
	}
}