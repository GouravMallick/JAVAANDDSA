package gfgjava;

public class TappingRainWater {
	public static void main (String args[])
	{

	       int arr[] = {3, 0, 1, 2, 5}, n = 5;

	      System.out.println( code2(arr));
	}
	// NAIVE SOLUTION 
	static int code(int arr[])
	{
		int n=arr.length;
		int result=0;
		for(int i=1;i<n-1;i++)
		{
			int lmax=arr[i];
			for(int j=0;j<i;j++)
			{
				lmax=Math.max(lmax, arr[j]);
			}
			int rmax=arr[i];
			for(int j=i+1;j<n;j++)
			{
				rmax=Math.max(rmax, arr[j]);
			}
			
			result+= Math.min(lmax, rmax)-arr[i];
		}
		return result;
	}
	
	// EFFICIENT SOLUTION
	
	static int code2(int arr[])
	{
		int n=arr.length;
		int lmax[]=new int[n];
		int rmax[]=new int[n];
		int result=0;
		
		lmax[0]=arr[0];
		for(int i=1;i<n;i++)
		{
			lmax[i]=Math.max(arr[i],lmax[i-1]);
		}
		rmax[n-1]=arr[n-1];
		for(int i=n-2;i>=0;i--)
		{
			rmax[i]=Math.max(arr[i],lmax[i+1]);
		}
		for(int i=0;i<n;i++)
		{
			result=result+= Math.min(lmax[i], rmax[i])-arr[i];
		}
		return result;
	}

}
