package BankAccountApp;

public class Checking extends Account  {
	//List properties specific to Checking account
	int debitCardNumber;
	String debitCardPin;
	//Constructor to initialize Checking account properties
	public Checking(String name,String sSN,double initDeposit){
		super(name,sSN,initDeposit);
		accountNumber="2"+accountNumber;
		
	}
	//List any method specific to checking account
	
	public void showInfo(){
		super.showInfo();
		System.out.println("ACCOUNT TYPE: Checking");
	}
}
