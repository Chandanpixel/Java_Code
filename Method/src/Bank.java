
public class Bank {
	int accno;
	float amt;
	String accName;
	
	void insert(int aNo,float rs ,String name) {
		accno=aNo;
		amt=rs;
		accName=name;
	}
	void deposit(float rs) {
		amt=amt+rs;
		System.out.println(rs+ "is"+ "deposited");
		
		
	}
	//withdraw method  
	void withdraw(float rs){  
	if(amt<rs){  
	System.out.println("Insufficient Balance");  
	}else{  
	amt=amt-rs;  
	System.out.println(amt+" withdrawn");  
	}  
	}  
	


	//method to check the balance of the account  
	void checkBalance(){System.out.println("Balance is: "+amt);}  
	//method to display the values of an object  
	void display(){System.out.println(accno+" "+ accName+" "+amt);}  
	}  
	 
	


