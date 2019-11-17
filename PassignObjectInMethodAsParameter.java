package BasicProgram.softedge;

public class PassignObjectInMethodAsParameter {

	int length,width;
	
	PassignObjectInMethodAsParameter(int l,int w)
	{
		this.length=l;
		this.width=w;
	}
	public void area(PassignObjectInMethodAsParameter p)
	{
		int areaRectangle=p.length*p.width;
		System.out.println("area is   "+areaRectangle);
	}
	public static void main(String[] args) {
	
		PassignObjectInMethodAsParameter asParameter= new PassignObjectInMethodAsParameter(20, 40);
		
		asParameter.area(asParameter);

	}

}
