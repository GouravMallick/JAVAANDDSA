package DSAQuestions.Hashing;
import java.util.*;

public class Intersection {
	public static void main(String args[])
	{
		int a[] = new int[]{15, 17, 27, 27, 28, 15};
        int b[] = new int[]{16, 17, 28, 17, 31, 17};
        int m = a.length;
        int n = b.length;
        
        System.out.println(intersections(a, m, b, n));
	}
	static int intersections(int a[],int m,int b[],int n)
	{
		int result =0;
		Set<Integer> s= new HashSet<Integer>();
		for(int x:a)
		{
			s.add(x);
		}
		for(int x:b)
		{
			if(s.contains(x)==true)
			{
				result++;
				s.remove(x);
			}
		}
		return result;
	}
}
