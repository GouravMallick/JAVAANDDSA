package Search;

public class BSearchInfinite {
public static void main(String args[])
{

	int arr[] = {1, 2, 3, 40, 50};

	int x = 40;
	System.out.println(search(arr, x));
}
static int bSearch(int arr[],int low,int high,int x)
{
	int mid=(low+high)/2;
	if(low>high) return -1;
	
	if(arr[mid]==x) return mid;
	
	else if(arr[mid] > x)
		return bSearch(arr,low,mid-1,x);
	
	else if(arr[mid] < x)
		return bSearch(arr,mid+1,high,x);
	
	return -1;
}
static int search(int arr[],int x)
{
	if(arr[0]==x) return 0;
	int i=1;
	while(arr[i]<x)
	{
		i*=2;
	}
		if(arr[i]==x) return i;
		
		return bSearch(arr,(i/2)+1,i-1,x);
}

}
