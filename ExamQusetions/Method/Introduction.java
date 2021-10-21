package Method;

public class Introduction {
	
	public static void main(String[] args)
	{
		int firstNo=23;
		int secondNo=56;
		
		int result=maxOf(firstNo,secondNo);
		System.out.println(result);
		
		sayHi();
		
	}
	
	static int maxOf(int a, int b)
	{
		if(a>b)
		{
			return a;
		}
		else 
		{
			return b;
		}
		
	}
	
	static void sayHi()
	{
		System.out.println("hi, good morning");
	}

}
