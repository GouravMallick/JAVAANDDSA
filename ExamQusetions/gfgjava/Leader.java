package gfgjava;

public class Leader {
	public static void main(String[] args)
	{
		int arr[] = {2, 3, 10, 6, 4, 8, 1}, n = 7;

	       System.out.println(code(arr));
	}
	
	static int code(int arr[])
	{
		int n=arr.length;
		int result=arr[1]-arr[0];
		int minValue=arr[0];
		for(int i=1; i<n;i++)
		{
			result=Math.max(result,arr[i]-minValue);
		   minValue= Math.min(minValue,arr[i]);
		}
		return result;
	}
}
