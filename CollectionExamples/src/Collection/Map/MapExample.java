package Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String,Integer> map= new HashMap<String,Integer>();
		
		map.put("laxman", 10);
		map.put("aarti", 20);
		map.put("sneha", 30);
		map.put("priyanks", 40);
		map.put("pranali", 50);
		map.put("neha", 60);
	    Set s=	map.entrySet();
	    Iterator itr=s.iterator();
	    while(itr.hasNext())
	    {
	    Map.Entry values=(Map.Entry)itr.next();
	    System.out.println("key is = "+values.getKey()+" ,   value is  = "+values.getValue());
	    }
	}
}
