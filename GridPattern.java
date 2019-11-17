package BasicProgram.softedge;

public class GridPattern {

	public static void main(String[] args) {
		int [][]a = new int[10][10];   
		for(int i=0;i<10;i++)
		{
			for(int k=0;k<10;k++)
			{
				System.out.printf("-", a[i][k]);
			}
			System.out.println();
		}
	}
}

