package gfgjava;

public class SlidingWindow {
	public static void main(String[] args)
	{
		//int arr[] = {1, 8, 30, -5, 20, 7}, n = 6, k = 3;
	      // System.out.println(maxSumKConsecutiveElements(arr, k));
		
		
		 SlidingWindow obj= new  SlidingWindow(); 
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23}; 
		int n = arr.length; 
		int sum = 23; 
		obj.function1(arr,n, sum);
	}
	
	//Maximum Sum of K Consecutive elements
	
	 static int maxSumKConsecutiveElements(int arr[],int k)
	 {
		 int n=arr.length;
		 int sum=0;
		 for(int i=0;i<k;i++)
		 {
			 sum+=arr[i];
		 }
		 int maxsum=sum;
		 for(int i=k;i<n;i++)
		 {
			 sum+=(arr[i]-arr[i-k]);
			 maxsum=Math.max(sum,maxsum);
		 }
		 return maxsum;
	 }
	 
	// Find subarray with given sum
	 
	 static int function1(int arr[],int n,int sum)
	 {
		 int curr_sum=arr[0];
		 int start=0;
		 for(int end=1;end<n;end++)
		 {
			
			 while(curr_sum>sum && start<end-1)
			 {
				 curr_sum-=arr[start];
				 start++;
			 }
			 if(curr_sum==sum)
			 {
				 System.out.println("From index: "+start+ " to "+(end-1));
				 return 1;
			 }
			 if(end<n)
			 {
				 curr_sum+=arr[end];
			 }
			 
		 }
			System.out.println("No subarray found"); 
			return 0; 
	 }
		

}
