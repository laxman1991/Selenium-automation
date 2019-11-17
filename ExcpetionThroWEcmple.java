package BasicProgram.softedge;

import java.util.Scanner;

public class ExcpetionThroWEcmple {

	public static void main(String[] args) {
	
		int count=0;
		int emp[]= new int[5];
		System.out.println("enter 5 employee age ");
		Scanner scanner= new Scanner(System.in);
		for(int i=0;i<emp.length;i++)
		{
			emp[i]=scanner.nextInt(); 
		}
       for(int i=0;i<emp.length;i++)
       {
    	   if(emp[i]>=30)
    	   {
    		   try{
    		   throw new Exception("Invalid age ");
    		   }
    		   catch(Exception e)
    		   {
    			   System.out.println(e);
    			   count=count+1;
    		   }
    		   //count++;
    	   }
       }
       System.out.println("number of invalid employee count is=="+count);
	}
}
