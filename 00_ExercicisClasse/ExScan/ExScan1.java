import java.util.Scanner;

public class ExScan1 {
    public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.printf("Enter first price: ");
		int x1 = scanf.nextInt();
		System.out.printf("%nEnter second price: ");
		int x2 = scanf.nextInt();
		System.out.printf("%nEnter thrird price: ");
		int x3 = scanf.nextInt();
		System.out.printf("%nEnter fourth price: ");
		int x4 = scanf.nextInt();
		System.out.printf("%nEnter fifth price: ");
		int x5 = scanf.nextInt();
		
		int suma = x1 + x2 + x3 + x4 + x5;
		float average = (float)suma / 5;
		
		System.out.printf("%nTotal price: %d", suma);
		System.out.printf("%nAverage: %.1f", average);
		
		scanf.close();
	}
}