class Hello implements printable,Showable {
	public void print() {
		System.out.println("Hello");
	}
	
	public void show() {
		System.out.println("Welcome");
	}

	public static void main(String args[]) {
	Hello obj = new Hello();
		obj.print();
		obj.show();
	}
}