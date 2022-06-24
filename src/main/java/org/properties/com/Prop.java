package org.properties.com;

import java.io.FileReader;
import java.util.Properties;

public class Prop {
	static Properties prop;
	
	public static void setupProperties() throws Exception {
		FileReader file = new FileReader(".\\src\\main\\resources\\Properties\\config.properties");
		prop = new Properties();
		prop.load(file);
	}
	
	public static String getProperty(String propertyName) {
		return prop.getProperty(propertyName);
	}
}

