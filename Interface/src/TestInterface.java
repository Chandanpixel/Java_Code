//Using interface: by third user  
abstract class TestInterface implements Drawable {
	public static void main(String args[]) {
		Drawable d = new Circle();
		d.draw();
	}
}
