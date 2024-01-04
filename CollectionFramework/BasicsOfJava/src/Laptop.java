
public class Laptop {
	
	String Brand;  // instnce variable 
	
	Laptop(String Brand)
	{
		this.Brand=Brand;
	}

	public static void main(String[] args) {
     Laptop l1 = new Laptop("Dell");
     System.out.println(l1.Brand);
     
     Laptop l2 = new Laptop("Hp");
     System.out.println(l2.Brand);
		

	}

}
