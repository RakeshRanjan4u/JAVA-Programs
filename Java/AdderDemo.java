package Java;
class AdderDemo
{
	public static void main(String args[])
	{
		int n=args.length;
		float sum=0;
		if(n==1 )
			System.out.print("You are supposed to enter more than one arguments,\n Please try again!!");
		while(n-->0)
		{
			sum+=Integer.valueOf(args[n]);
		}		
        System.out.format("Sum of arguments passed = %.2f",sum);		
	}
}