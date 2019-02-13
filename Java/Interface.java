package Java;
interface animal1
{
	String color="Brownish";
	public void eats();
}
interface Animal2
{
	public void animalSound();
	public void sleep();
}

class Pig implements Animal2,animal1
{
	public void animalSound()
	{
		System.out.println("Pin sounds Oink");
	}
	public void sleep()
	{
		System.out.println("Pig sleeps for 8 hrs");
	}
	public void eats()
	{
		System.out.println("Pig eats wastes and it's colour is :"+color );
	}
}

class Interface{
	public static void main(String args[])
	{
		Pig pig1=new Pig();
		pig1.animalSound();
		pig1.sleep();
		pig1.eats();
	}
}

