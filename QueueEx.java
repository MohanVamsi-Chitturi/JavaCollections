package com.CollectionsPractice;

import java.util.Iterator;
import java.util.PriorityQueue;



public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq=new PriorityQueue<String>();  
		System.out.println(pq.poll());
		pq.add("Mohan");  
		pq.add("Vijay");  
		pq.add("Balu");  
		pq.add("Rohith");  
		pq.add("Vamsi");  
		pq.add("Amir");
		System.out.println("Head element "+pq.element());  
		System.out.println("Head element "+pq.peek());  
		
		System.out.println(pq);
		pq.remove();
		pq.remove("Vijay");
		System.out.println("After removing 2 Elements");
		Iterator<String> it = pq.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		System.out.println(pq.contains("vamsi"));
	
		System.out.println("Iterating through ForEach ");
		for (String st : pq) {
			System.out.println(st);
		}
		
	}

}
