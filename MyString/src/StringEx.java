
public class StringEx {

	public static void main(String[] args) {
		String str="mam";
		String s="";
		
		char[] ch=str.toCharArray();
		
		
		
		
		
		
		int len=str.length();
		for(int i=str.length();i>0;i++) {
			s=s+str.charAt(i);
			
		}
		if(s.equals(str)) {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
		
	}
}
