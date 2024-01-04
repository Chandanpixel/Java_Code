class Bike9 {
	int speedlimit = 90;// final variable

	void run() {
		speedlimit = 600;
	}

	public static void main(String args[]) {
		Bike9 obj = new Bike9();
		obj.run();
	}
}