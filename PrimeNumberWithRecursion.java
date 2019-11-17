package BasicProgram.softedge;
import java.util.Scanner;

public class PrimeNumberWithRecursion {
    
	     public static boolean primeNumber(int num)
	     {
	    	
	    	 if(num==0 || num==1)
	    	 {
	    		 System.out.println("number is not prime number");
	    		 	    	 }
	    	 else
	    	 {
	    		 for(int i=2;i<num;i++)
	    		 {
	    			 if(num%i==0)
	    			 {
	    			return false;
	    			 }
	    		 }	    	 
	    	}
	    	 return true;
	     }
	
	public static void main(String[] args) {
		
		Scanner scanner= new  Scanner(System.in);
		System.out.println("Enter number to check whether it is prime or not.");
		int num=scanner.nextInt();
		System.out.println(" prime number check:- "+primeNumber(num));
	}
}
