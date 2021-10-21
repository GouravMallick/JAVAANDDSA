package BitMagic;

public class PowerOfTwo {
	public static void main (String[] args)
	{
		System.out.println(isPower(4));
	}
	static boolean isPower(int n)
	{
		if(n==0)
			return false;
		
		return((n&(n-1))==0);
	}
}
