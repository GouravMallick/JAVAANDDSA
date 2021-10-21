package gfgjava;

public class MaxProfit {
	public static void main(String[] args)
	{

	       int arr[] = {1, 5, 3, 8, 12}, n = 5;

	       System.out.println(coding(arr));
	}
	// naive solution
	static int  code(int arr[],int start,int end)
	{
		if(end<=start) return 0;
		
		int profit=0;
		
		for(int i=start;i<end;i++)
		{
			for(int j=i+1;j<=end;j++)
			{
				if(arr[j]>arr[i])
				{
					int cur_profit=arr[j]-arr[i]+code(arr,start,i-1)+code(arr,j+1,end);
					
					profit=Math.max(profit,cur_profit);
				}
			}
		}
		return profit;
	}
	
	// efficient  solution
	static int coding(int arr[])
	{
		int n=arr.length;
		int profit=0;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[i-1])
			{
				profit +=(arr[i]-arr[i-1]);
			}
		}
		return profit;
	}

}
