package DSAQuestions.Hashing;
import java.util.*;

public class Union {
	public static void main(String[] args)
	{
	        int a[] = new int[]{2, 8, 3, 5, 6};
	        int b[] = new int[]{4, 8, 3, 6, 1};
	        int m = a.length;
	        int n = b.length;
	        
	        System.out.println(union(a, m, b, n));
	}
		static int union(int a[],int m,int b[],int n)
		{
			Set<Integer> hs= new HashSet<Integer>();
			for(int x:a)
			{
				hs.add(x);
			}
			for(int x:b)
			{
				hs.add(x);
			}
			
			return hs.size();
			
		}

}
