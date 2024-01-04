import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		
	// Declare a HashMap
		// HashMap hm = new HashMap();
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		hm.put(101, "Smith");
		hm.put(102, "Scott");
		hm.put(103, "David");
		hm.put(104, "John");

		System.out.println("Before removing pair"+hm);
		
		hm.remove(103);
		System.out.println("after removing pair"+hm);

		hm.put(103, "David");

		System.out.println(hm);
		
		
		// reading pairs using for loop 
		for(Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+ " "+ m.getValue());
		}
	}

}
