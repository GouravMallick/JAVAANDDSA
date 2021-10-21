package DSAQuestions.Hashing;
import java.util.*;

public class LongestSubarrayGivenSum {
	public static void main(String args[])
	{
		  int[] arr = {5, 2, 3};
          int sum = 5;
	        
	      System.out.println(largestSubarray(arr,sum));
	}
	
	//Naive  
	
	
//	static int largestSubarray(int arr[],int sum)
//	{
//		int result=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			int pre_sum=0;
//			
//			for(int j=i;j<arr.length;j++)
//			{
//				pre_sum+=arr[j];
//				if(pre_sum==sum)
//				{
//					result=Math.max(result, j-i+1);
//				}
//			}
//		}
//		return result;
//	}
	
	static int largestSubarray(int arr[],int sum)
	{
		int result=0;
		int pre_sum=0;
		
		Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++)
		{
			pre_sum +=arr[i];
			
			if(pre_sum== sum) 
			{
				result= i+1;
			}
			
			if(hm.containsKey(pre_sum)==false)
			{
				hm.put(pre_sum, i);
			}
			
			if(hm.containsKey(pre_sum-sum)==true)
			{
				result= Math.max(result, i-hm.get(pre_sum-sum));
			}
		}
	   return result;
	}
	
}
