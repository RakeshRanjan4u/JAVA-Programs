package BankAccountApp;

public abstract class Account implements IBaseRate {
	//List common properties for checking and savings
	private String name;
	private String sSN;
	double balance;
	
	protected String accountNumber;
	protected double rate;
	private static int index=10000;
	
	
	//Constructor to set base properties and initialize the account
	public Account (String name ,String sSN,double initDeposit)
	{
		this.name=name;
		this.sSN=sSN;
		balance=initDeposit;
		
		//Set Account Number
		accountNumber=setAccountNumber();
		
		setRate();
	}
	
	public abstract void setRate();
	
	private String setAccountNumber(){
		String lastTwoOfSSN=sSN.substring(sSN.length()-2,sSN.length());
		int uniqueID=index++;
		int randomNumber=(int)(Math.random()*Math.pow(10,3));
		return lastTwoOfSSN+uniqueID+randomNumber;
	}
	
	public void compound(){
		double interest=balance*(rate/100);
		balance+=interest;
		System.out.println("Interest Accrued: $"+interest);
		printBalance();
	}
	
	
	//List common methods
	public void deposit(double amount){
		balance+=amount;
		System.out.println("Depositing: $" + amount);
	}
	public void withdraw(double amount){
		balance-=amount;
		System.out.println("Withdrawing: $"+amount);
	}
	public void transfer(String toWhere,double amount){
		balance-=amount;
		System.out.println("Transferring $" + amount + " to "+ toWhere);
	}
	public void printBalance(){
		System.out.println("Your current Balance is: $"+balance);
	}
	
	public void showInfo(){
		System.out.println( 
				"NAME: "+ name +
				"\nACCOUNT NUMBER: "+accountNumber+
				"\nBALANCE: "+balance +
				"\nRate: "+ rate +"%"
				);
	}
	
}
