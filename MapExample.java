package BasicProgram.softedge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
	
		Scanner scanner= new  Scanner(System.in);
		Map<String,Integer> ss= new HashMap<String,Integer>();

		for(int i=0;i<=4;i++)
		{
			System.out.println("enter user name");
			String username=scanner.next();
			
			System.out.println("enter user password");
			int password=scanner.nextInt();
			
			ss.put(username, password);
		}
		//try{
		System.out.println("enter username to get password");
		String user=scanner.next();
		int pass= ss.get(user);
		System.out.println(pass);
        
		Set<String> s=ss.keySet();

		Iterator itr=s.iterator();
		while(itr.hasNext())
		{
			
		}
		
		/*	}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
*/	}
}
