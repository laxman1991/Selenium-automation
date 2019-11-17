package BasicProgram.softedge;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num=0;
		int flag=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				//System.out.println(num+" num is not prime");
			    flag=1;
			}
		}
          if(flag==0)
          {
        	  System.out.println(num+"   number is prime number");
          }
	}

}
