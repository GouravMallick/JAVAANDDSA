package DSAQuestions.Hashing;
import java.util.*;

public class SubarrayGivenSum {
	public static void main(String[] args)
	{
		int arr[] = new int[]{5, 8, 6, 13, 3, -1};
        int sum=22;
        
        System.out.println(isSum(arr,sum));
	}
	static boolean isSum(int arr[],int sum)
	{
		Set<Integer> hs = new HashSet<Integer>();
		int pre_sum=0;
		for(int x :arr)
		{
			pre_sum += x;
			if(pre_sum==sum) return true;
			if(hs.contains(pre_sum-sum)==true) return true;
			
			hs.add(x);
		}
		return false;
	}

}
