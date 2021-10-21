package DSAQuestions.Hashing;
import java.util.*;

public class SubarrayZeroSum {
	public static void main(String[] args)
	{
        int arr[] = new int[]{5, 3, 9, -4, -6, 7, -1};
        int n = arr.length;
        
        System.out.println(ZeroSumSubarray(arr, n));
	}
	static int ZeroSumSubarray(int arr[],int n)
	{
		Set<Integer> hs= new HashSet<Integer>();
		int sum=0;
		for(int x: arr)
		{
			sum+= x;
			if(hs.contains(sum)==true)
			{
				return 1;
			}
			if(sum==0)
				return 1;
			
			hs.add(sum);
		}
		
		return 0;
	}
}
