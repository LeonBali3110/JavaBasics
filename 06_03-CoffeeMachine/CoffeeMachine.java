import java.util.Scanner;

public class CoffeeMachine {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Monthly electricity cost: "); //Costs
		double cEle = scanner.nextDouble();
		
		System.out.println("Monthly coffee machine rental cost: "); //Costs
		double cMaq = scanner.nextDouble();
		
		System.out.println("Number of coffees: "); //Ingresos
		int vCof = scanner.nextInt();
		
		System.out.println("Average coffee price: "); //Ingresos
		double pCof = scanner.nextDouble();
		
		System.out.println("Coffee price per kilo: "); //Costs
		double cCof = scanner.nextDouble();
		
		System.out.println("Kilograms of coffee: "); //Costs
		int kCof = scanner.nextInt();
		
		System.out.println("Milk price per litre: "); //Costs
		double cLlet = scanner.nextDouble();
		
		System.out.println("Liters of milk: "); //Costs
		int uLlet = scanner.nextInt();
		
		//calcul
		double cost = cEle + cMaq + (cCof * kCof) +(cLlet * uLlet);
		double ingresos = vCof * pCof;
		boolean resultat =  cost <= ingresos;
		
		System.out.println("Should we buy the coffee machine? " + resultat);
		
		
		scanner.close();
	}
}