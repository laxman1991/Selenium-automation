package BasicProgram.softedge;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class GreatestInteger {

	public static void main(String[] args) {
	
		//Scanner scanner= new Scanner(System.in);
		//int num=scanner.nextInt();
		Set<Integer> set= new TreeSet<Integer>();
		
		for(int i=1;i<=10;i++)
		{
			set.add(i);
		}
		Iterator<Integer> itr=set.iterator();
		
		while(itr.hasNext())
		{
		    int i=(int)itr.next();
			int greatest=0;
           if(i>greatest)
           {
        	   greatest=i;
           }
           System.out.println(greatest);
		}
	}
}
