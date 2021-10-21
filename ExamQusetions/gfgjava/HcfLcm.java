package gfgjava;

public class HcfLcm {
	public static void main(String[] args)
	{
		System.out.println(lcm(4,6));
	}
	
	static int hcf(int a,int b)
	{
		while(a != b)
		{
			if(a>b)
			{
				a=a-b;
			}
			else
				b=b-a;
		}
		return a;
	}
	
	static int hcfOpti(int a,int b)
	{
		if(b==0) return a;
		
		return hcfOpti(b,a%b);

    }
	
	static int lcm(int a, int b)
	{
		return (a*b)/hcfOpti(a,b);
	}
	
}