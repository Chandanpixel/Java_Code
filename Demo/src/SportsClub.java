
public class SportsClub {
   
	// instance variable
	long ContactNo;
	String Name;
	String Address;
	
	
	public static void main(String[] args) {
		
		SportsClub s = new SportsClub();  // object creation
		
		//initialization
		
		s.ContactNo = 8658877659L;
		s.Name = "Chandan Sahu";
		s.Address = "Bangalore";
		
  System.out.println(s.Name+ " "+ s.Address+" " + s.ContactNo);
	}

}
