package BasicProgram.softedge;

public class MAXandMINFromArray {

	public static void main(String[] args) {
		
		int arr[]={10,120,130,140};
		
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}
}
