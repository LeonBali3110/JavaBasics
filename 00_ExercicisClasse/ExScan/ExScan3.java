import java.util.Scanner;

public class ExScan3 {
    public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		
		System.out.printf("Enter street number: ");
		int nStreet = scanf.nextInt();
		scanf.nextLine();
		
		System.out.printf("Enter street name: ");
		String sStreet = scanf.nextLine();
		
		System.out.printf("Enter city: ");
		String city = scanf.nextLine();
		
		System.out.printf("Enter country: ");
		String country = scanf.nextLine();
		
		System.out.printf("Enter postal code: ");
		String cp = scanf.nextLine();
		
		System.out.printf("%nYour address is: %n%d %s %n%s %n%s %n%s", nStreet, sStreet, city, cp, country);
		
		scanf.close();
	}
}