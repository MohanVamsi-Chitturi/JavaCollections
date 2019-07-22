package com.CollectionsPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice "+"\n"
				+ "1.Add Element at Specific Index "+"\n"
				+ "2.Check the Last Index of Element");
		int choice = sc.nextInt();
		int p,r;
		if(choice == 1) {
			System.out.println("Enter the index and value to add element to ArrayList");
			p=sc.nextInt();
			r=sc.nextInt();
			int length=al.size();
			if(p<length) {
				al.add(p, r);
				System.out.println("After adding element "+al);
			}
			else {
				System.out.println("Enter the index less than "+length);
			}
		}
		else {
			System.out.println("Enter the element");
			p=sc.nextInt();

			System.out.println("The Last Index of "+p+" is "+al.lastIndexOf(p));
		}
	}

}
