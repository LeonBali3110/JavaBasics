public class CondicionalsDAW1B {
	public static void main(String[] args){
		
		int edat = 121;
		
		if(edat > 120){
			System.out.println("No pot conduir per concell mèdic");
		} else if(edat >= 18){
			System.out.println("Pot conduir");
		}else{
			System.out.println("No pot conduir per menor d'edat");
		}
	}
}