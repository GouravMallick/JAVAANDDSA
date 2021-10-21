package recursion;

public class MainClass {
	public static void main(String[] args)
	{
		System.out.println(path(4,4));
	}
	static int sum(int n)
	{
		if(n==1) return 1;
		
		return n+sum(n-1);
	}
	static int pow(int a,int b)
	{
		if(b==0) return 1;
		return a*pow(a,b-1);
	}
	static int path(int m,int n)
	{
		if(m==1 || n==1) return 1;
		
		return path(m-1,n)+path(m,n-1);
	}

}
