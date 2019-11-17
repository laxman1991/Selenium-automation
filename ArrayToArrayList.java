package BasicProgram.softedge;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToArrayList {

	public static void main(String[] args) {
		
		Integer arr[]={10,20,30};
		
		List<Integer> arrr=Arrays.asList(arr);
        
        Iterator iterator=arrr.iterator();
        while(iterator.hasNext())
        {
        	System.out.println(iterator.next() ); 
        	
        }
        
        
	}

}
