package Collection.ArrayList;
import java.util.ArrayList;
import java.util.List;
public class CollectionAdd {

	public static void main(String[] args) {

		ArrayList<String> list1= new ArrayList<String>(3); 
		list1.add("laxmna");
		list1.add("neha");
		list1.add("priyanka");
		list1.add("sneha");

			list1.add("prince");
			System.out.println(list1);
		
		list1.ensureCapacity(10);
		/*
		ArrayList<String> clones=(ArrayList<String>)list1.clone();	
		System.out.println("before remove");
		System.out.println(clones);
		System.out.println("after remove")*/;

		//clones.removeAll(clones);
		
	//	System.out.println(clones);
		/*
        List<String> list2= new ArrayList<String>(); 

        list2.add("laxmna");
		list2.add("2");
		list2.add("3");
		list2.add("4");
		List<String> list3= new ArrayList<String>(); 
		for(String s:list1)
		{
		list3.add(list2.contains(s)?"Yes":"no");
		}
        System.out.println(list3);		
*/	}
}
