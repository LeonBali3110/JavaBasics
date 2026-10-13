import java.util.Scanner;

public class MetodesString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String frase = "Esta tambien es una frase valida.";
		System.out.println(frase);
		
		//frase en mayusculas
		String fraseUpper = frase.toUpperCase();
		System.out.println(fraseUpper);
		
		if (frase.equals(fraseUpper)){
			System.out.println("Es igual");
		}else {
			System.out.println("Es diferente");
		}
		
		//Exercici: equalsIgnoreCase()
		
		if (frase.equalsIgnoreCase(fraseUpper)){
			System.out.println("Es igual");
		}else {
			System.out.println("Es diferente");
		}
		
		//length
		int fL = frase.length();
		int fUL = fraseUpper.length();
		if (fL == fUL){
			System.out.println("Es la misma longitud");
		}else {
			System.out.println("No es la misma longitud");
		}
	}
}