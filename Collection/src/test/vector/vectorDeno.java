package test.vector;

import java.util.Vector;

public class vectorDeno {

	public static void main(String[] args) {

     Vector<Integer> v= new Vector<>(2,20);
     
     System.out.println(v.capacity());
     v.add(10);
     v.add(20);
     v.add(30);
     v.add(10);
     v.add(20);
     v.add(30);
     System.out.println(v.capacity());
	}
}
