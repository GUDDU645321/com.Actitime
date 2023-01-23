package com.crm.Actitime.Genericlibery;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDatafromProperty {
	public String readdataproperty(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./TestData/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		 String value = p.getProperty(key);
		 return value;
	}

}
