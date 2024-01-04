
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num = 454;
int revnum=0;
int reminder;

int originalnum=num;

while(num!=0) {
	reminder=num%10;
	revnum=revnum*10+reminder;
	num /=10;
	
	
}
 
if (originalnum==revnum) {
	System.out.println("Palindrfome");
}
else {
	System.out.println("not palindrome");
}
	}

}
