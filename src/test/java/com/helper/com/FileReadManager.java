package com.helper.com;

public class FileReadManager {
	
	private FileReadManager() {

	}

	public Configuration_Reader getInstanceCR() throws Throwable   {
		Configuration_Reader cr = new Configuration_Reader();
		return cr;
	}
	
	public static FileReadManager getInstanceFR() {
		FileReadManager fr = new FileReadManager();
		return fr;

	}
	
	
	
}
