
public abstract class TestSwitch implements Iswitch {

	public static void main(String[] args) {

		Iswitch sw = new LedBulbImpl();
		sw.switchon();
		sw.switchoff();
		
	}

}
