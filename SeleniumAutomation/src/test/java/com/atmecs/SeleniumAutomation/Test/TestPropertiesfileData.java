package com.atmecs.SeleniumAutomation.Test;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.atmecs.readTestData.ReadPropertiesfile;

public class TestPropertiesfileData extends  ReadPropertiesfile {

public static void main(String[] args) {
	TestPropertiesfileData ref = new TestPropertiesfileData();
	try {
		ref.getTestData();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

	public void getTestData() throws IOException {
	
		 String name = getData("userName");
		 System.out.println(name);
		
	}


}

