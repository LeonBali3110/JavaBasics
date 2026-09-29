public class TripleJumpRecord {

	public static void main(String[] args) {
		// Current record
		double record = 18.29;
		
		// Player records
		double jump1 = 15.58;
		double jump2 = 18.35;
		double jump3 = 17.26;
		double jump4 = 18.31;
				
		// Get new record 
		double cal1 = Math.max(jump1, jump2);
		double cal2 = Math.max(cal1, jump3);
		double newRecord = Math.max(cal2,jump4);
		
		
		// Display the new record
		System.out.println("The current record is now " + newRecord + " meters");
		
		// Display the next integer value
		double ceil = Math.ceil(newRecord);
		System.out.println("The current record is below " + (int)ceil + " meters");
		
		
		// Display the previous integer value
		double floor = Math.floor(newRecord);
		System.out.println("The current record is above " + (int)floor + " meters");
		

	}

}