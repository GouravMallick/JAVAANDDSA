package BitMagic;

public class CountSetBit {
	public static void main(String[] args)
	{
		System.out.println(count(9));
	}
	static int count(int n)
	{
		int result=0;
		while(n>0){
			n= n&(n-1);
			result++;
		}
		return result;
	}

}
