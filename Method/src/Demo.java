//class Demo{  
// int a=40;  //non static  
//   
// public static void main(String args[]){  
//  System.out.println(a);    // The static method can not use non static data member or call non-static method directly.
// }  
//}   


class Demo{  
 int a=40;//non static  
   
 public static void main(String args[]){  
	 Demo d = new Demo();  
  System.out.println(d.a);  
 }  
}  