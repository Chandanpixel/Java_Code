public class Employee1 {
  String name;
  float salary;
  int Bonus;
  
  Employee1(){
	  this.name="Rahul";
	  this.Bonus=1000;
	  this.salary=20000;
  }
  
  public static void main(String[] args) {
	  Employee1 e = new Employee1();
	  System.out.println(e.name);
}
 
}