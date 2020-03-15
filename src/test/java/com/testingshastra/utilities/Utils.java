package com.testingshastra.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utils {
	public static String getProperty(String key) {
		String value =null;
		String path=System.getProperty("User.dir");
		System.out.println(path);
		
		try {
			FileInputStream fis=new FileInputStream(path+"/src/test/resources/OR.properties");
			Properties prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("Object Repository not found");
			
		} catch(IOException e) {
			System.out.println("Unable to load properties file");
			e.printStackTrace();
		}
		return value;
	}
}
