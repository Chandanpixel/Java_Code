import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
	//	How to declary in ArrayList 
		
		ArrayList list1 = new ArrayList(); // we can store in any type of element 
		
	//	ArrayList<String> list1 = new ArrayList<String>();   // String
		
		  ArrayList<Integer> list2 = new ArrayList<Integer>(); //Integer
		  
		// Adding value to ArrayList
		  
         list1.add("Chandan");
         list1.add("Bikash");
         list1.add("Deepak");
         list1.add("Chintu");
         list1.add(10);
         
         // find out the size of arraylist
         System.out.println(list1.size());

         
         
         System.out.println("Before removing element " + list1);  // Read the value 
         
         
         list1.remove(1);
         System.out.println(list1.size());

         
         System.out.println("after removing element "+ list1); 
         
         // Inserting new element into arraylist 
         
         list1.add(1, "Ajay");
         System.out.println("after inserting element "+ list1);
         
         System.out.println(list1.size());

         
         // read values from arraylist by using for loop
         
//         for(String s:list1) {
//        	 System.out.println(s);
//         }
//         

	}

}
