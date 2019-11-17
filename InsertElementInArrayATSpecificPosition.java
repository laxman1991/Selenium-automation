package BasicProgram.softedge;

import java.util.Scanner;

public class InsertElementInArrayATSpecificPosition {

	public static void main(String[] args) {
		
		int array[]= new int[5];
		int index_position=0;
		int addValue;
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter Array elemsnts");
		for(int i=0;i<5;i++)
		{
		  array[i]= scanner.nextInt();
		}
		System.out.println("enter new value to be inserted into array.");
		addValue=scanner.nextInt();
		System.out.println("Enter Index position where value is to be inserted");
		index_position=scanner.nextInt();
		for(int i=array.length-1;i>index_position;i--)
		{
			if(i==index_position)
			{
			array[index_position]=addValue;
		    }
		    }
		System.out.println("aftre addign new value the array is like");
        for(int i=0;i<array.length;i++)
        {
	    System.out.println(array[i]);
        }
}
}