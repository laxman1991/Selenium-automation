package BasicProgram.softedge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class mapHighestMarks {

	public static void main(String[] args) {
		

		Scanner scanner= new  Scanner(System.in);
		Map<String,Integer> ss= new HashMap<String,Integer>();

		for(int i=0;i<3;i++)
		{
			System.out.println("enter subect name");
			String subect=scanner.next();
			System.out.println("enter marks");
			int marks=scanner.nextInt();
			ss.put(subect, marks);
		}
     	Set<String>	sub=ss.keySet();
        
     	Iterator<String> itr=sub.iterator();
     	int highest=0;
     	int mark=0;
     	String subb=null;
     	while(itr.hasNext())
     	{
        	 subb=itr.next();
     	     mark=ss.get(subb);
     	   if(mark>highest)
     	   {
     		   highest=mark;
     	   }
     	}
     	System.out.println(subb);
     	System.out.println(highest);
	}
}
