package gfgjava;

public class MaxConsecutiveOnes {
	public static void main(String[] args)
	{
		int arr[]= {0,1,1,1,1,0,1,1} , n=8;
		System.out.println(function2(arr));
	}
	
	// NAIVE SOLUTION
	
	static int function1(int arr[])
	{
		int n=arr.length;
		int result=0;
		for(int i=0;i<n;i++)
		{
			int current=0;
			for(int j=i;j<n;j++)
			{
				if(arr[j]==1)
				{
					current++;
				}
				else break;
				result=Math.max(result,current);
			}
		}
		return result;
	}
	
	//EFFICIENT SOLUTION
	
	static int function2(int arr[])
	{
		int n=arr.length;
		int current=0;
		int result=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0) current=0;
			else
			{
				current++;
				result=Math.max(result, current);
			}
		}
		return result;
	}

}
