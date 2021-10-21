package DSAQuestions.Hashing;
import java.util.*;

public class DistinctElementWindow {
	public static void main(String args[])
	{

        int arr[] = new int[]{10, 10, 5, 3, 20, 5};
        
        int n = arr.length;
        int k=4;
        printDistinct(arr, n, k);
	}
	
	static void printDistinct(int arr[], int n, int k)
	{
		Map<Integer,Integer> hm= new HashMap<Integer,Integer>();
		for(int i=0;i<k;i++)
		{
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
		}
		System.out.print(hm.size()+" ");
		
		for(int i=k;i<n;i++)
		{
			hm.put(arr[i-k], hm.get(arr[i-k])-1);
			if(hm.get(arr[i-k])==0)
			{
				hm.remove(arr[i-k]);
			}
			hm.put(arr[i], hm.getOrDefault(arr[i], 0)+1);
			System.out.print(hm.size()+" ");
		}
	}

}
