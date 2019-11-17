package com.collection.avector;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
	
		Vector<String> v= new  Vector<String>(2);
		
		System.out.println(v.capacity());
		v.add("laxman");
		v.add("more");
		v.add("aarti");
	   System.out.println(v.capacity());	
	   v.addElement("sneha");
	   System.out.println(v.capacity());
	   System.out.println(v);	
		
    	  Enumeration<String> e=v.elements();
	      while(e.hasMoreElements())
	      {
		  System.out.println(e.nextElement()); 
	      }
	      System.out.println("copying vector elements from one vetor to oter");
	      Vector<String> v2= new Vector<String>(v);
	      
	      String a[]= new String[10];
	      v2.copyInto(a);
	      for(String data:v2)
	      {
	    
	      }
	      System.out.println("after calling colections.copy");
	      Collections.copy(v2, v);
          System.out.println( " --------------------------"+v2);	   
         
         
	}
}
