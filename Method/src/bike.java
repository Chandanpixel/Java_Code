class bike extends Vehicle {
	void run() {
		System.out.println("Bike is running");
	}
	
	public static void main(String[] args) {
		
		bike obj = new bike();
		obj.run();
	}
}