package StudentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		//Ask how many students do you want to enroll:
		System.out.println("Enter number of new students to enroll: ");
		Scanner in=new Scanner(System.in);
		int numOfStudents=in.nextInt();
		Student [] students=new Student[numOfStudents];
		
		//Create n number of different students
		for(int n=0;n<numOfStudents;n++)
		{
			students[n]=new Student();
			students[n].enroll();
			students[n].payTution();
			
		}
		System.out.println(students[0].showInfo());
		System.out.println(students[1].showInfo());
		
	}

}
