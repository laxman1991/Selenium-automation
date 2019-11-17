package _TestJavaProgramsSkills;

import java.util.Scanner;

public class PrimenNumber {

	public static Scanner sc;
	public static String yes="";
	public static String userResponse="";
	public static void main(String[] args) {
		do{
        int flag=1; 
		int num;
		sc=new Scanner(System.in);
		System.out.println("Enter nnumber");
		num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=2;
				break;
			}
		}
        if(flag==1)
        {
        	System.out.println("number is prime");
        }
        else{
        	System.out.println("not a prime number");
        }
		System.out.println("Do u want to continue yes or no");
		 userResponse=sc.next();
		}while(userResponse.equals("yes"));
		System.out.println("Exited");
}
}