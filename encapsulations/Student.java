package encapsulations;

public class Student {
	private int age;
	private String name;
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if(age>20) {
			System.out.println("you are too old");
		}
		else {
		this.age= age;
	}

}
}
