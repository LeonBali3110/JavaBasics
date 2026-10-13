import java.util.Scanner;
public class BodyWeight {

    public static void main(String[] args) {

        // Constants
        final byte K_MEN = 4;
        final float K_WOMEN = 2.5f;

        // Create the Scanner
		Scanner scanner = new Scanner(System.in);

        // Request the input  (2 integers)
		System.out.println("Enter your height in cm: ");
		int h = scanner.nextInt();
		System.out.println("Enter your age: ");
		int a = scanner.nextInt();

        // Calculate the body weight for men
		
		double WH = (float)h - 100 - ((float)h - 150) / 4 + ((float)a - 20) / K_MEN;

        // Display the body weight for men
		
		System.out.printf("Ideal Body Weight for Men = %.2fkg%n", WH);

        // Calculate the body weight for women
		
		double WW = (float)h - 100 - ((float)h - 150) / 4 + ((float)a - 20) / K_WOMEN;

        // Display the body weight for women
		
		System.out.printf("Ideal Body Weight for Women = %.2fkg", WW);

        // Close the Scanner
		scanner.close();
    }

}
