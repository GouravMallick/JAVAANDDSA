package gfgjava;

public class Working {
	public static void main(String[] args)
	{
		int a[] = {3, 8, 12, 5, 6}, x = 12, n = 5;
		System.out.println("before deletion:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		n=delet(a,n,x);
		System.out.println("after deletion:");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	static int delet(int a[], int n, int x)
	{
		int i=0;
		for( i=0;i<n ;i++)
		{
			if(a[i]==x) break;
		}
		if(i==n) return n;
		
		for(int j=i;j<n-1;j++)
		{
			a[j]=a[j+1];
		}
		return n-1;
	}
}




		
