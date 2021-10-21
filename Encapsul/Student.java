package Encapsul;

public class Student {
	
	private int age;
	private String name;
	
	public int getAge()
	{
		return age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age)
	{
		if(age>20)
		{
			System.out.println("eligible to vote");
		}
		else {
		this.age=age;
		}
	}

}
