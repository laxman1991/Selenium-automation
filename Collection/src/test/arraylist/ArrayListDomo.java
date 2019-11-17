package test.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

	public class ArrayListDomo {

	public static void main(String[] args) {
	
ArrayList<Integer> arr= new ArrayList<Integer>();
List<Integer> l=Collections.synchronizedList(new ArrayList<Integer>());

synchronized (l) {
	 arr.add(10);
	  System.out.println("Enter array elements");
	  Scanner sc= new Scanner(System.in);
	  for(int i=0;i<5;i++)
	  {
		  int num=sc.nextInt();
		  arr.add(num);
	  }
	  System.out.println("array elemenets are "+arr);
	  arr.size();
	  arr.get(0);
	  System.out.println(arr.isEmpty());
	  arr.remove(1);
	  System.out.println(arr);
}
	}
}
