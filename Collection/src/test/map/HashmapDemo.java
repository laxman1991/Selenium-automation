package test.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class HashmapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap= new HashMap<Integer,String>();
		
		hmap.put(10, "laxman");
		hmap.put(20, "aarti");
		hmap.put(30, "neha");		 	 	
		hmap.put(40, "sneha");
		
		Set sss=hmap.entrySet();
	    
		Iterator<Map.Entry<Integer,String>> itr=sss.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
