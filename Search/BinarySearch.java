package Search;

public class BinarySearch {
	public static void main(String args[])
	{
		 int arr[] = {10, 20, 30, 40, 50, 60};
		 int n = 6;
		 int x = 60;
		 System.out.print(bSearch(arr,n,x));
	}
	static int bSearch(int arr[],int n,int x)
	{
		int low=0, high=n-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==x) return mid;
			else if(arr[mid]>x) 
			{
				high=mid-1;
			}
			else
				low=mid+1;
		}
		return -1;
	}

}
