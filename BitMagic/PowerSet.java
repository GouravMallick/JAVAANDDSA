package BitMagic;

public class PowerSet {
	public static void main (String args[])
	{
		printPowerSet("abc");
	}
	static void printPowerSet(String str)
	{
		int n= str.length();
		int powersize= (int)Math.pow(2, n);
		for(int i=0;i<powersize;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i &(1 << j))!=  0)
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}

}
