package BankAccountApp;

public class Checking extends Account  {
	
	//List properties specific to Checking account
	private int debitCardNumber;
	private int debitCardPin;
	
	//Constructor to initialize Checking account properties
	public Checking(String name,String sSN,double initDeposit){
		super(name,sSN,initDeposit);
		accountNumber="2"+accountNumber;
		setDebitCard();
	}
	
	public void setRate(){
		rate=getBaseRate()*.15;
	}
	
	private void setDebitCard(){
		debitCardNumber=(int)(Math.random()*Math.pow(10, 12));
		debitCardPin=(int)(Math.random()*Math.pow(10, 4));
	}
	
	//List any method specific to checking account
	public void showInfo(){
		System.out.println("ACCOUNT TYPE: Checking");
		super.showInfo();
		System.out.println(
				"Your Checking Account Features"+
		"\nDebit Card Number: "+debitCardNumber+
		"\nDebit Card Pin: " +debitCardPin
				);
	}
}
