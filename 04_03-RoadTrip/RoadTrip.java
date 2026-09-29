public class RoadTrip {
    public static void main(String[] args) {
		//Dades
		double d = 347.8; //distancia
		double c = 6.7; //combustible en litres per 100km
		double preuG = 1.92; // preu gasolina
		int amics = 4; //passatgers
		double preuP = 12.65; //peatges d'anada
		double m = 30; //menjar durant el trajecte
		double preuA = 18.5; ///aparcament
		
		//Calculs (anada i tornada)
		double dTotal = d * 2; //distancia total
		double C = (dTotal/100) * c; //combustible necessari
		double cTotal = C * preuG; //cost total del combustible
		double pTotal = preuP * 2; //cost total del peatges
		//el aparcament será el mateix
		double mTotal = m * 2; //cost total del menjar
		double total = cTotal + preuA + pTotal + mTotal; //cost total
		double totalAmic = total / amics; // cost per persona
		
		//Text
		String t1 = "Round trip distance:";
		String t2 = "Fuel needed:";
		String t3 = "Fuel cost:";
		String t4 = "Tolls:";
		String t5 = "Parking price:";
		String t6 = "Food:";
		String t7 = "Total trip cost:";
		String t8 = "Passengers:";
		String t9 = "Cost per passenger:";




		
		System.out.printf("=========== ROAD TRIP ===========%n");
		System.out.printf("%-20s%10.2f km%n", t1, dTotal);
		System.out.printf("---------------------------------%n");
		System.out.printf("%-20s%10.2f L%n", t2, C);
		System.out.printf("%-20s%10.2f €%n", t3, cTotal);
		System.out.printf("---------------------------------%n");
		System.out.printf("%-20s%10.2f €%n", t4, pTotal);
		System.out.printf("%-20s%10.2f €%n", t5, preuA);
		System.out.printf("%-20s%10.2f €%n", t6, mTotal);
		System.out.printf("---------------------------------%n");
		System.out.printf("%-20s%10.2f €%n", t7, total);
		System.out.printf("%-20s%10d%n", t8, amics);
		System.out.printf("%-20s%10.2f €%n", t9, totalAmic);
		System.out.printf("=================================%n");
		
	}
}