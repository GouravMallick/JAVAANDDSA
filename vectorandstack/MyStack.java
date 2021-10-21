package vectorandstack;

import Linkedlist.MyLinkedList;

public class MyStack<E> {
	
	private MyLinkedList<E> ll= new MyLinkedList<E>();
	
	public void push(E e)
	{
		ll.add(e);
		
	}
	
	E pop() throws Exception
	{
		if(ll.isEmpty())
		{
			throw new Exception("cannot be popped as the list is empty");
		}
		
		return ll.removeLast();
		
		
	}
	
	E peek()throws Exception
	{
		if(ll.isEmpty())
		{
			throw new Exception("cannot be popped as the list is empty");
		}
		
		return ll.getLast();
		
		
	}
	

}
