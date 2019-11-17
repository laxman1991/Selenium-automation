package com.collection.clinkedhashmap;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkHashmapDemo {

	public static void main(String[] args) {

		LinkedHashMap<Double,Long> lhmp=new LinkedHashMap<>();
		
		lhmp.put(10.20, 125L);
		lhmp.put(10.30, 1025L);
		lhmp.put(10.40, 1255L);
		lhmp.put(10.80, 1245L);
		
	    Set t=lhmp.entrySet();
		
	    //Double d[]=t.toArray(new Double[lhmp.size()]);
		
		
		
	}
}
