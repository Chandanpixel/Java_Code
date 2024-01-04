
interface A 
{
	int a=10;
	void m() ;
		
	
}



public class Test implements A {
	
	public void m() {
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		A a = new Test();
		a.m();

	}
	
}