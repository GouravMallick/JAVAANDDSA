package Outputs;

public class Op1 {
	public static void main(String args[])
	{
		int p=7,q=8,r=4;
		if((q-p-r)<(r-q))
		{
			q=(q^4)+p;
			q=(p^10)&p;
			r=(9+1)&q;
		}
		System.out.println(p+q+r);
		//System.out.println(fun(2,7,6));
	}
//	static int fun(int a,int b,int c)
//	{
//		b=(a&a)&a;
//		a=(2^8)^c;
//		if((a^c)<c)
//		{
//			b=7^c;
//			a=11^c;
//		}
//		return a+b+c;
//	}
}
