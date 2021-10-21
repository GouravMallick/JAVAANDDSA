package gfgjava;

public class PrimeFactor {
	public static void main(String[] args)
	{
	
	 pf(84);
	}
	
	static void pf(int n)
	{
		if(n<=1) return ;
		for(int i=2;i*i<=n ;i++)
		{
			while(n%i==0)
			{
				System.out.print(i+" ");
				n=n/i;
			}
		}
		if(n>1)
		{
			System.out.print(n +" ");
		}
	}

}
