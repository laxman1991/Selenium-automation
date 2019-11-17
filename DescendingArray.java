package BasicProgram.softedge;

import java.util.Scanner;

public class DescendingArray {

	public static void main(String[] args) {
	     Scanner scanner= new Scanner(System.in);
	     int num[]=new int[5];
	     System.out.println("Enter array elements");
	     for(int i=0;i<num.length;i++)
	     {
	    	 num[i]=scanner.nextInt();
	     }
	     System.out.println("array number are:");
	    for(int i=0;i<num.length;i++)
	    {
	    	System.out.println(num[i]);
	    }
         for(int i=0;i<5;i++)
         {
        	 for(int k=i+1;k<5;k++)
        	 {
        		 if(num[i]<num[k])
        		 {
        			 int temp;
        			 temp=num[i];
        			 num[i]=num[k];
        			 num[k]=temp;
        		 }
        	 }
         }
         System.out.println("Arrays are in descending order");
          for(int i=0;i<5;i++)
           {
               System.out.println(num[i]);
           }	
}
}
