package com.collection.btreeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		
		TreeSet<String> tree= new TreeSet<String>();
		tree.add("10");
		tree.add("laxman");
		tree.add("neha");
		tree.add("more");
		tree.add("more");
		System.out.println(tree);
		
     	Set s=Collections.synchronizedSet(new HashSet<>());
        System.out.println("applying synchronization");
        List<String> aa=Collections.synchronizedList(new ArrayList<>());
        aa.add("laxman");
        aa.add("neha");
        aa.add("priyanks");
        aa.add("aarti");
        synchronized (aa) {
        for(String k:aa)
   		 {
   			 System.out.println(k);
   		 }
       
	}
	}
}
