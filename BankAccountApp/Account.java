package BankAccountApp;

public abstract class Account implements IBaseRate {
	//List common properties for checking and savings
	String name;
	String sSN;
	double balance;
	
	String accountNumber;
	double rate;
	static int index=10000;
	
	
	//Constructor to set base properties and initialize the account
	public Account (String name ,String sSN,double initDeposit)
	{
		this.name=name;
		this.sSN=sSN;
		balance=initDeposit;

		//System.out.println("NAME: "+name+"SSN:= "+sSN+"BALANCE= "+ balance);
	
		//Set Account Number
		accountNumber=setAccountNumber();
	}
	
	private String setAccountNumber(){
		String lastTwoOfSSN=sSN.substring(sSN.length()-2,sSN.length());
		int uniqueID=index++;
		int randomNumber=(int)(Math.random()*Math.pow(10,3));
		return lastTwoOfSSN+uniqueID+randomNumber;
		
	}
	
	//List common methods
	public void showInfo(){
		System.out.println( 
				"NAME: "+ name +
				"\nACCOUNT NUMBER: "+accountNumber+
				"\nBALANCE: "+balance
				);
	}
	
}
