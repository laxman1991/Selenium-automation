package BasicProgram.softedge;

import java.util.Scanner;

public class ArraySearchValue {

	public static void main(String[] args) {
		
		int sum=0,flag=0;
	     int [] arr= new int[5];
	     Scanner scanner= new Scanner(System.in);
	     for(int i=0;i<arr.length;i++)
	     {
	     arr[i]=scanner.nextInt();
	     }
	     System.out.println("display array");
	     for(int i=0;i<arr.length;i++)
	     {
	    	 System.out.println(arr[i]);
	    	 	    	 	    	 
	     }
	     System.out.println("Enter number to be search in array ");
	     int num=scanner.nextInt();
	     int location=0;
	     for(int i=0;i<5;i++)
	     {
	    	 if(arr[i]==num)
 	    	 {
                flag=1;  
               location=i;
               System.out.println("value of i is "+i);
               System.out.println("value of arr[i] "+arr[i]);
	    	 }
	     }
	     if(flag==1)
	     {
	    	 System.out.println("number is found at location = "+location);
	     }else{
	    	 System.out.println("number is not found");
	     }
	}
}
