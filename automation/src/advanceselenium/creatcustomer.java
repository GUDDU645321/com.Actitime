package advanceselenium;




import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class creatcustomer extends bassclass{
	@Test
	public void creatproject (){
		Assert.fail();
		Reporter.log("customercreat sucessfully",true);
		
	}
	@Test
	public void modifiedproject (){
		Reporter.log("customer modified sucessfully",true);
		
	}
	@Test
	public void deletproject (){
		Reporter.log("customer delet sucessfully",true);
		
	}

}
