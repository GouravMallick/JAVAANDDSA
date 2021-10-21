package sets;

import java.util.HashSet;
import java.util.*;

public class MainClass {
	public static void main(String[] args)
	{
		int[] a= {2,1,3,-4,2};
		boolean found=false;
//		
//		for(int i=0;i<n;i++)
//		{
//			int sum=0;
//			for(int j=i;j<n;j++)
//			{
//				sum=sum+a[j];
//				if(sum==0)
//				{
//					found=true;
//					break;
//				}
//			}
//			if(found) break;
//		}
		
		Set <Integer> s= new HashSet<Integer>();
		int sum=0;
		for(int el:a);
		s.add(sum);
		int el;
		sum=sum+el;
		if(s.contains(sum))
		{
			found=true;
			break;
		}
		
		System.out.println(found);
	}

}
