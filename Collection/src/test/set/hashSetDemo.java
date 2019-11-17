package test.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class hashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> set= new HashSet<Integer>();
		set.add(5);
		set.add(1);
		set.add(2);
		/*set.forEach(System.out::println);

		LinkedHashSet<Integer> linkhash=new LinkedHashSet<>();
		linkhash.add(10);
		linkhash.add(20);
		linkhash.add(null);
		  
		Iterator<Integer> s=linkhash.iterator();
		
		while(s.hasNext())
		{
			System.err.println(s.next());
		}
		*/
		TreeSet<Integer> tree= new TreeSet<Integer>(set);
		/*tree.add(10);
		tree.add(20);
		tree.add(null);
		System.out.println(tree);
*/
        Iterator<Integer> s=tree.iterator();
		
		while(s.hasNext())
		{
			System.out.println(s.next());
		}
		
	}
}
