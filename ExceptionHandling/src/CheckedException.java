
public class CheckedException {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Program started");
		System.out.println("Program in progress");
		
		// Interrupted Exception Handling
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
		}
		
		System.out.println("wait is over ");
		
		Thread.sleep(5000);
		
		System.out.println("Program completed");
		System.out.println("Program termineted ");


		
	}

}
