package Interface;

public class Person implements Student,Youtuber {
	
	public static void main(String[] args)
	{
		Person p= new Person();
		p.study();
		p.makeVideo();
		
	}
	public void study()
	{
		System.out.println("person is studying");
		
	}
	
	public void makeVideo()
	{
		System.out.println("person is making videos");
	}

}
