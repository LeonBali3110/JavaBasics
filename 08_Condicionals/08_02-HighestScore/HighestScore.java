import java.util.Scanner;

public class HighestScore {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Demanen las puntuacions
		System.out.println("Enter the score of the first player:");
		int j1 = scanner.nextInt();
		System.out.println("Enter the score of the second player:");
		int j2 = scanner.nextInt();
		System.out.println("Enter the score of the third player:");
		int j3 = scanner.nextInt();
		System.out.println("Enter the score of the fourth player:");
		int j4 = scanner.nextInt();
		
		
		//Fem les comparacións
		if (j1 >= j2 && j1 >= j3 && j1 >= j4){
			System.out.println("The highest score is: " + j1);
		}else if (j2 >= j1 && j2 >= j3 && j2 >= j4){
			System.out.println("The highest score is: " + j2);
		}else if (j3 >= j1 && j3 >= j2 && j3 >= j4){
			System.out.println("The highest score is: " + j3);
		}else{
			System.out.println("The highest score is: " + j4);
		}
	}
}