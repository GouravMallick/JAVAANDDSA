package exceptionhandling;

public class Exception {
	
	public static void main(String[] args)	
	{
	fun1();
	}
	
	public static void fun1()
	{
		int a=5;
		int b=3;
		
		int c=a/b;
		
		System.out.println(c);
		
		try {
		fun2();
		} catch(Exception e)
		{
			System.out.println("occured");
		}
		

	}
	
	public static void fun2() 
	{
		boolean isDanger=true;
		if (isDanger)
		{
			throw new ArrayIndexOutOfBoundsException("warning , alert");
		}
	}

}
