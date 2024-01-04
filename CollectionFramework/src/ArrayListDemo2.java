import java.util.*;
public class ArrayListDemo2 {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("Ram");
		al.add("Laxman");
		al.add(100);
		al.add(200);
		
		/// AddAll 
		ArrayList ad_dup = new ArrayList();
		
		ad_dup.addAll(al);
		System.out.println(ad_dup);
		
		
		//RemoveAll
		
		ad_dup.removeAll(al);
		System.out.println(ad_dup);
		
		
		ArrayList as = new ArrayList();
		as.add("X");
		as.add("Y");
		as.add("Z");
		as.add("A");
		as.add("B");
		as.add("C");
		as.add("D");
		
		System.out.println("Before Sorting"+ as);
		// Sorting 
		
		Collections.sort(as);
		System.out.println("After Sorting"+ as);
		
		Collections.sort(as,Collections.reverseOrder());
        System.out.println("Sorting by reverse order "+as);
        
        Collections.shuffle(as);
        System.out.println("After shuffling"+ as);
	}

}
