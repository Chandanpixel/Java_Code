
public class Dog extends Animal {
	
	String color = "Black";
	
	
	
	Dog(){
		super();
		System.out.println("Dogs are Cleaver");
	}
	
	void PrintColor() {
		System.out.println(color);
		System.out.println(super.color);
		
		
	}
	void eating() {
		System.out.println("Dog Eating");
		super.eating();
	}

	public static void main(String[] args) {
	Dog g = new Dog();
	  g.PrintColor();
	  
	  g.eating();

	}

}
