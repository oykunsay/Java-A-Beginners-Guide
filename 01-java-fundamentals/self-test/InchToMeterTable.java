public class InchToMeterTable {

	public static void main(String[] args) {
		double inches, meters;
		int counter;
		
		counter = 0;
		for(inches = 12; inches <= 144; inches++) {
			meters = inches / 39.37;
			System.out.println(inches + " inches are " + meters + "meters.");
			
			counter ++;
			if(counter == 12) {
				System.out.println();
				counter = 0;
			}
		}

	}

}
