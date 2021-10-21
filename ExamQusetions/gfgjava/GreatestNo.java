package gfgjava;

public class GreatestNo {
	public static void main (String args[])
	{
		int arr[]= {5,8,20,10};
		System.out.println(find(arr));
	}
	
	static int find(int arr[])
	{
		int n=arr.length;
		int result =0;
		
		for( int i=1;i<n;i++)
		{
			if(arr[i]>arr[result])
			{
				result=i;
			}
			
		}
		 return result;
	}

}
