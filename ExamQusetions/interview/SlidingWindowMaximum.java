package interview;
import java.util.*;

public class SlidingWindowMaximum {
	public static void main(String[] args)
	{
		
	}
	class Solution {
	    public int[] maxSlidingWindow(int[] a, int k) {
	    	int n=a.length;
	    	Deque<Integer> dq= new LinkedList<Integer>();
	    	int ans[]= new int[n-k+1];
	    	
	    	int i=0;
	    	for(;i<k;i++)
	    	{
	    		while(!dq.isEmpty() && a[dq.peekLast()] <=a[i])
	    		{
	    			dq.removeLast();
	    		}
	    		
	    		dq.addLast(i);
	    	}
	    	int i=0;
	    	for(;i<n;i++) {
	    		ans[i-k]=a[dq.peekFirst()];
	    	while(!dq.isEmpty()&&dq.peekFirst()<=i-k)
	    	{
	    		dq.removeFirst();
	    	}
	    	while(!dq.isEmpty() && a[dq.peekLast()] <=a[i])
    		{
    			dq.removeLast();
    		}
    		
    		dq.addLast(i);
	    	}
	    	ans[i-k]=a[dq.peekFirst()];
	    	 return ans;
	    	 
	    }
	   
	}

}
