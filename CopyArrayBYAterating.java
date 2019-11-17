package BasicProgram.softedge;

import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayBYAterating {

	
	public static void main(String[] args) {
		int array[]= new int[5];
		int copyarray[]= new int[5];
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Arrau elemsnts");
		for(int i=0;i<5;i++)
		{
		  array[i]= scanner.nextInt();
		}
		for(int k=0;k<5;k++)
			{
			   copyarray[k]=array[k];
			}
		System.out.println("after copying array elemensts are:"+Arrays.toString(copyarray));
	}
}
