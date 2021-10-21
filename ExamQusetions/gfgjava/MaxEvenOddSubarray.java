package gfgjava;

public class MaxEvenOddSubarray {
	public static void main(String[] args)
	{
		int arr[] = {5, 10, 20, 6, 3, 8}, n = 7;

	       System.out.println(function2(arr));
	}
	
	// NAIVE SOLUTION
	
	static int function1(int arr[])
	{
		int n=arr.length;
		int result=1;
		for(int i=0;i<n;i++)
		{
			int current=1;
			for(int j=i+1;j<n;j++)
			{
				if((arr[j]%2==0 && arr[j-1]%2!=0)||(arr[j]%2!=0 && arr[j-1]%2==0))
				{
					current++;
				}
					else break;
				result=Math.max(result,current);
			}
		}
		return result;
	}
	
	// EFFICIENT SOLUTION
	
	static int function2(int arr[])
	{
		int n=arr.length;
		int result=1;
		int current =1;
		
		for(int i=1;i<n;i++)
		{
			if((arr[i]%2==0 && arr[i-1]%2!=0)||(arr[i]%2!=0 && arr[i-1]%2==0))
			{
				current++;
				result=Math.max(current, result);
			}
			else current=1;
		}
		return result;
	}

}
