package Linkedlist;

import java.util.LinkedList;

import java.util.ArrayList;

import java.util.List;

public class MainLinkedList {
	public static void main(String[] args)
	{
		MyLinkedList ll= new MyLinkedList();
		for(int i=1; i<11; i++ )
		{
			ll.add(i);
		}
		
		ll.print();
		
	}
}