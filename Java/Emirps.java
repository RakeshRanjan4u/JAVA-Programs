package Java;
import java.util.*;
class UtilEmirps
{
	private static ArrayList<Integer> emirp=new ArrayList<Integer>();
	static boolean isEmirps(int n)
	{
		if(emirp.contains(n))
			return true;
		int rev=reverse(n);
		if(isPrime(n) && isPrime(rev))
		{
			emirp.add(n);
			emirp.add(rev);
			return true;
		}
		return false;
	}
	
	private static int reverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			rev=rev*10+n%10;
			n/=10;
		}
		return rev;
	}
	
	private static boolean isPrime(int n)
	{  
	    
		if(n==1)
			return false;
		for(int i=2;i<=(int)(Math.sqrt(n));i++)
			if(n%i==0)
				return false;
		return true;
	}
}



class Emirps
{
	public static void main(String args[])
	{
		System.out.print("Enter no. of emirps you want to print:");
		Scanner obj1=new Scanner(System.in);
		int numOfEmirps=obj1.nextInt();
		int count=0,i=1;
		//UtilEmirps obj=new UtilEmirps();
		while(count<numOfEmirps)
		{
			if(UtilEmirps.isEmirps(i))
			{
				System.out.format("%-5d ",i);
				count++;
				if(count%10==0)
				System.out.println();
			}
			
			i++;
		}
		
		
	}
}














