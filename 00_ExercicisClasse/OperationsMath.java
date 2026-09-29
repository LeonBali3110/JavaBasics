public class OperationsMath {
    public static void main(String[] args) {
		double variable = 9;
		
		double resultat = Math.pow(variable, 10.0);
		System.out.println("Resultat = " + resultat);
		
		double resultat2 = Math.sqrt(variable);
		System.out.println("Resultat2 = " + resultat2);
		
		double round = 2.4;
		System.out.println(System.lineSeparator() + "Original = " + round);
		double ceil = Math.ceil(round);
		System.out.println("Ceil = " + ceil);
	}
}