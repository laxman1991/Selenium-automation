package BasicProgram.softedge;

import java.util.Scanner;

public class InheritanceChild extends InheritanceParent{

	
	public void suareCal(int b)
	{ 
		
		int result=b*b;
		System.out.println("square of number is :"+result);
	}
	public static void main(String[] args) {
		
		InheritanceChild child= new  InheritanceChild();
		Scanner scanner= new Scanner(System.in);
		int a,b;
		System.out.println("enter first numbers");
		a=scanner.nextInt();
		child.evenOddCheck(a);
		System.out.println("enter second numbers");
		b=scanner.nextInt();
		//c=scanner.nextInt();
		child.suareCal(b);
		InheritanceParent inheritanceParent= new InheritanceParent();
		
		InheritanceChild child2= (InheritanceChild)inheritanceParent;	
		child2.suareCal(b);
		child2.evenOddCheck(1);
	}
}
