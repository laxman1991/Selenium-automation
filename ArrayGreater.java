package BasicProgram.softedge;

import java.util.Scanner;

public class ArrayGreater {

	public static void main(String[] args) {

     Scanner scanner= new Scanner(System.in);
     
     int num[]=new int[10];
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
    int greater=0;
    for(int i=0;i<num.length;i++)
    {
    	if(num[i]>greater)
    	{
    		greater=num[i];
    	}
    }
    System.out.println("Greater number is:"+greater);
    System.out.println("Array in descending order");
    for(int i=0;i<num.length;i++)
    {
    	for(int k=i+1;k<i;k++)
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
    for(int i=0;i<num.length;i++)
    {
    	System.out.println(num[i]);
    }
    System.out.println("enter cgar");
  
    
    
    scanner.close();
	}
}
