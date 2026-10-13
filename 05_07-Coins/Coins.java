import java.util.Scanner;

public class Coins {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the amount of moneresidu:");
		int diners = (int)(scanner.nextDouble()*100); //Se conveteix a int perquè no funciona be amb decimals
		
		//monedes d'1
		int qtatMonedes = diners/100;
		int residu = diners%100; //recidu = 56 diners = 256
		System.out.printf("1 euro coins: %d%n", qtatMonedes);
		
		//monedes de 50 centims
		qtatMonedes = residu/50; //1
		residu = residu%50; 
		System.out.printf("50 cent coins: %d%n", qtatMonedes);
		
		//monedes de 20 centims
		qtatMonedes = residu/20;
		residu = residu%20; 
		System.out.printf("20 cent coins: %d%n", qtatMonedes);
		
		//monedes de 10 centims
		qtatMonedes = residu/10;
		residu = residu%10; 
		System.out.printf("10 cent coins: %d%n", qtatMonedes);
		
		//monedes de 5 centims
		qtatMonedes = residu/5;
		diners = diners/5;
		residu = residu%5;
		System.out.printf("5 cent coins: %d%n", qtatMonedes);
		
		//monedes d'1 centim
		qtatMonedes = residu/1;
		System.out.printf("1 cent coins: %d%n", qtatMonedes);

		scanner.close();
	}
}