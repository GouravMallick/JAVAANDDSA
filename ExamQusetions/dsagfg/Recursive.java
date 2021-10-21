package dsagfg;

public class Recursive {

	public static void main(String[] args) {
		
		System.out.println(checkZero(251));
	

	}
	static int fact(int n)
	{
		int result=1;
		for(int i=2;i<=n;i++)
		{
			result*=i;
		}
		return result;
	}
	static int recFact(int n)
	{
		if(n==0) return 1;
		return n*recFact(n-1);
	}
	static int checkZero(int n)
	{
		int result=0;
		for(int i=5; i<=n; i=i*5)
		{
			result=(result+(n/i));
		}
		return result;
	}

}
