
interface Abc{
	int a=10;
	void m1() ;
	
}

interface Bcd {
	int b=20;
	void m2() ;
	
}


public class MultipleInhertance implements Abc,Bcd 
{
	
	public void m1() {
		System.out.println(a);
	}

	public void m2() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		MultipleInhertance test = new MultipleInhertance();
		
	test.m1();
	test.m2();

	}

}
