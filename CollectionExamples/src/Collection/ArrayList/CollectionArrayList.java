package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> arrayList= new ArrayList<Integer>();
		ArrayList<Integer> arrayList1= new ArrayList<Integer>();
		  
		arrayList.add(12);
		arrayList.add(13);
		arrayList.add(14);
		arrayList.add(15);
		arrayList.add(11);
		System.out.println(arrayList.set(1,100));
		System.out.println(arrayList);
		//addingng elemet in second array
		arrayList1.add(10);
		arrayList1.add(20);
		arrayList1.add(30);
		arrayList1.add(40);
		arrayList1.add(50);
		
		System.out.println(arrayList.size());;
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.remove(0));;
		System.out.println(arrayList);
		System.out.println(arrayList.contains(15));
		System.out.println(arrayList.subList(2,4));
		System.out.println(arrayList.subList(0,4));

		System.out.println(arrayList.indexOf(11));
		
		arrayList.addAll(arrayList1);
		System.out.println("displaying alltwo array elements:");
		System.out.println(arrayList); 
		ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(10,20,30)); 
		System.out.println(list);
		  long[] a= {10,20,30,42};
           System.out.println(Arrays.toString(a));	
           
	}
}


