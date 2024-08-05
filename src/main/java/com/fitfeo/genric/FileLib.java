package com.fitfeo.genric;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This is a genric class for data driven testing
 * 
 * @author Gireesh
 *
 */
public class FileLib {
	/**
	 * This is a genric method for reading the data from property file.
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/data/commondata.property");
		Properties p = new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}

}
