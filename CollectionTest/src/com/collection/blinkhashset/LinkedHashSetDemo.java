package com.collection.blinkhashset;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetDemo {

	public static TreeSet<Integer> set2=null;
	
	public static void main(String[] args) {
		
	
		HashSet<Integer> set= new HashSet<Integer>(set2);
		LinkedHashSet<Integer> set1= new LinkedHashSet<Integer>(set);
		set2= new TreeSet<Integer>(set1);
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println(set.getClass());
		for(Integer s:set)
		{
			System.out.println(s);
		}
		HashSet<Integer> set3= new HashSet<Integer>(set);
		System.out.println(set2);
		
		System.out.println("cloning hashet to treeset");
		
		set3=(HashSet)set.clone();
		System.out.println(set3);
		
		
	}
}
