package com.ust.keyworddriven.utility;

import java.util.ResourceBundle;

public interface ConfigReader {
	
	// this will read the config.properties from src location
	public static final ResourceBundle rb = ResourceBundle.getBundle("config");
	
	public static String getXLSPath(){
		return rb.getString("xlspath");
	}
	
}
