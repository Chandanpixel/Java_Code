import java.util.*;
public class CompareString {

public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter First String");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String");
        String str2 = sc.nextLine();
      
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
       
        // Compare the two strings.
        int result = str1.compareToIgnoreCase(str2);

        // Display the results of the comparison.
        if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
    }
}
