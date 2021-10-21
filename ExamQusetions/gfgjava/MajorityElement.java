package gfgjava;

public class MajorityElement {
	public static void main(String[] args)
	{
		int arr[] = {8, 8, 6, 6, 6, 4, 6}, n = 7;

	       System.out.println(function2(arr));
	}
	
	//NAIVE SOLUTION
	
	static int function1(int arr[])
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			int count=0;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			if(count>n/2)
			{
				return i;
			}
		}
		return -1;
	}
	
	//EFFICIENT SOLUTION
	
	static int function2(int arr[])
	{
		int n=arr.length;
		int result=0;
		int count=1;
		for(int i=1;i<n;i++)
		{
			if(arr[i]==arr[result])
			{
				count++;
			}
			else count--;
			if(count == 0)
			{
				result=i;
				count=1;
			}
		}
		count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i] == arr[result])
			{
				count++;
			}
			if(count<= n/2) result=-1;
	   }
		return result;

}
}
