package BasicProgram.softedge;

public class CharacterOrNot {

	public static void main(String[] args) {
		
		char letter='*';

		if(letter>='a' && letter<='z' || letter>='A' && letter<='Z')
		{
		    	System.out.println(letter+"  ---give character is alphabet  :-");
		}
		else {
			System.out.println("not alphabetes");
		}
	}
}
