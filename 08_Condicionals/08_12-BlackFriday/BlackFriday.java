import java.util.Scanner;

public class BlackFriday {
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the price:");
		double preu = scanner.nextDouble();
		scanner.nextLine();
		
		System.out.println("Do you have a loyalty card? (yes/no):");
		String lC = scanner.nextLine();
		
		if (preu>60){
			if (lC.equalsIgnoreCase("yes")){
				preu = preu - (preu*.2);
			}else{
				preu = preu - (preu*.1);
			}
			
		} else if (preu<=60){
			if (lC.equalsIgnoreCase("yes")){
				preu = preu - (preu*.05);
			}
		}
		//No més poso el System.out aquí perque es redundant en altres llocs
		System.out.printf("Final price: %.2f €", preu);
		scanner.close();
	}
}