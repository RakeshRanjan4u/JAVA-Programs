class DecFloatConv
{
	public static void main(String args[])
	{
		float num=10101.101f;	
		System.out.println("DEcimal value of"+ num +"is :"+ConvUtil(num));
	}
	
	static float ConvUtil(float n)
	{
		System.out.println(n);
		int temp=(int)n;
		n=n-(float)temp;
		
		System.out.println(temp);
		return n;
	}
}