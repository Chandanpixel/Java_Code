
public class Exception {

	
	
	public static void main(String[] args) {
		
		System.out.println("Program is started");
		System.out.println("Program is inprogress");
		
		int a=50;
  
		try {
			System.out.println(a/0);  // arthmetic Execption
		}
		catch(ArithmeticException e) {
			
			System.out.println("Entered into catch block");
			
		}
		
		String s = null;
		
		try {
			System.out.println(s.length()); // NullPointerExecption
		}
		
		catch(NullPointerException n) {
			System.out.println("Successfully catch");
		}
		
		
		int [] x= new int[5]; 
		
		try {
			x[6]=10;   // ArrayIndexOutBoundsOfException

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Successfully catch");
		}
		
		String p= "abc";
		try {
			int i =Integer.parseInt(p);      //NumberFormatException

		}
		catch(NumberFormatException e) {
			
			System.out.println("Successfully catch");
		}
//		
//		// If you don't know about which type of exception then follow this one 
//		
//		String w = "Welcome";
//		
//		try {
//			int s1 = Integer.parseInt(w);
//
//		}
//		
//		catch(Exception e )
//		{
//			System.out.println("Successfully catched ");
//		}
		
		
		System.out.println("Program completed");
	}
	
	

}
