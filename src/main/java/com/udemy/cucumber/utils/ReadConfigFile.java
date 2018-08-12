package com.udemy.cucumber.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import gherkin.deps.net.iharder.Base64.InputStream;

public class ReadConfigFile {
	Properties prop=null;
	InputStream inputStream=null;
	
	public ReadConfigFile() throws IOException {
		/*inputStream= (InputStream) ReadConfigFile.class.getClassLoader().getResourceAsStream(Constants.CONFIG_FILE);
		prop = new Properties();
		prop.load(inputStream);*/
		FileInputStream io = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\udemy\\cucumber\\properties\\config.properties");
		prop = new Properties();
		prop.load(io);
	}
	
	public String getBrowser() {
		return prop.getProperty("browser");
		
	}

}
