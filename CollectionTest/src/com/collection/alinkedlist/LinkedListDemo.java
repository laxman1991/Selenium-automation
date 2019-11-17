package com.collection.alinkedlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
	  	
		LinkedList<Integer> linkList=new LinkedList<>();
		linkList.add(20);
		linkList.add(1, 23);
		linkList.add(30);
		System.out.println(linkList);
		linkList.addFirst(5);
		linkList.addLast(6);
		System.out.println("while loop");
		
		int num=0;
		while(linkList.size()>num)
		{
			Integer s=linkList.get(num);
			num++;
			System.out.println(s);
		}
		
		System.out.println("aftre addding linked ist :-"+linkList);
 
		//linkList.removeLast();
		System.out.println(linkList);
		
		System.out.println("usroing for loop");
		linkList.add(0, 55);
		System.out.println(linkList.indexOf(55));
		System.out.println(linkList.getFirst());
		System.out.println("list iterator");  
	    ListIterator<Integer> d=linkList.listIterator();
	    while(d.hasNext())
	    {
	    	System.out.println(d.next());
	    }
		for(Integer g:linkList)
		{
			System.out.println(g);
		}
		System.out.println("convering link list to array list");
		
		Integer[] arr=linkList.toArray(new Integer[linkList.size()]);
		for(Integer i:arr)
		{
			System.out.println(i);
		}
		System.out.println("conveting array to linked list");
		List s=Arrays.asList(arr);
		LinkedList<Integer> dd=new LinkedList<>(s);
        System.out.println(dd);	
        
        System.out.println("converting link is to array list");
        
        ArrayList<Integer> aray=new ArrayList<>(linkList);
        
        for(Integer p:aray)
        {
        	System.out.println(p);
        }
	}
}
