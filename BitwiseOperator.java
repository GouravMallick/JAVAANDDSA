

public class BitwiseOperator {
	public static void main(String[] args)
	{
		int a = 7;
		int b = -5;
		int c = 11;
		
		
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a|c);
		
		a += 3;
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a|c);
		System.out.println(a^c);
	}

}
