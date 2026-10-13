import java.util.Scanner;

public class PositiveNegativeZero {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int x = scanner.nextInt();
		
		if (x > 0){
			System.out.printf("The number %d is positive", x);
		}else if (x < 0){
			System.out.printf("The number %d is negative", x);
		}else {
			System.out.printf("The number %d is zero", x);
		}
	}
}