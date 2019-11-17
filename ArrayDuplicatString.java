package BasicProgram.softedge;

public class ArrayDuplicatString {

	public static void main(String[] args) {
		
		String[] array={"laxman","more","laxman","neha","laxman"};
		
		for(int i=0;i<array.length-1;i++)
		{
			for(int k=i+1;k<array.length;k++)
			{
				if(array[i].equals(array[k]) && i!=k)
				{
					System.out.println(array[k]); 
				}
			}
				
		}
	}

}
