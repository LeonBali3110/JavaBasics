import java.util.Scanner;

public class ExScan4 {
    public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		
		System.out.println("Enter 5 cities separated by spaces: ");
		String c1 = scanf.next();
		String c2 = scanf.next();
		String c3 = scanf.next();
		String c4 = scanf.next();
		String c5 = scanf.next();
		
		System.out.printf("%nCities: %n%s %n%s %n%s %n%s %n%s", c1, c2, c3, c4, c5);
		
		scanf.close();
	}
}