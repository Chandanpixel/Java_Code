//Creating a test class to deposit and withdraw amount  
	class TestAccount extends Bank{  
	public static void main(String[] args){  
	Bank a1=new Bank();  
	
	a1.insert(832345,1000,"Ankit");  
	a1.display();  
	a1.checkBalance();  
	a1.deposit(40000);  
	a1.checkBalance();  
	a1.withdraw(15000);  
	a1.checkBalance();  
	}
	
	} 