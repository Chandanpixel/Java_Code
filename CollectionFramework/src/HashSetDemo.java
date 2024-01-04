import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {

		HashSet hs = new HashSet(); // Default capacity is 16 load factor 0.75
		
		hs.add(10);
		hs.add("Welcome");
		hs.add("Dog");
		hs.add(12.13);
		hs.add("True");
		hs.add(null);
		System.out.println(hs); // [null, True, 10, Welcome,12.13, Dog] // Insertion order is not preserved

		//Remove 
		
		hs.remove(12.13);
		System.out.println(hs); // [null, True, 10, Welcome, Dog]
 
		
		//Contains 
		System.out.println(hs.contains("Welcome"));

		
		for(Object e:hs) {
			System.out.println(e);
		}
		
		
	}

}
