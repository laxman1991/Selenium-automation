package com.collection.chashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		
	HashMap<Integer, String> hmap= new HashMap<>();
	
	hmap.put(null, "neha");
	hmap.put(7, "neha");
	hmap.put(2, "neha");
	hmap.put(40,"nehaooooooop");
	System.out.println("keyset");
	Set<Integer> keys=hmap.keySet();
	for(Integer d:keys)
	{
		System.out.println(d);
	}
       System.out.println(hmap);
       String s=hmap.get(40);
       System.out.println(s);
       Set sss=hmap.entrySet();
       Iterator itr=sss.iterator();
       while(itr.hasNext())
       {
    	   Map.Entry mapentry=(Map.Entry)itr.next();
    	   System.out.println("key is :"+mapentry.getKey()+"----value is :"+mapentry.getValue());
       }
	}
}
