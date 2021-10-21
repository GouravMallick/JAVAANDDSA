package Search;

public class BinarySearchRecursive {
	public static void main(String args[])
	{

        int arr[] = {10, 20, 30, 40, 50, 60, 70}, n = 7;

		int x = 60;
		System.out.print(bSearch(arr,0,n-1,x));

	}
	static int bSearch(int arr[],int low,int high,int x)
	{
		int mid=(low+high)/2;
		if(low>high) return -1;
		if(arr[mid]==x) return mid;
		else if(arr[mid]>x)
		{
			return bSearch(arr,low,mid-1,x);
		}
		else if(arr[mid]<x)
		{
			return bSearch(arr,mid+1,high,x);
		}
		return -1;
	}
}
