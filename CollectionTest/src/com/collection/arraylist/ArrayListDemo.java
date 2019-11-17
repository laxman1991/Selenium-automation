package com.collection.arraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {

		System.out.println("using for loops");
	    Set<String> s=new HashSet<String>();
	    s.add("laxman");
	    s.add("more");
		ArrayList<String> list= new ArrayList<String>(s);
		Set<String> set=new HashSet<>();
		set.add("aarti");
		set.add("jadhav");
		System.out.println(list.size());
		System.out.println(list.addAll(set));
	   	for(String data:list)
	   	{
	   		System.out.println(data);
	   	}
	   	System.out.println("Using Iterator");
	   	Iterator itr=list.iterator();
	   	while(itr.hasNext())
	   	{
	   		System.out.println(itr.next());
	   	}
	   	System.out.println("using traditional for loop");
	   	for(int i=0;i<list.size();i++)
	   	{
	   		System.out.println(list.get(i));
	   	}

	  System.out.println("converting Arraylist to array of string");
	  String[] array =list.toArray(new String[list.size()]);
	  
	  for(Object ss:array)
	  {
		  System.out.println(ss);
	  }
	  System.out.println("convering array to arrayList");
	  
	  List<String> ss=Arrays.asList(array);
	  ArrayList<String> d= new ArrayList<>(ss);
	  for(String ele:d)
	  {
		  System.out.println(ele);
	  }
	}
}
