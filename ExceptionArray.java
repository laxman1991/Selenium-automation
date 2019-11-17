package BasicProgram.softedge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionArray {

	public static void main(String[] args) {
		
		try
		{
		Scanner scanner = new Scanner(System.in);
		
        int num[]=new int[5];
        System.out.println("enter 5 inetegers");
        for(int i=0;i<5;i++)
        {
        	num[i]=scanner.nextInt();
        }
        for(int i=0;i<=5;i++)
        {
        	System.out.println(num[i]); 
        }
     	}
		 catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println(e.toString());
        }
		 catch(InputMismatchException e)
        {
			 System.out.println("Please enter proper input");
			 e.printStackTrace();
        }
		System.out.println("Out of danger");
}
}
