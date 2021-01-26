package com.java.printer;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Printer {

	public static void printMap(Map map) {
		 Set set = map.entrySet();
	      
	      // Get an iterator
	      Iterator i = set.iterator();
	      
	      // Display elements
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	      System.out.println();
		
	}

	public static void printHashSet(LinkedHashSet hs) {
		   System.out.print(hs);	
	}

}
