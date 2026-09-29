public class Decimals {
	public static void main(String[] args) {
		double x = 12.3456789;
		int n = 0;
		
		double pot = Math.pow(10.0, n);
		double result = Math.round(x * pot) / pot;
		System.out.println("Rounded to " + n + " decimals: " + (int)result);
		
		n = 2;
		pot = Math.pow(10.0, n);
		result = Math.round(x * pot) / pot;
		System.out.println("Rounded to " + n + " decimals: " + result);
		
		n = 4;
		pot = Math.pow(10.0, n);
		result = Math.round(x * pot) / pot;
		System.out.println("Rounded to " + n + " decimals: " + result);
		
		n = 6;
		pot = Math.pow(10.0, n);
		result = Math.round(x * pot) / pot;
		System.out.println("Rounded to " + n + " decimals: " + result);
	}
}