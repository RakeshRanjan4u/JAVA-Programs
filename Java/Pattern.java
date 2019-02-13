package Java;
import java.util.Scanner;
class Pattern{
	public static void main(String args[])
	{
		System.out.println("Enter pattern Size:");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt(),space=n/2;
		
		for(int i=1;i<=n+space;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=space && j%2==0)
					System.out.print("  ");
				else if(i>n && j%2!=0)
					System.out.print("  ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}