package BitMagic;

public class KthBit {
	public static void main(String[] args)
	{
		isKthBitSet2(5,1);
	}
	// Method1
	static void isKthBitSet(int n,int k)
	{
		if((n&(1<<(k-1))) == 1)
		{
			System.out.print("Set");
		}
		else
		{
			System.out.print("Not Set");
		}
	}
	//Method2
	static void isKthBitSet2(int n,int k)
	{
		if( ((n >> (k-1)) & 1)== 1)
		{
			System.out.print("Set");
		}
		else
		{
			System.out.print("Not Set");
		}
	}

}
