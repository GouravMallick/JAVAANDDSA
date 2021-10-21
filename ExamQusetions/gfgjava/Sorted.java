package gfgjava;

public class Sorted {
	public static void main(String[] args)
	{
		 //int arr[] = {5, 12, 30, 2, 35};
		int arr[] = {2, 2, 10,30};
		System.out.println(coding(arr));
	}
	
	static boolean code(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
		  	for(int j=i+1;j<arr.length;j++)
		  	{
		  		if(arr[j]<arr[i])return false;
		  	}
		}
		return true;
	}
	
	static boolean coding(int arr[])
	{
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]<arr[i-1]) return false;
		}
		return true;
	}

}
