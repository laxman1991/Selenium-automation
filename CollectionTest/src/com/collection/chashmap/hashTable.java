package com.collection.chashmap;

import java.util.Hashtable;

public class hashTable {

	public static void main(String[] args) {
		
		Hashtable<Float,Boolean> hs=new Hashtable<Float,Boolean>();
		hs.put(1202.11f,true);
		System.out.println(hs);
        System.out.println(hs.get(1202.11f));  
        
        System.out.println(hs.keySet());;
        System.out.println(hs.values());
	}
}
