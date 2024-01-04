
public class Mobile1 {
	
	void unlock() {
		System.out.println("phone unlock");
	}
	
	 static void call() {
	System.out.println("call the person");
	}

	public static void main(String[] args) {
	
		
		Mobile1 m= new Mobile1();
		System.out.println("Phone start");
		m.unlock();
		m.call();
		m.sendsms();
		System.out.println("phone close");

	}
	
	void sendsms() {
		System.out.println("send sms");
	}

}
