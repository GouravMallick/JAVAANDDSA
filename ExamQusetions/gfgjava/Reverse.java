package gfgjava;

public class Reverse {
	
	public static void main(String[] args)
	{
		int arr[] = {5, 12, 30, 2, 35};
		
		System.out.println("before reverse:");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		code(arr);
		
        System.out.println("after reverse:");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	static void code(int arr[])
	{
		int n=arr.length, low=0, high=n-1;
		
		while(low<high)
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
	}

}
