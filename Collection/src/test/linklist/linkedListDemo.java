package test.linklist;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Spliterator;

public class linkedListDemo {

	public static void main(String[] args) {
	
		LinkedList<String> list=new LinkedList<String>();
		System.out.println("Enter names to add in linkList");
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			String names=sc.nextLine();
			list.add(names);
		}
		System.out.println(list);
    
		
		
	}
}
