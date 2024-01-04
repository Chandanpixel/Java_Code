
public class MyArray {

	public static void main(String[] args) {
   
		String[] Player = {"Rohit","Rahul","Ishan"};
		System.out.println(Player[0]);
		
//		Player[0]="MS Dhoni";
//		System.out.println(Player[0]);
		
		System.out.println("There are " + Player.length +" "+ "player in the field");
		
		for(int i=0; i< Player.length; i++) {
			System.out.println(Player[i]);
		}
	}

}
