package com.atmecs.readTestData;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesfile {
	
	static Properties properties;
	public static void loadData() throws IOException {
		properties = new Properties();
		File file = new File("src\\lib\\test.properties");
		FileReader reader  = new FileReader(file);
		properties.load(reader);
	}
	public static String getData(String data) throws IOException {
		loadData();
		String filedata = properties.getProperty(data);
		return filedata;
		
	}

}
