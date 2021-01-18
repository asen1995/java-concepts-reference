package com.java.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Collections {

	public void collectionMainMethod() {
		set();
	}

	private void sest() {
		System.out.println("set");
		
	}
	private void set() {
		System.out.println("set");
		 int count[] = {34, 22,10,60,30,22};
	      Set<Integer> set = new HashSet<Integer>();
	      try {
	         for(int i = 0; i < 5; i++) {
	            set.add(count[i]);
	         }
	         System.out.println(set);

	         TreeSet sortedSet = new TreeSet<Integer>(set);
	         System.out.println("The sorted list is:");
	         System.out.println(sortedSet);

	         System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
	         System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
	         
	         sortedSet.add(31);//has to be sorted 
	         System.out.println("adding 31 - The sorted list is:");
	         System.out.println(sortedSet);

	         System.out.println("The First element of the set is: "+ (Integer)sortedSet.first());
	         System.out.println("The last element of the set is: "+ (Integer)sortedSet.last());
	      }
	      catch(Exception e) {}
	}
	
	private void list() {
		System.out.println("list");

		List a1 = new ArrayList();
		a1.add("Zara");
		a1.add("Mahnaz");
		a1.add("Ayan");
		System.out.println(" ArrayList Elements");
		System.out.print("\t" + a1);

		List l1 = new LinkedList();
		l1.add("Zara");
		l1.add("Mahnaz");
		l1.add("Ayan");
		System.out.println();
		System.out.println(" LinkedList Elements");
		System.out.print("\t" + l1);
		System.out.println();
		System.out.println("to UpperCase:");
	}
}
