package Collection.Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
    
		Set<String> set= new HashSet<String>();
		
		set.add("laxman");
		set.add("vishal");
		set.add("sneha");
		set.add("priya");
        System.out.println(set.contains("laxman"));;
        System.out.println(set);
	    //set.remove("vishal");
	    System.out.println(set);
	    Iterator itr=set.iterator();
	    
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    System.out.println(set.isEmpty());
        System.out.println(set.size());    
   	    System.out.println(set.equals("priya"));  
   	   
   	    String[]strr=new String[set.size()];
   	    String[]str= set.toArray(strr);
   	    for(String p:str)
   	    {
   	    	System.out.println(p);
   	    }
   	    Object o= new String("neha");
        String i=(String)o;
        System.out.println(i);
        System.out.println("converting hasset to treeset");
        Set<String> treeset= new TreeSet<String>(set);
        for(String data:treeset)
        {
          System.out.println(data);      	
        }
	}
}
