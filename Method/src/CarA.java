
public class CarA {
	
	int price;
	String Brand;
	String color;
	
	 CarA(int price, String Brand , String color){
		this.Brand=Brand;
		this.color=color;
		this.price=price;
	}

	public static void main(String[] args) {
		
		CarA c1 = new CarA(5000000,"Audi","Black");
		CarA c2 = new CarA(6000000,"BMW","Blue");
		CarA c3 = new CarA(7000000,"FERARI","Red");


		System.out.println(c1.price +"  "+ c1.Brand +"    " + c1.color);
		System.out.println(c2.price +"  "+ c2.Brand +"    " + c2.color);
		System.out.println(c3.price +"  "+ c3.Brand +"    " + c3.color);


	}

}
