package queue;


public class MainClass {
	public static void main(String[] args)
	{
		MyQueue<Integer> mq= new MyQueue<Integer>();
		
		mq.enqueue(20);
		mq.enqueue(40);
		mq.enqueue(30);
		mq.enqueue(70);
		
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());
		System.out.println(mq.dequeue());   
		
		
	}

}
