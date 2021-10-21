package dsagfg;

public class MainClass {
	public static void main(String[] args)
	{
		int number=1299934;
		System.out.println(countDigit(number));
	}
 static int countDigit(int n)
{
	int count =0;
	while(n>0)
	{
		n=n/10;
		count++;
	}
	return count;
}
}
