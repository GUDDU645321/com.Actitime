package advanceselenium;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng {
	@Test( priority=0,invocationCount =5)
	public void creatcustomer()
	{
		Reporter.log("customer created",true);
	}



	@Test(priority = 2)
	public void editcustomer()
	{
		Reporter.log("customer edited",true);
	}



	@Test(priority = 1)
	public void deletecustomer()
	{
		Reporter.log("customer deleted",true);
	}
}

