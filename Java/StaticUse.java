package p1;
class Student
{
	String Name;
	int RollNo;
	
	static String cllgName;
	static int Counter=0;
	
	public Student(String str)
	{
		this.Name=str;
		this.RollNo=setRollNo();
	}
	static int setRollNo()
	{
		return Counter++;
	}
	static void setCllgName(String xyz)
	{
		cllgName=xyz;
	}
	public void getStudentInfo()
	{
		System.out.println("College Name="+cllgName);
		System.out.println("Student's name="+this.Name);
		System.out.println("RollNo.= "+this.RollNo);
	}
}


class StaticUse
{
	public static void main(String args[])
	{
		Student.cllgName="UIT";
		Student std1=new Student("Rakesh");
		Student std2=new Student("Raj");
		Student std3=new Student("Raushan");
		std1.getStudentInfo();
		std2.getStudentInfo();
		std3.getStudentInfo();
	}
}