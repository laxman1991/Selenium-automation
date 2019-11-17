package BasicProgram.softedge;

public class StringTOcharArray {

	public static void main(String[] args) {

		String name="compurer and PC";
		    
	   byte[]bytes= name.getBytes();	
	   String nam=new String(bytes);
	   System.out.println(nam);
		
		
	}
}

