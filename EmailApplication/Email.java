package EmailApplication;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int defaultPasswordLength=8;
	private int mailboxCapacity=100;
	private String alternateEmail;
	private String companySuffix="rivigo";
	
	//Constructor to receive first and last name
	public Email(String name1, String name2)
	{
		this.firstName=name1;
		this.lastName=name2;
		//System.out.println("Email Created: "+this.firstName+" "+this.lastName);
	    this.department=setDepartment();
	    //System.out.println("Department:" +this.department);
	    
	    //Call a method which returns a random password
	    this.password=randomPassword(defaultPasswordLength);
	    System.out.println("Your Password is: "+this.password);
	    email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"+department+"."+companySuffix+".com";
		System.out.println("Your Email is: "+this.email);
	}
	//Ask for department
	private String setDepartment(){
		System.out.print("New Worker "+firstName+"\nDepartment Codes:\n1- Sales\n2- Accounting\n3- Developement\n0- For none\nEnter Department code:" );
		Scanner in=new Scanner(System.in);
		int depChoice =in.nextInt();
		if(depChoice==1){return "Sales";}
		else if(depChoice==2){return "Acct";}
		else if(depChoice==3){return "Dev";}
		else { return "";}
	}
	//Generate a random password
	private String randomPassword(int length){
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$%^&*()";
		char [] password=new char[length];
		for(int i=0;i<length;i++){
			int rand=(int)(Math.random()*passwordSet.length());
		    password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//Set mail box capacity
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity=capacity;
	}
	//Set the alternate email
	public void setalternateEmail(String altEmail){
		this.alternateEmail=altEmail;
	}
	//Change the password
	public void changePassword(String password){
		this.password=password;
	}
	
	public int getMailboxCapacity(){return mailboxCapacity;}
	public String getAltEmail(){return alternateEmail;}
	public String getPassword(){return password;}
	
	public String showInfo(){
		return "Display Name: "+ firstName +" "+lastName+
				"\nCompany Email: "+email +
				"\nAlternate Email: "+alternateEmail+
				"\nMailbox Capacity: "+mailboxCapacity+"mb";
	}
}
