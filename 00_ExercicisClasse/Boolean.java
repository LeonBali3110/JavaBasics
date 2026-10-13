public class Boolean {
	public static void main(String[] args){
		/*
		Operadors Comparatius:
		>=
		<=
		==
		!=
		
		&& --> (and)
		|| --> (or)
		^  --> (or exclusiu: donara false si es (true i true))
		!  --> (negate): (!true -->false) i (!false --> true)
		
		*/
		
		int edat = 18;
		boolean esMenorEdat = edat < 18;
		boolean esMajorEdat = edat >= 18;
		boolean esJustMajorEdat = edat == 18;
		
		boolean teCarnet = true;
		
		boolean potLlogar = edat >= 18 && teCarnet;
		
		//System.out.println("És menor d'edat: " + esMenorEdat);
		//System.out.println("És major d'edat: " + esMajorEdat);
		//System.out.println("Te 18 anys: " + esJustMajorEdat);
		
		System.out.println("Pot Llogar: " + potLlogar);
	}
}