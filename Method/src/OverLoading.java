
public class OverLoading {
	
	void sum(int a , double b) {
		
		System.out.println("sum is" + " " + (a+b));
	}
	
	void sum(int a, int b, int c) {
		
		System.out.println("sum is" + " "+ (a+b+c));
	}

	public static void main(String[] args) {
		
		OverLoading obj = new OverLoading ();
		
	    obj.sum(10,40.7);
	    obj.sum(10, 20, 30);

	}

}
