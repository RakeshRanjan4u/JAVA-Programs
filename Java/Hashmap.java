import java.util.*;
class Hashmap
{
	public static void main(String args[])
	{
		HashMap<String,Integer> people=new HashMap<String,Integer>();
		people.put("Raj",22);
		people.put("Rakesh",24);
		people.put("Raushan",26);
		people.put("Sonu",28);
		people.put("Mama",30);
		
		people.remove("Mama");
		
		for( String person : people.KeySet() )
			System.out.println(person);
		
	}
}