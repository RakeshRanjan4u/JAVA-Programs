package BankAccountApp;

public class BankAccountApp {

	public static void main(String[] args) {
		Checking chk1=new Checking("Rakesh Ranjan ","123456789",1500);
		
		Savings sav1=new Savings("Rakesh Sharma","123546789",1300);
		sav1.showInfo();
		System.out.println("**************");
		chk1.showInfo();
		// Read a CSV File then Create new accounts based on that data
		

	}

}
