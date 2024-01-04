
public class Product {
	int price,qty;
	String type;
	Product(int price,String type,int qty){
		this.price=price;
		this.qty=qty;
		this.type=type;
		
	}
	public static void main(String[] args) {
		Product p1=new Product(5000,"plastic",5);
		System.out.println(p1.qty +" "+ p1.type +" "+ p1.price);
	}

}
