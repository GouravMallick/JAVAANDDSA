package oops;

public class MyConstructors {
	
	MyConstructors()
	{
		System.out.println("object is created");
	}
	
	public static void main(String[] args)
	{
		Vehicle car= new Vehicle(4);
		Vehicle scotter= new Vehicle(2);
		
		Vehicle rikshaw=new Vehicle(3,"yellow");
		
		System.out.println(rikshaw.wheels+ "   "+ rikshaw.color);
		
		
		System.out.println(car.wheels);
		System.out.println(scotter.wheels);
		
	}

}

class Vehicle
{
	int wheels;
	int lights;
	String color;
	
	Vehicle(int wheels)
	{
		this.wheels=wheels;
		lights=2;
	}
	
	Vehicle(int wheels,String color)
	{
		this.wheels=wheels;
		this.color=color;
		lights=2;
	}
}
