package BasicProgram.softedge;
import java.util.Arrays;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		
		int[] arr= {10,2,25,56,63};
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++)
		{
		arr[i]=scanner.nextInt();
     	}
        System.out.println("Displaying Array Elements:");
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println(arr[i]);
        }
        System.out.println("Sorting array Elements:");
        for(int i=0;i<arr.length;i++)
        {
        	for(int k=i+1;k<5;k++)
        	{
        		int temp;
        		if(arr[i]>arr[k])
        		{
        			temp=arr[i];
        			arr[i]=arr[k];
        			arr[k]=temp;
        		}
        	}
        }
        System.out.println("Decending array is as follows:");
        for(int i=0;i<5;i++)
        {
        System.out.println(arr[i]);
        }
	}
}

