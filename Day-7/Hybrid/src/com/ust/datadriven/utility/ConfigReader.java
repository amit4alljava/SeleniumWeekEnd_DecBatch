package com.ust.datadriven.utility;

import java.util.ResourceBundle;

public interface ConfigReader {
	/*
	 * To read the Config.properties file , we need a readymate class
	 * and that class is ResourceBundle
	 */
	final static ResourceBundle rb = ResourceBundle.getBundle("config");
	
	public static String getXLSPath(){
		// It is reading the xlspath key and giving the value of xlspath key
		return rb.getString("xlspath");
	}
	
	public static String getDriver(){
		// It is reading the xlspath key and giving the value of xlspath key
		return rb.getString("drivername");
	}
	
	public static String getConnectionURL(){
		// It is reading the xlspath key and giving the value of xlspath key
		return rb.getString("connectionurl");
	}
	public static String getUserid(){
		// It is reading the xlspath key and giving the value of xlspath key
		return rb.getString("userid");
	}
	public static String getPassword(){
		// It is reading the xlspath key and giving the value of xlspath key
		return rb.getString("password");
	}
	
	public static String getSQL(){
		// It is reading the xlspath key and giving the value of xlspath key
		return rb.getString("sql");
	}
	
	public static String getChromeDriverPath(){
		return rb.getString("chromedriverlocation");
	}
	
	public static String getWebDriver(){
		return rb.getString("webdriver");
	}
	
	public static String getURL(){
		return rb.getString("url");
	}
	
	
	
	
	public static int getRow(){
		return Integer.parseInt(rb.getString("row"));
	}
	
	public static int getColumn(){
		return Integer.parseInt(rb.getString("column"));
	}

}
