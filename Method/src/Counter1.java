//Java Program to demonstrate the use of an instance variable  
//which get memory each time when we create an object of the class.  
class Counter1{  
static int count=0; 
//will get memory each time when the instance is created  
  
Counter1(){  
count++;//incrementing value  
System.out.println(count);  
}  
  
public static void main(String args[]){  
//Creating objects  
Counter1 c1=new Counter1();  
Counter1 c2=new Counter1();  
Counter1 c3=new Counter1();  
}  
}  