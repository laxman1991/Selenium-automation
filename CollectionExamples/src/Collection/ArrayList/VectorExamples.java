package Collection.ArrayList;
import java.util.Vector;

public class VectorExamples {

	public static void main(String[] args) {
		
	Vector<Integer> vector= new Vector<>(10);
	vector.addElement(10);
	vector.addElement(20);
	vector.addElement(30);
	vector.addElement(30);
	vector.addElement(40);
	
	 vector.setSize(20);
	 System.out.println(vector.size());
     System.out.println(vector.elementAt(2));
     vector.insertElementAt(100, 1);
     System.out.println(vector); 
	}
}

