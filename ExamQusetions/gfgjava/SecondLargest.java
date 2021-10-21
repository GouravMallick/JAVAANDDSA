package gfgjava;

public class SecondLargest {
	public static void main (String[] args) {
		int arr[]= {5,20,12,20,8,18};
		System.out.println(second(arr));
		
	}
	
	
	static int second(int arr[])
	{
		int n=arr.length;
		int largest=0, result=-1;
		for(int i=1;i<n;i++)
		{
			if(arr[i]>arr[largest])
			{
				result=largest;
				largest=i;
			}
			else if(arr[i]!=arr[largest])
			{
				if(result==-1 || arr[i]>arr[result])
				{
					result=i;
				}
			}
			
		}
		return result;
	}

}
