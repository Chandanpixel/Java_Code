public class Employee {
  String name;
  float salary;
  int Bonus;
  
  Employee(){
	  this.name="Rahul";
	  this.Bonus=1000;
	  this.salary=20000;
  }
  
  public static void main(String[] args) {
	  Employee e = new Employee();
	  System.out.println(e.name);
}
 
}