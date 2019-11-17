package BasicProgram.softedge;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
      int sum=0;
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
     for(int i=0;i<arr.length;i++)
     {
    	 sum=sum+arr[i];
     }
     System.out.println("sum of array elememts:");
     System.out.println(sum);
     System.out.println("finding average value of array elements");
     
     int countTotalArayElemnts=arr.length;
     double average=sum/countTotalArayElemnts;
     System.out.println("average of array elemets "+average);
     
     
	}
	}
