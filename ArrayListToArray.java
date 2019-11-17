package BasicProgram.softedge;

import java.util.ArrayList;

public class ArrayListToArray {

	public static void main(String[] args) {
	 	
		
		ArrayList<Integer> arrayList= new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        Integer arr[]=new Integer[arrayList.size()];
        arrayList.toArray(arr);
        for(Integer inn:arr)
        {
     	   System.out.println(inn);
        }
        
	}
}