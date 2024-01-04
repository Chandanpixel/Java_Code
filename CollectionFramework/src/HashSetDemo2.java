import java.util.HashSet;
public class HashSetDemo2 {

	public static void main(String[] args) {

		HashSet<Integer> EvenNum = new HashSet<Integer>();
		EvenNum.add(2);
		EvenNum.add(4);
		EvenNum.add(6);
		System.out.println(EvenNum);
		
		//AddAll 
		HashSet<Integer> Nums = new HashSet<Integer>();
		Nums.addAll(EvenNum);
		
		Nums.add(10);
		System.out.println(Nums);
		
		// removeAll
		
		Nums.removeAll(EvenNum);
		System.out.println(Nums);
		
		
	}

}
