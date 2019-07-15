package com.CollectionsPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1, "Mohan");
		m.put(2,"Vamsi");
		m.put(3, "Balu");
		m.put(4,"Rohith");
		m.put(5, "Aditya");
		System.out.println("Elements are "+m);
		Set s=m.entrySet();
		System.out.println("Traversing through iterator ");
		Iterator it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
		System.out.println("Traversing in the form of key value pairs ");
		Iterator itr=s.iterator();  
	    while(itr.hasNext()){  
	        Map.Entry entry=(Map.Entry)itr.next();  
	        System.out.println(entry.getKey()+" "+entry.getValue());  
	    }  
		
	}

}
