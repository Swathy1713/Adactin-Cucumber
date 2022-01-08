package com.helper.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws Throwable {
		File f = new File("C:\\Users\\admin\\eclipse-workspace\\Adactin_Cucumber\\src\\test\\java\\com\\property\\com\\adactin.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();
		p.load(fis);
	}
	
	public String getBrowser() {
	   String brow = p.getProperty("browser");
	   return brow;
	}
	
	public String getUrl() {
		String url = p.getProperty("url");
		return url;
	}

	public String getUname() {
	  String uname = p.getProperty("username");
	  return uname;
	}
	
	public String getpass() {
		String pass = p.getProperty("password");
		return pass;
	}
	
	public String getFname() {
		String fname = p.getProperty("firstname");
		return fname;
	}
	
	public String getLname() {
		String lname = p.getProperty("lastname");
		return lname;
	}
	
	public String getCardnum() {
		String cardnum = p.getProperty("cardnum");
		return cardnum;
	}
	
	public String getcardtype() {
		String ctype = p.getProperty("cardtype");
		return ctype;
	}
	
	public String getCvv() {
		String cvv = p.getProperty("cvv");
		return cvv;
	}
}
