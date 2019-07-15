package com.CollectionsPractice;

import java.util.Iterator;
import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<Integer>();
		st.add(2);
		st.add(3);
		st.add(0, 1);
		Iterator it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		System.out.println(st.isEmpty());
		st.add(4);
		System.out.println(st);
		System.out.println(st.contains(4));
		st.remove(3);
		for (Integer i : st) {
			System.out.println(i+" ");
		}
	}

}
