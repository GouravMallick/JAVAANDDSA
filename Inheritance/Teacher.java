package Inheritance;

public class Teacher extends Persons {
	public Teacher(String name)
	{
		super(name);
		System.out.println("inside teacher constructor");
	}
	
	public void teach()
	{
		System.out.println("teaching");
	}
	public static void laughing()
	{
		System.out.println("teacher is laughing");

	}
	
	public void eat()
	{
		super.eat();
		System.out.println("teacher is eating");
	}

}
