package com.crm.Actitime.testscripts;

import org.testng.annotations.Test;

import com.crm.Actitime.Genericlibery.Baseclass;
import com.crm.Actitime.objectRepository.Taskpage;


public class Creatcustomer extends Baseclass{
	@Test
	public void creatcustomer() {
		Homepage hp = new Homepage(driver);
		hp.getTasklink().click();
		
		Taskpage tp = new Taskpage(driver);
		tp.creatcustomer();
	}

}
