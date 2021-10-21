package ExamQusetions;

import java.util.HashSet;
import java.util.*;

public class Pair {
	public static void main(String args)
	{
		int arr[] = {1, 5, 3, 4, 2};
		int k=2;
		System.out.println(pairs(k,arr));
	}
	
	static int pairs(int k, int[] arr) {
	    List<Integer> set = new LinkedList<Integer>();
	    for(int i=0;i<arr.length;i++) set.add(arr[i]);
	    int ans = 0;
	    for(int i:set)
	        ans+=(set.contains(i+k))?1:0;
	    return ans;
	}

}
