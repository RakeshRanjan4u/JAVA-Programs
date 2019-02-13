package Java;
import java.io.*;
public class New
{
	public static void main(String [] args) throws IOException
	{
		System.out.println("Hii rakesh!");
		
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(obj.readLine());
		System.out.println("You entered an integer"+num);
	}
}