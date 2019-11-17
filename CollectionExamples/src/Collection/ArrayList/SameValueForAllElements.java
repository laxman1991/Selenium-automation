package Collection.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SameValueForAllElements {

	public static void main(String[] args) {
		//initialise array with array arrays.aslist
		ArrayList<Integer> li= new ArrayList<Integer>(Arrays.asList(10,20,30,40,50));
		ArrayList<Integer> list= new ArrayList<Integer>(Arrays.asList(10,20));
		//same value for all elemenst in array.
		ArrayList<String> list2= new ArrayList<String>(Collections.nCopies(5,"Laxman"));
		  
		int index=0;
		while(li.size()>index)
		{
			System.out.println(li.get(index));
			index++;
		}
				int index1=0;
				while(list.size()>index1)
				{
					System.out.println(list.get(index1));
					index1++;
				}
				Collections.reverse(li);
				System.out.println(li);
				System.out.println(list2);
	}
}
