import java.util.*;
public class LinkedLIst {

	public static void main(String[] args) {


		LinkedList ls = new LinkedList();
		
		ls.add("Welcome");
		ls.add("hello");
		ls.add("World");
		ls.add(100);
		ls.add(200);
		System.out.println(ls);
		
		
		
		
		
		ls.remove(2);
		//after removing element
		System.out.println("After removing element"+ ls);
		
		ls.add(2, "Wooo");
		System.out.println(ls);
		
		
		/// retriving value 
		
		System.out.println("retriving "+ ls.get(2));
		
		
		LinkedList <Integer> is = new LinkedList<Integer>();
		is.add(300);
		is.add(200);
		is.add(100);
		System.out.println(is);
		
		LinkedList <String> sl = new LinkedList<String>();
		sl.add("Tcs");
		sl.add("Capgemini");
		sl.add("Wipro");
		
		System.out.println(sl);
		//Adding first and Last element
		
				sl.addFirst("TigerAnalytics");
				sl.addLast("TechMahindra");
				
				System.out.println(sl);

				
				System.out.println(sl.getFirst());  // TigerAnalytics 
				
				System.out.println(sl.getLast()); //TechMahindra
				
		System.out.println(sl.removeLast());  // Remove TechMahindra
		
		System.out.println(sl); 
		
	}

}
