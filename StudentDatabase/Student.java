package StudentDatabase;

import java.util.Scanner;

public class Student 
{
	private String firstName;
	private String lastName;
	private String studentID;
	private int gradeYear;
	private String courses=null;
	private int tutionBalance;
	private static int costOfCourse=600;
	private static int id=1000;
	
	//Constructor: prompt user to enter student's name and year
	public Student()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName=in.nextLine();
		
		System.out.print("Enter student's last name: ");
		this.lastName=in.nextLine();
		
		System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student's class level: ");
		this.gradeYear=in.nextInt();
		
		setStudentID();
		
		//System.out.println(firstName+" "+lastName+" "+gradeYear+" "+studentID);
		
	}
	//Generate ID-
	private void setStudentID(){
		//Grade Level + ID
		id++;
		this.studentID= gradeYear+"-"+id;
	}
	
	//Enroll in Courses
	public void enroll(){
		do{
		System.out.print("Enter Course to enroll (Q to quit): ");
		Scanner in=new Scanner(System.in);
		String course=in.nextLine();
		if(!course.equals("Q")){
			courses=courses+ "\n  "+course;
			tutionBalance+=costOfCourse;
		}
		else
			break;
		}while(1!=0);
		//System.out.println("ENROLLED IN: "+courses);
		//System.out.println("TUTION BALANCE: $"+tutionBalance);
	}
	//View Balance
	public void viewBalance(){
		System.out.println("Your balance is: $"+tutionBalance);
	}
	
	//Pay Tution
	public void payTution(){
		System.out.print("Enter amount to pay($):");
		Scanner in =new Scanner(System.in);
		int payment=in.nextInt();
		tutionBalance-=payment;
		System.out.println("Thank You For your payment of $"+payment);
		viewBalance();
	}
	//Show Status
	public String showInfo()
	{
		return "Name: "+firstName+ " " +lastName+
				"\nStudent ID: "+studentID +
				"\nGradeLevel: "+gradeYear +
				"\nCourses Enrolled: "+courses +
				"\nBalance: $" + tutionBalance;
 	}
}
