
public class MyString {

	public static void main(String[] args) {
		String hello = "Hello My String";
		String hi = "Hi My String";
		System.out.println(hello);
		
		int Strlength=hello.length();
		System.out.println(Strlength);
		
		String upletter=hello.toUpperCase();
		System.out.println(upletter);
		
		String lowlwtter = hello.toLowerCase();
		System.out.println(lowlwtter);
		
		String addstr=hello + hi;
		System.out.println(addstr);
		
		String strwithint = hello +" "+ "this string length is " + Strlength;
		System.out.println(strwithint);
		
		String movie= "my favorite movie is \"Home alone\"";
		System.out.println(movie);
		
		String trim = hello.trim();
		System.out.println(trim);

	}

}
