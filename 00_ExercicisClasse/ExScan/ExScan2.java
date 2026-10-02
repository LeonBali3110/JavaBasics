import java.util.Scanner;

public class ExScan2 {
    public static void main(String[] args) {
		Scanner scanf = new Scanner(System.in);
		
		System.out.printf("Enter first temp: ");
		float x1 = scanf.nextFloat();
		System.out.printf("%nEnter second temp: ");
		float x2 = scanf.nextFloat();
		System.out.printf("%nEnter thrird temp: ");
		float x3 = scanf.nextFloat();
		System.out.printf("%nEnter fourth temp: ");
		float x4 = scanf.nextFloat();
		System.out.printf("%nEnter fifth temp: ");
		float x5 = scanf.nextFloat();
		
		float max1 = Math.max(x1, x2);
		float max2 = Math.max(max1, x3);
		float max3 = Math.max(x3, max2);
		float max4 = Math.max(x4, max3);
		float max5 = Math.max(x5, max4);
		
		float min1 = Math.max(x1, x2);
		float min2 = Math.max(min1, x3);
		float min3 = Math.max(x3, min2);
		float min4 = Math.max(x4, min3);
		float min5 = Math.max(x5, min4);
		
		System.out.printf("%nMax: %.1f", max5);
		System.out.printf("%nMin: %.1f", min5);
		
		scanf.close();
	}
}