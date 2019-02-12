package BankAccountApp;

public class Savings extends Account {
	//List properties specific to savings account 
	int safetyDepositBoxID;
	int safetyDepositBoxKey;
	//Constructor to initialize Settings for saving account
	public Savings(String name,String sSN,double initDeposit){
		super(name,sSN,initDeposit);
		accountNumber="1"+accountNumber;
		System.out.println("Saving account holder name is: "+name);

		System.out.println("ACCOUNT NUMBER: "+accountNumber);
	}
	//List any method specific to savings
}
