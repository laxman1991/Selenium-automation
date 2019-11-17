package BasicProgram.softedge;
import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
	     int num[]=new int[10];
	     int num1[]= new int[10];
	     System.out.println("Enter array elements");
	     for(int i=0;i<num.length;i++)
	     {
	    	 num[i]=scanner.nextInt();
	     }
	     for(int k=0;k<num1.length;k++)
	     {
	    	 if(num[k]%10==0)
	    	 {
	    		 num1[k]=num[k];
	    	 }
	         System.out.println(num1[k]);
	     }
	}
}



