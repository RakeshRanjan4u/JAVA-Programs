package Java;
public class Test
{
	//int x=55;
	public static void main(String args[])
	{
		int n =3;
		for(int i=1,flag1=0;i<=n&&i>0;)
		{
			for(int j=n;j>i;j--)
				System.out.print("  ");
			for(int j=1,flag=0; j<=i && j>=1; )
			{
				System.out.print(j+" ");
				if(i==j)
					flag=1;
				if(flag==1)
					j--;
				else 
					j++; 
			}
			System.out.println();
			
			if(i==n)
					flag1=1;
			if(flag1==1)
				i--;
			else 
				i++; 
		}
	}
}