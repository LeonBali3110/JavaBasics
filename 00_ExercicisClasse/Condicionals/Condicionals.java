public class Condicionals {
	public static void main(String[] args){
		
		int edat = 7;
		System.out.println("Si tinc " + edat + " doncs lo que he de fer:");
		//Si es major d'edat --> anirà a CFGS
		//Si es menor d'edat --> anirà el cole
		//Si te 25 o més anys --> anirà a la feina
		
		
		/*if (edat < 18){
			System.out.println("Ves a l'escola");
		}else{
			if (edat >= 25) {
				System.out.println("Ves a traballar");
			}else{
				System.out.println("Ves al'institut");
			}
		}*/
		
		
		//versió simplificada (mijor)
		if (edat < 18){
			System.out.println("Ves a l'escola");
		}else if (edat >= 25) {
				System.out.println("Ves a traballar");
		}else{
			System.out.println("Ves al'institut");
		}
		System.out.println("Gràcies");
	}
}