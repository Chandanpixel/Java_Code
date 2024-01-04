
public class AddingShort {
public static void main(String[] args) {
	short a=10;
	short b=20;
	// short c=a+b;  compile time error
	
	// After typecasting
	
	
	short c= (short)(a+b);  //20 which is int now converted to short  
	System.out.println(c);
	
}
}
