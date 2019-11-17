package Com.comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ComparatorExample implements Comparable
{
	String firstname;
	String lastname;
	String bookname;
	
	public ComparatorExample(String firstname, String lastname, String bookname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.bookname = bookname;
	}

	public static void main(String[] args) {
   		
     ArrayList<ComparatorExample> ss= new ArrayList<ComparatorExample>();
     ss.add(new ComparatorExample("laxman", "More", "harry boook"));
     
     Collections.sort(ss);
     for(ComparatorExample  s:ss)
     {
    	 System.out.println(s.firstname+" "+s.lastname+" "+s.bookname);
     }
	}

	@Override
	public int compareTo(Object o) {
	
		
		if(firstname.compareTo(lastname)>0)
		{
			return 1;
		}
		if(firstname.compareTo(lastname)==0 )
		{
		  return	0;
		}else
		{
			return -1;
		}
	}
	}
	


