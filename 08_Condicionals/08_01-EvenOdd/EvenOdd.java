import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int x = scanner.nextInt();
		
		if (x%2 == 0){
			System.out.printf("The number %d is even", x);
		}else {
			System.out.printf("The number %d is odd", x);
		}
	}
}