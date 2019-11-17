package BasicProgram.softedge;

public class BreakStatement {

	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			if(i%13==0)
			{
				continue;
			}else{
			System.out.println(i);
		}
	}
	}
}
