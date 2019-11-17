package BasicProgram.softedge;

public class ArrayDuplicateValues {

	public static void main(String[] args) {
		
		int[]duplicate= {10,20,20,20,20};
		
	
		for(int i=0;i<duplicate.length-1;i++)
		{
			for(int k=i+1;k<duplicate.length;k++)
			{
				if((duplicate[i]==duplicate[k]) && (i!=k))
				{
					System.out.println("duplicate elemest are:--"+duplicate[k]);
				}
			}
		}
      }
	}
