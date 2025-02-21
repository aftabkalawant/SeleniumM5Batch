package com.crm.fileUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
     public static String getData(String key) throws IOException {
    	 Properties prop = new Properties();
    	 FileInputStream file = new FileInputStream(".\\\\src\\\\test\\\\resources\\\\DemoLogin.properties");
    	 prop.load(file);
    	 String data = prop.getProperty(key);
		return data;
     }
}
