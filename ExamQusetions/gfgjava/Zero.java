package gfgjava;

public class Zero {

	public static void main(String[] args) {
		
		int arr[] = {10, 0, 20, 0, 30, 0};
		System.out.println("Before Removal:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
		System.out.println();
		code(arr);
		
		System.out.println("After Removal:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+", ");
		}
	

	}
	
	static void code(int arr[])
	{
		int n=arr.length;
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]!=0)
			{
				int temp=arr[i];
				arr[i]=arr[count];
				arr[count]=temp;
				count++;
			}
		}
		
	}

}
