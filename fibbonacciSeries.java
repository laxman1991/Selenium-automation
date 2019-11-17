package _TestJavaProgramsSkills;
public class fibbonacciSeries {
	 public static int f1=0,f2=1,f3;
	public static void fib(int fno)
	{
     while(fno>0)	 
     {
      f3=f1+f2;
   	  f1=f2;
   	  f2=f3;
   	  System.out.print(","+f3);
   	  fno--;
     }
	}
	public static void main(String[] args) {
		int num=10;
		System.out.print(f1+" "+f2);
		fib(num-2);
	}
}
