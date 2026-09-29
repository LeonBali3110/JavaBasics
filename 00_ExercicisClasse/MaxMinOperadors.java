public class MaxMinOperadors{
	public static void main (String[] arg){
		System.out.println("1. Exercici MAX");
		
		int num1 = 5;
		int num2 = 12;
		int num3 = 52;
		
		int mesGran = Math.max(num1,num2);
		
		System.out.println("El nombre més gran de "+num1+" - "+num2+" és = "+mesGran);
		
		int resultat = Math.max(mesGran,num3);
		
		System.out.println("El nombre més gran de "+mesGran+" - "+num3+" és = "+resultat);
		
			System.out.println("1. --Exercici Min--");
		
		int mesPetit = Math.min(num1,num2);
		
		System.out.println("El nombre més petit de "+num1+" - "+num2+" és = "+mesPetit);
		
		int resultat2 = Math.min(mesPetit,num3);
		
		System.out.println("El nombre més petit de "+mesPetit+" - "+num3+" és = "+resultat2);
	}
}