package com.CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> al = new ArrayList <String>();
		al.add("Mohan");
		al.add("Balu");
		al.add("Rohith");
		
		Iterator it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		System.out.println(al.isEmpty());
		al.remove(0);
		System.out.println("New Arraylist "+al);
		System.out.println(al.size());
		al.add(2, "Mohan");
		System.out.println("New Arraylist after adding 1 element "+al);
		
		for (String i : al) {
			System.out.println(i+" ");
		}
	}

}
