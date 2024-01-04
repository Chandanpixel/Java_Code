import java.util.*;
public class ArrayToArrayList {

	public static void main(String[] args) {
//Coverting Array into ArrayList 
		
		String arr [] = {"Dog","Monkey","cat"};
		
	for(String value:arr) {
		System.out.println(value);
	}
	
	ArrayList al = new ArrayList(Arrays.asList(arr));
	System.out.println(al);
	
	}

}
