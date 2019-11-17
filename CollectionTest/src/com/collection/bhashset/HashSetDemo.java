package com.collection.bhashset;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class HashSetDemo {

	public static void main(String[] args) {
		
		
	   Set<Integer> hset= Collections.synchronizedSet(new HashSet<Integer>());		
		
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		
		//Integer[] intt=hset.toArray(new Integer[hset.size()]);
		System.out.println("Iterating eemens using while loop");
	    for(Integer g:hset)
	    {
	    	System.out.println(g);
	    }
	    System.out.println("after applying hashset");
	   Set<Integer> s= Collections.synchronizedSet(new HashSet<Integer>());
	    s.add(100);
	    s.add(200);
	    s.add(4);
	   synchronized (s) {
		   for(Integer g:s)
		    {
		    	System.out.println(g);
		    }
		   System.out.println(hset.contains(40));
		
	}
	}
}
