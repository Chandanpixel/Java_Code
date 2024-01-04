import java.util.ArrayList;
import java.util.Iterator;
public class CollectionDemo {
	
	// Example of ArrayList

	public static void main(String[] args) {

		// Declare a ArrayList
		ArrayList al = new ArrayList();
		al.add("Ram");
		al.add("Sita");
		al.add(100);
		al.add(10.5);
		al.add(true);
		
		System.out.println(al);

		
		
		
		//Remove object by using index
		al.remove(1);
		System.out.println(al);

		// add object 
		
		al.add(1, "Sita");
		System.out.println(al);


		ArrayList<Integer> all = new ArrayList<Integer>();
		all.add(100);
		all.add(200);
		all.add(300);
		
	    // By using for loop iteretor  - Read value 
		
        System.out.println("Reading element by using for  loop");

        
        
        
        for(int i=0; i<=all.size()-1;i++) {
       	 System.out.println(all.get(i));
        }
		
		System.out.println(all);
		 System.out.println( all.size());
		 
		 // get object 
		 
		 System.out.println(all.get(1));

		 
		 // set object 
		 all.set(1, 800);
		 System.out.println( all.set(1, 800));
		 
         ArrayList<String> as = new ArrayList<String>();
         as.add("Laxman");
         as.add("Bharat");
         as.add("Satrughna");
         
         System.out.println(as);

         // Remove object by object name 
         as.remove("Satrughna");
         
         as.contains("Laxman");
         
         System.out.println(as.contains("Laxman"));
         
         System.out.println(as);
         
         // Iteretor 
         
         // By using for loop iteretor 
         System.out.println("Reading element by using for  loop");
         
         for(int i=0; i<=as.size()-1;i++) {
        	 System.out.println(as.get(i));
         }
         
         System.out.println("Reading element by using for each loop");
         
         // By using for each loop 
         for(Object e:as) {
        	 System.out.println(e);
         }
         
         System.out.println("Reading element by using iteretor");
         
         Iterator it =  as.iterator();
         while(it.hasNext());
         
         System.out.println(it.hasNext());

	}

}
