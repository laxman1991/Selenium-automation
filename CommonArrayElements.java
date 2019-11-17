package BasicProgram.softedge;

public class CommonArrayElements {

	public static void main(String[] args) {
	
		int arr1[]={10,30,40,50};
		int arr2[]={20,30,40};
		 
		for(int i=0;i<arr1.length;i++)
		{
			for(int k=0;k<arr2.length;k++)
			{
				if(arr1[i]==arr2[k])
				{
					System.out.println(arr2[k]);
				}
			}
	  	}
		}
	}


