
public class Student {
	String name;
	double perc;
	
	Student(String name, double perc){
		this.name=name;
		this.perc=perc;
	}

	public static void main(String[] args) {
		
		Student s1= new Student("Chandan" , 69.33);
		Student s2= new Student("Bikash",75.90);
		
		System.out.println(s1.name +" " + s1.perc);
		System.out.println(s2.name +" " + s2.perc);
		
		

	}

}
