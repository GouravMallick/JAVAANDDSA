package deque;

import java.util.ArrayDeque;

public class MainClass {
	public static void main(String[] args)
	{
		ArrayDeque<Integer> ad= new ArrayDeque<Integer>();
		
		ad.push(20);
		ad.push(620);
		ad.push(720);
		
		System.out.println(ad.pop());
		System.out.println(ad.pop());
	}

}
