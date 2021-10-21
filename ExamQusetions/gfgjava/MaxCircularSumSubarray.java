package gfgjava;

public class MaxCircularSumSubarray {
	public static void main (String[] args)
	{
		int arr[] = {5, -2, 3, 4}, n = 4;

	       System.out.println(function2(arr));

	}
	
	// NAIVE SOLUTION
	
	static int function1(int arr[])
	{
		int n =arr.length;
		int result=arr[0];
		for(int i=0;i<n;i++)
		{
			int curr_sum=arr[i];
			int curr_max=arr[i];
			
			for(int j=1;j<n;j++)
			{
				int index=(i+j)%n;
				//System.out.println("Index:"+index);
				curr_sum+=arr[index];
				curr_max=Math.max(curr_max,curr_sum);
			}
			result=Math.max(result,curr_max);
		}
		return result;
		}
	
	//EFFICIENT SOLUTION
	
	static int maxSum(int arr[])
	{
		int n=arr.length;
		int result=arr[0];
		int maxEnding=arr[0];
		for(int i=1;i<n;i++)
		{
			maxEnding=Math.max(arr[i],maxEnding+arr[i]);
			result=Math.max(result,maxEnding);
		}
		return result;
	}
	
	static int function2(int arr[])
	{
		int n=arr.length;
		int normalmax=maxSum(arr);
		if(normalmax < 0)
    		return normalmax;

		
		int arr_sum=0;
		for(int i=0;i<n;i++)
		{
			arr_sum+=arr[i];
			arr[i]=-arr[i];		
		}
		int max_circular= arr_sum + maxSum(arr);
		return Math.max(normalmax, max_circular);
	}
}