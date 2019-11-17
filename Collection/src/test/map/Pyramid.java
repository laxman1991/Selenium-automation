package test.map;

public class Pyramid {

	public static void main(String[] args) {

         int row=3,space=1,k=0;
         for(int i=1;i<=row;i++){
        	
        	 for(space=1;space<=(row-i);space++)
        	 {
        		 System.out.print(" ");
        	 }
        	 while(k!=(2*i-1))
        	 {
        		 System.out.print("*");
        		 k++;
        	 }
        	 k=0;
        	 System.out.println();
         }
	}
}
