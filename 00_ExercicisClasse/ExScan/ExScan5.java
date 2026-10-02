import java.util.Scanner;

public class ExScan5 {
    public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		//Demanen les dades amb String
		System.out.printf("Enter the base: ");
		String textBase = scanf.nextLine();
		System.out.printf("Enter the exponent: ");
		String textExp = scanf.nextLine();
		
		//Convertim les dades a nombres
		double base = Double.parseDouble(textBase);
		int exp = Integer.parseInt(textExp);
		
		//Calculem el resultat
		double result = Math.pow(base, exp);
		
		System.out.printf("%n%.1f ^ %d = %.4f", base, exp, result);
		
		scanf.close();
	}
}