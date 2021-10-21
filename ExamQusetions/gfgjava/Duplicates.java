package gfgjava;

public class Duplicates {
	
	public static void main(String[] args)
	{
		int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;
		System.out.println("Before Removal:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		n=code(arr,n);
		
		System.out.println("After Removal:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+", ");
		}
	}
	static int code(int arr[],int n)
	{
		int result=1;
		for(int i=1;i<n; i++)
		{
			if(arr[i]!=arr[result-1])
			{
				arr[result]=arr[i];
				result++;
			}
		}
		return result;
	}

}
