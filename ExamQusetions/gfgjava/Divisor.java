package gfgjava;

public class Divisor {
	public static void main(String[] args)
	{
		find(15);
	}
	
	static void  find(int n)
	{
		int i;
	
		for( i=1;i*i<=n;i++)
		{
			if(n%i==0)
			{
			System.out.print(i +" ");
			}
		}
			for(; i>=1;i--) 
			{
				if(n%i==0)
				{
				System.out.print(n/i +" ");
				}
			}
		}
		

}

