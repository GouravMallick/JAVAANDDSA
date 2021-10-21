package gfgjava;

public class Power {
	public static void main(String[] args)
	{
		System.out.println(pow(3,5));
	}
	
	static int pow(int x, int n)
	{
		if(n==0) return 1;
		int temp= pow(x,n/2);
		temp=temp*temp;
		if(n%2==0)
		{
			return temp;
		}
		else
		{
			return temp*x;
		}
	}
}
