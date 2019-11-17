package BasicProgram.softedge;
public class FibonacciSeries {

	static int f1=0,f2=1,f3=0;
	public static void fib(int num)
	{
		if(num>0)
		{
			f3=f1+f2;
		    f1=f2;
		    f2=f3;
		    System.out.print(" , "+f3);
		    fib(num-1);
    	}
	}
	public static void main(String[] args) {
		int num=3;
		System.out.print(f1+" , "+f2);
		fib(num-2);
}
}
