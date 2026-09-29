/*
Fer un programa que donat un nombre d'alumnes els divideixi es elnombre de classes.
El resultat serà elsalumnes eb cada classe
*/

public class Variables{
	public static void main (String[] args) {
		
		System.out.println("A programa!");
		
		//Variable 27 alumnes
		//tipoDeDada nomVariable = _valor_;
		double numAlum = 27;
		short numClasses= 2;
		
		double numTotalClasse = numAlum / numClasses;
		
		System.out.println("Número total classe: " + numTotalClasse);
	}
}