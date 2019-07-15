package com.CollectionsPractice;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> dq=new ArrayDeque<String>();  
	    dq.offer("Mohan");  
	    dq.offer("Vamsi");  
	    dq.add("Rohith");
	    System.out.println("Deque Elements are ");
	    System.out.println(dq);
	    dq.offerFirst("Balu");  
	    System.out.println("After using offerFirst "); 
	    for(String s:dq){  
	        System.out.println(s);  
	    }
	    System.out.println("After using pollLast ");
	    dq.pollLast();    
	    for(String s:dq){  
	        System.out.println(s);  
	    }
	    System.out.println("Does this deque contains Rohith "+dq.contains("Rohith"));
	}
}
