package BasicProgram.softedge;

import java.util.Scanner;

public class MethodOverloadingArea {

	
	public void calArea(float a,double b)
	{
		double Reactarea=a*b;
		System.out.println("area of rectangle is "+Reactarea);
	}
	public void calArea(float r)
	{
		double areaCircle=2*3.14*r;
		System.out.println("Area of cirlce is "+areaCircle);
	}
	public static void main(String[] args) {
		MethodOverloadingArea areaC= new MethodOverloadingArea();
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter length of rectangle");
		float length=scanner.nextFloat();
		System.out.println("enter width of rectangle");
		double  width=scanner.nextDouble();
		areaC.calArea(length,width);
		System.out.println("enter radius of circle");
		float radius=scanner.nextFloat();
		
		areaC.calArea(radius);
	}
}
