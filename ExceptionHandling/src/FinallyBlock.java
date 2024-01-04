
public class FinallyBlock {

	public static void main(String[] args) {

		
		System.out.println("Programm started");
		
		int a = 100;
		
		try {
			System.out.println(a/0);

		}
		
		catch(ArithmeticException e) {
			System.out.println("Entered into catch block ");
		}
		
		finally {
			System.out.println("finally block executed ");
		}
		System.out.println("Programm ended");
	}

	

	}

