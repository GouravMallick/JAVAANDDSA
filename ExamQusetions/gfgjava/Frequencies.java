package gfgjava;

public class Frequencies {

	public static void main(String[] args) {
		int arr[] = {10, 10, 20, 30, 30, 30,40}, n = 7;

	       code(arr);
	}
	
	static void code(int arr[])
	{
		int n=arr.length;
		int i=1;
		int frequency=1;
		while(i<n)
		{
			while(i<n && arr[i]==arr[i-1]) {
				frequency++;
				i++;
			}
			System.out.println(arr[i-1]+ "="+ frequency);
			i++;
			frequency=1;
		}
		if(n==1 || arr[n-1] !=arr[n-2])
		{
			System.out.println(arr[i-1]+ "="+ frequency);
		}
	}

}
