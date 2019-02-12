import java.util.*;
class Arraylist
{ 
    public static void main(String args[])
	{
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("Lamborgini");
		cars.add("Swift");
		cars.add("BMW");
		cars.add("Ferrari");
		cars.add("Volkswagen");
		cars.add("Ford");
		
		if(cars.contains("Ford"))
			System.out.println("Ford is available!");
		/*
		for(int i=0;i<cars.size();i++)
			System.out.print(cars.get(i)+" ");
		
		Collections.sort(cars);
		
		for(String car:cars)
			System.out.println(car);
		
		cars.remove("Ford");
		cars.set(0,"Hyundai");
		for(String car:cars)
			System.out.println(car);
		*/
	}
}