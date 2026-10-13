import java.util.Scanner;

public class BasicCalculator {
	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter the first integer:");
	int n1 = scanner.nextInt();
	scanner.nextLine();
	System.out.println("Enter an operator (+, -, *, /, %):");
	String op = scanner.nextLine();
	System.out.println("Enter the second integer:");
	int n2 = scanner.nextInt();
	
	int n3 = 0;
	
	if (!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/") && !op.equals("%")) {
		System.out.println("Invalid operator!");
	}else if ((op.equals("/") || op.equals("%")) && n2 == 0){
		System.out.println("Error: Division by zero is not allowed");
	}else {
		if (op.equals("+")){
			n3 = n1 + n2;
			System.out.printf("%d + %d = %d", n1, n2, n3);
		}else if (op.equals("-")){
			n3 = n1 - n2;
			System.out.printf("%d - %d = %d", n1, n2, n3);
		}else if (op.equals("*")){
			n3 = n1 * n2;
			System.out.printf("%d * %d = %d", n1, n2, n3);
		}else if (op.equals("/")){
			n3 = n1 / n2;
			System.out.printf("%d / %d = %d", n1, n2, n3);
		}else if (op.equals("%")){
			n3 = n1 % n2;
			System.out.printf("%d %% %d = %d", n1, n2, n3);
		}
	}
	}
}