package com.CollectionsPractice;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(1);
		l.add(2);
		l.addFirst(3);
		l.addLast(4);
		 
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		System.out.println("First Element is "+l.getFirst()+" "+"Last element is "+l.getLast());
		l.remove(1);
		System.out.println(l.contains(3));
		System.out.println("New LinkedList is "+l);
		
		for (Integer i : l) {
			System.out.println(i+" ");
		}
	}

}
