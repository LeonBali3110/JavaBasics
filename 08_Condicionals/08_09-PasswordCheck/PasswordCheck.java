import java.util.Scanner;

public class PasswordCheck {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		String cPass = "jupiter4321";
		
		System.out.println("Enter your password:");
		String pass = scanner.nextLine();
		
		if (pass.equals(cPass)){
			System.out.println("Access granted. Welcome!");
		}else {
			System.out.println("Incorrect password. Try again.");
			System.out.println("Enter your password:");
			pass = scanner.nextLine();
			if (pass.equals(cPass)){
				System.out.println("Access granted. Welcome!");
			}else {
				System.out.println("Incorrect password. Try again.");
				System.out.println("Enter your password:");
				pass = scanner.nextLine();
				if (pass.equals(cPass)){
					System.out.println("Access granted. Welcome!");
				} else{
					System.out.println("Your account is locked. Please contact your administrator.");
				}
				}
		
		scanner.close();
	}
}
}