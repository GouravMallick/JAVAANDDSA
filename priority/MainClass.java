package priority;

import java.util.PriorityQueue;

public class MainClass {
	public static void main(String[] args)
	{
		PriorityQueue<String> pq= new PriorityQueue<String>();
		
		pq.add("Kiwi");
		pq.add("Apple");
		pq.add("Mango");
		pq.add("Banana");
		
		System.out.println(pq);
		
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		
	}

}
