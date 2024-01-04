import java.util.*;
public class HashSetDemo3 {

	public static void main(String[] args) {

		HashSet hs1 = new HashSet();
		
		hs1.add(1);
		hs1.add(1);

		hs1.add(2);
		hs1.add(3);
		hs1.add(4);
		
		System.out.println(hs1);     //   [1, 2, 3, 4]

		
		HashSet hs2 = new HashSet();
		 
		hs2.add(3);
		hs2.add(4);
		hs2.add(5);
		hs2.add(6);
		
		System.out.println(hs2);      //[3, 4, 5, 6]

		
		// Union 
		
	//	hs1.addAll(hs2);
		
	//	System.out.println(hs1); // [1, 2, 3, 4, 5, 6]

		
		//intersection
		
		// hs1.retainAll(hs2);
	//	System.out.println(hs1); //[3, 4, 5, 6]

// Difference 
		
		hs1.removeAll(hs2);
		System.out.println(hs1);  //[1, 2]

	
		
		
		
	}

}
