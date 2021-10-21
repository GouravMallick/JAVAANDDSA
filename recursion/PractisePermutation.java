package recursion;
import java.util.*;

public class PractisePermutation {
	static Set<String> set =new HashSet<String>();
	public static void main (String[] args)
	{
		
		permutations("abcc", 0, 4);
	}
	
	static void permutations(String s,int l, int r)
	{
		if(l==r)
		{
			if(set.contains(s)) return;
			set.add(s);
			System.out.println(s);
			return;
		}
		for(int i=l;i<r;i++)
		{
			s=interchangeChar(s, l, i);
			permutations(s, l+1, r);
			s=interchangeChar(s, l, i);
		}
		
	}
	static String interchangeChar(String s,int a,int b)
	{
		char ar[]=s.toCharArray();
		char temp= ar[a];
		ar[a]=ar[b];
		ar[b]=temp;
		return String.valueOf(ar);
	}

}
