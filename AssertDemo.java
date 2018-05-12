package AssertDemo.com.Assert;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertDemo {
     
	@Test
	public void TestCase1()
	{
		 System.out.println("Test case started");
         int a,b;
		 a=10;
		 b=20;
		 Assert.assertTrue(a<b,"Not no greates than second number");    
         System.out.println("test case finished");
         
         String str="laxman more";
         
         Assert.assertTrue(str.contains("laxman"));
	}
}
