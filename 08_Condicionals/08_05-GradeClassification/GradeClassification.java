import java.util.Scanner;

public class GradeClassification {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Demanen la calificació
		System.out.println("Enter the numeric grade (0-100):");
		int grade = scanner.nextInt();
		
		if (grade <= 100 && grade>=90){
			System.out.println("A = Excellent");
		}else if (grade < 90 && grade>=70){
			System.out.println("B = Good");
		}else if (grade < 70 && grade>=60){
			System.out.println("C = Satisfactory");
		}else if (grade < 60 && grade>=50){
			System.out.println("D = Pass");
		}else if (grade < 50 && grade>=0){
			System.out.println("F = Fail");
		}else {
			System.out.println("Invalid grade");
		}
		
		scanner.close();
	}
}