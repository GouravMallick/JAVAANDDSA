package gfgjava;

public class MaxSumSubarray {

	public static void main(String[] args) {
		int arr[] = {5,-2,3,4}, n = 4;

	       System.out.println(function2(arr));


	}
	
	static int function1(int arr[])
	{
		int n=arr.length;
		int result=arr[0];
		for(int i=0;i<n;i++)
		{
			int current=0;
			for(int j=i;j<n;j++)
			{
				current=current+arr[j];
			}
			result=Math.max(result, current);
		}
		return result;
	}
	
	static int function2(int arr[])
	{
		int n=arr.length;
		int result=arr[0];
		int maxEnding=arr[0];
		for(int i=1;i<n;i++)
		{
			maxEnding=Math.max(maxEnding+arr[i],arr[i]);
		    result=Math.max(result,maxEnding);
		}
		return result;
	}
	
}
