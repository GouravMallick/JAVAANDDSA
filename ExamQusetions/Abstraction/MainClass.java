package Abstraction;

public class MainClass {
	
	public static void main(String[] args)
	{
		Waganor w= new Waganor();
		Audi a= new Audi();
		
		repair(w);
		repair(a);
		
	}
	
	public static void repair( Cars c)
	{
		System.out.println("car is repaird");
	}


}
