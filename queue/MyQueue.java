package queue;

import Linkedlist.MyLinkedList.Node;

public class MyQueue<E> {
	private Node<E> head,rear;
	
	public void enqueue(E e)
	{
		Node<E> toAdd = new Node<E>(e);
		if(head==null)
		{
			head=rear=toAdd;
			return;
		}
		rear.next=toAdd;
		rear=rear.next;
		
	}
	public E dequeue()
	{
		Node<E> temp=head;
		if(head==null)
		{
			return null; 
		}
		head=head.next;
		if(head==null)
		{
			rear=null;
		}
		return temp.data;
	}

 }
