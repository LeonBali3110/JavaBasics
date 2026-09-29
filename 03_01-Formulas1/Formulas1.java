public class Formulas1 {
    public static void main(String[] args) {

        double a = 25.5;
		double b = 50.67;
		double c = 2.0;
		double d = 10.5;
		double e = -2.5;
		double f = 13.6;
		double h = Math.PI; //(constant PI que suministra Java, el seu valor equival a 3.141592653589793)
		
		double f1 = Math.sqrt(a) + Math.pow(b, 4.0) / c;
		//Math.sqrt = arrel quadrada
		//Math.pow = Poténcia -> Math.pow(Base, Exponente)
		
		System.out.println("Formula 1 = " + f1);
		
		double f2 = 2 * h * ((Math.pow(d, 3.0) - Math.pow(e, 4.0)) / (f - h));
		
		System.out.println("Formula 2 = " + f2);
    }
}