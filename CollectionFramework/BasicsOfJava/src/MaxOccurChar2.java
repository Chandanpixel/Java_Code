import java.util.Scanner;

public class MaxOccurChar2 {
	
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String maxOccStr;
		char maxChar = ' ';
		int i = 0, j = 0, max = -1;
		int[] charFreq = new int[256];
		
		sc= new Scanner(System.in);
		System.out.print("Enter String\n");
		maxOccStr = sc.nextLine();
		
		while(i < maxOccStr.length())
		{
			charFreq[maxOccStr.charAt(i)]++;
			i++;
		}
		while(j < maxOccStr.length()) 
		{
			char ch = maxOccStr.charAt(j);
			if(max < charFreq[ch]) {
				max = charFreq[ch];
				maxChar = ch;
			}
			j++;
		}
		System.out.println("\nThe Maximum Occurring Character = " +  maxChar);
		System.out.format("'%c' Character Occurs in %d Times ", maxChar, max);	
		
	}
}