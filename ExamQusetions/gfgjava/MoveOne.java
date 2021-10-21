package gfgjava;

public class MoveOne {
	public static void main(String[] args)
	{
		int arr[] = {1, 2, 3, 4, 5}, n = 5,d=2;
		
		System.out.println("BEFORE SHIFTING:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		code(arr,n,d);
		System.out.println("AFTER SHIFTING:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+", ");
		}


	}
	
	static void code(int arr[],int n,int d)
	{
		int temp[]=new int[d];
		for(int i=0;i<d;i++)
		{
			temp[i]=arr[i];
		}
		for(int i=d;i<n;i++)
		{
			arr[i-d]=arr[i];
		}
		for(int i=0;i<d;i++)
		{
			arr[n-d+i]= temp[i];
		}
		
		
	}
}
