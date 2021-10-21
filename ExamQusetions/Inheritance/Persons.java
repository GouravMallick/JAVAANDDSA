package Inheritance;

public class Persons {
	protected String name;
	
	public Persons(String name)
	{
		this.name=name;
		System.out.println("inside person constructor");
	}
	
	public void walk()
	{
		System.out.println("walking");
	}
	
	public void eat()
	{
		System.out.println("eating");
	}
	
	public static void laughing()
	{
		System.out.println("person is laughing");
	}

}
